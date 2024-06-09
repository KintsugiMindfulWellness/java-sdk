package com.kintsugi.client.example;

import com.kintsugi.client.openapi.api.FeedbackApi;
import com.kintsugi.client.openapi.api.InitiateApi;
import com.kintsugi.client.openapi.api.PredictGetApi;
import com.kintsugi.client.openapi.api.PredictSubmitV2Api;
import com.kintsugi.client.openapi.invoker.ApiException;
import com.kintsugi.client.openapi.model.*;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

public class Original {
    public static void main(String[] args) throws ApiException {
        //Configuration parameters
        String xApiKey = System.getenv("X_API_KEY");
        String userId = System.getenv("USER_ID");
        String url = System.getenv("URL");
        boolean isInitiated = true;

        //Arguments
        File audioFile = new File("/Users/jackson/Downloads/test_audio.wav");
        BigDecimal allowedSampleRate = BigDecimal.valueOf(44100);
        SessionSessionMetadata metadata = new SessionSessionMetadata()
                .age(39)
                .gender(SessionGender.MALE_GENDER);

        //API instantiation
        InitiateNewInitiateRequest body = new InitiateNewInitiateRequest();
        body.setIsInitiated(isInitiated);
        body.setUserId(userId);
        body.setMetadata(metadata);

        InitiateApi api = new InitiateApi();
        api.getApiClient().setBasePath(url);
        InitiateResponseInitiate initiateResponse = api.initiatePost(xApiKey, body);

        //Prediction using all arguments
        PredictSubmitV2Api predictApi = new PredictSubmitV2Api();
        PredictResponsePredictionInitiated predict_response = predictApi.predictionPost(
                xApiKey, audioFile, initiateResponse.getSessionId(), allowedSampleRate
        );
        System.out.println(predict_response);

        //Get prediction by session ID
        PredictGetApi predictGetApi = new PredictGetApi();
        PredictResponsePredictionRecordBySession session_response = predictGetApi.predictSessionsSessionIdGet(
                initiateResponse.getSessionId(), xApiKey
        );

        System.out.println("Get prediction by session response:" + session_response);

        //Get prediction by user ID
        List<PredictResponsePredictionRecord> user_response = predictGetApi.predictUsersUserIdGet(userId, xApiKey);

        System.out.println("Get prediction by user_response:" + user_response);

        FeedbackApi feedbackApi = new FeedbackApi();

        //Depression feedback
        FeedbackFeedbackRequestPredictionValidBinaryString data = new FeedbackFeedbackRequestPredictionValidBinaryString()
                .data(PredictionValidBinaryString.False)
                .sessionId(initiateResponse.getSessionId());
        feedbackApi.feedbackDepressionBinaryPatch(xApiKey, data);

        //PHQ-2 feedback
        FeedbackRequestPHQ2 dataPhq2 = new FeedbackRequestPHQ2()
                .sessionId(initiateResponse.getSessionId())
                .addDataItem(PredictionValidFeedbackInt.FeebackVal1)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal2);
        feedbackApi.feedbackPhq2Patch(xApiKey, dataPhq2);

        //PHQ-9 feedback
        FeedbackRequestPHQ9 dataPhq9 = new FeedbackRequestPHQ9()
                .sessionId(initiateResponse.getSessionId())
                .addDataItem(PredictionValidFeedbackInt.FeebackVal0)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal1)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal2)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal3)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal0)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal1)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal2)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal3)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal0);
        feedbackApi.feedbackPhq9Patch(xApiKey, dataPhq9);

        //GAD-7 feedback
        FeedbackRequestGAD7 dataGad7 = new FeedbackRequestGAD7()
                .sessionId(initiateResponse.getSessionId())
                .addDataItem(PredictionValidFeedbackInt.FeebackVal0)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal1)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal2)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal3)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal0)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal1)
                .addDataItem(PredictionValidFeedbackInt.FeebackVal2);
        feedbackApi.feedbackGad7Patch(xApiKey, dataGad7);
    }
}
