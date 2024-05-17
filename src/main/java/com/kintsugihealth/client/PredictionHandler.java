package com.kintsugihealth.client;

import com.kintsugihealth.client.openapi.api.PredictGetApi;
import com.kintsugihealth.client.openapi.api.PredictSubmitV1Api;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionInitiated;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionRecord;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionRecordBySession;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class PredictionHandler {

    private Api api;

    public String predict(File audioFile, Integer allowedSampleRate) throws ApiException {
        BigDecimal sampleRate = allowedSampleRate != null ? BigDecimal.valueOf(allowedSampleRate) : null;
        PredictSubmitV1Api predictApi = new PredictSubmitV1Api();
        PredictResponsePredictionInitiated response = predictApi.predictionPost(
                api.getXApiKey(), audioFile, api.newSession(), sampleRate
        );

        return response.getSessionId();
    }

    public String predict(File audioFile) throws ApiException {
        return predict(audioFile, null);
    }

    public PredictResponsePredictionRecordBySession getPredictionBySession(String sessionId) throws ApiException {
        return new PredictGetApi().predictSessionsSessionIdGet(sessionId, api.getXApiKey());
    }

    public List<PredictResponsePredictionRecord> getPredictionsByUser(String userId) throws ApiException {
        return new PredictGetApi().predictUsersUserIdGet(userId, api.getXApiKey());
    }
}
