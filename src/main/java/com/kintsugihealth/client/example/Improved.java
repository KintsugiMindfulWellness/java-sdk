package com.kintsugihealth.client.example;

import com.kintsugihealth.client.Api;
import com.kintsugihealth.client.openapi.invoker.ApiException;

import java.io.File;

public class Improved {
    public static void main(String[] args) throws ApiException {
        String xApiKey = System.getenv("X_API_KEY");
        String userId = System.getenv("USER_ID");
        String url = System.getenv("URL");
        boolean isInitiated = true;

        Api api = new Api(xApiKey, url, userId, isInitiated);

        File audioFile = new File("/Users/jackson/Downloads/test_audio.wav");
        String sessionId = api.prediction().predict(audioFile);

        System.out.println("Prediction SessionId: " + sessionId);

    }
}
