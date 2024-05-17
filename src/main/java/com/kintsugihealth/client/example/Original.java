package com.kintsugihealth.client.example;

import com.kintsugihealth.client.openapi.api.FeedbackApi;
import com.kintsugihealth.client.openapi.api.InitiateApi;
import com.kintsugihealth.client.openapi.api.PredictGetApi;
import com.kintsugihealth.client.openapi.api.PredictSubmitV1Api;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.*;

import java.io.File;
import java.util.List;

public class Original {
    public static void main(String[] args) throws ApiException {
        String xApiKey = System.getenv("X_API_KEY");
        String userId = System.getenv("USER_ID");
        String url = System.getenv("URL");
        boolean isInitiated = true;

        InitiateNewInitiateRequest body = new InitiateNewInitiateRequest();
        body.setIsInitiated(isInitiated);
        body.setUserId(userId);

        InitiateApi api = new InitiateApi();
        api.getApiClient().setBasePath(url);
        InitiateResponseInitiate initiateResponse = api.initiatePost(xApiKey, body);

        PredictSubmitV1Api predictApi = new PredictSubmitV1Api();
        File audioFile = new File("/Users/jackson/Downloads/test_audio.wav");
        PredictResponsePredictionInitiated predict_response = predictApi.predictionPost(
                xApiKey, audioFile, initiateResponse.getSessionId(), null
        );

        PredictGetApi predictGetApi = new PredictGetApi();
        PredictResponsePredictionRecordBySession session_response = predictGetApi.predictSessionsSessionIdGet(
                initiateResponse.getSessionId(), xApiKey
        );

        System.out.println("Get prediction by session response:" + session_response);

        List<PredictResponsePredictionRecord> user_response = predictGetApi.predictUsersUserIdGet(
                userId, xApiKey
        );

        System.out.println("Get prediction by user_response:" + user_response);

        FeedbackApi feedbackApi = new FeedbackApi();


        FeedbackFeedbackRequestPredictionValidBinaryString data = new FeedbackFeedbackRequestPredictionValidBinaryString()
                .data(PredictionValidBinaryString.False)
                .sessionId(initiateResponse.getSessionId());
        feedbackApi.feedbackDepressionBinaryPatch(xApiKey, data);

        FeedbackRequestPHQ2 dataPhq2 = new FeedbackRequestPHQ2()
                .sessionId(initiateResponse.getSessionId())
                .addDataItem(PredictionValidPHQInt.PHQVal1)
                .addDataItem(PredictionValidPHQInt.PHQVal2);
        feedbackApi.feedbackPhq2Patch(xApiKey, dataPhq2);

        FeedbackRequestPHQ9 dataPhq9 = new FeedbackRequestPHQ9()
                .sessionId(initiateResponse.getSessionId())
                .addDataItem(PredictionValidPHQInt.PHQVal1)
                .addDataItem(PredictionValidPHQInt.PHQVal2)
                .addDataItem(PredictionValidPHQInt.PHQVal0)
                .addDataItem(PredictionValidPHQInt.PHQVal1)
                .addDataItem(PredictionValidPHQInt.PHQVal2)
                .addDataItem(PredictionValidPHQInt.PHQVal0)
                .addDataItem(PredictionValidPHQInt.PHQVal1)
                .addDataItem(PredictionValidPHQInt.PHQVal2)
                .addDataItem(PredictionValidPHQInt.PHQVal0);
        feedbackApi.feedbackPhq9Patch(xApiKey, dataPhq9);

        System.out.println(predict_response);
    }
}
