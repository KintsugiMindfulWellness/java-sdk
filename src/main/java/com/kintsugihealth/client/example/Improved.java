package com.kintsugihealth.client.example;

import com.kintsugihealth.client.Api;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionRecord;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionRecordBySession;
import com.kintsugihealth.client.openapi.model.PredictionValidPHQInt;

import java.io.File;
import java.util.Arrays;
import java.util.List;

public class Improved {
    public static void main(String[] args) throws ApiException {
        //Configuration Parameters
        String xApiKey = System.getenv("X_API_KEY");
        String userId = System.getenv("USER_ID");
        String url = System.getenv("URL");
        boolean isInitiated = true;

        //API Instantiation
        Api api = new Api(xApiKey, url, userId, isInitiated);

        //Prediction
        File audioFile = new File("/Users/jackson/Downloads/test_audio.wav");
        String sessionId = api.prediction().predict(audioFile);
        System.out.println("Prediction SessionId: " + sessionId);

        //Get Prediction By Session ID
        PredictResponsePredictionRecordBySession predictionBySession = api.prediction().getPredictionBySession(sessionId);
        System.out.println(predictionBySession);

        //Get Prediction By User ID
        List<PredictResponsePredictionRecord> predictionsByUser = api.prediction().getPredictionsByUser(userId);
        System.out.println(predictionsByUser);

        //Prediction Feedback
        api.feedback().depression(sessionId, true);

        //PHQ2 Feedback
        List<PredictionValidPHQInt> answersPHQ2 = Arrays.asList(
                PredictionValidPHQInt.PHQVal1,
                PredictionValidPHQInt.PHQVal2
        );
        api.feedback().phq2(sessionId, answersPHQ2);

        //PHQ9 Feedback
        List<PredictionValidPHQInt> answersPHQ9 = Arrays.asList(
                PredictionValidPHQInt.PHQVal1,
                PredictionValidPHQInt.PHQVal2,
                PredictionValidPHQInt.PHQVal0,
                PredictionValidPHQInt.PHQVal1,
                PredictionValidPHQInt.PHQVal2,
                PredictionValidPHQInt.PHQVal0,
                PredictionValidPHQInt.PHQVal1,
                PredictionValidPHQInt.PHQVal2,
                PredictionValidPHQInt.PHQVal0
        );
        api.feedback().phq9(sessionId, answersPHQ9);
    }
}
