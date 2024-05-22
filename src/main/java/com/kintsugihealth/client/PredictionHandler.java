package com.kintsugihealth.client;

import com.kintsugihealth.client.openapi.api.PredictGetApi;
import com.kintsugihealth.client.openapi.api.PredictSubmitV1Api;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionInitiated;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionRecord;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionRecordBySession;
import com.kintsugihealth.client.openapi.model.SessionSessionMetadata;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.io.File;
import java.math.BigDecimal;
import java.util.List;

/**
 * Handler to interact with all endpoints related to prediction.
 */
@NoArgsConstructor
@AllArgsConstructor
public class PredictionHandler {

    private Api api;

    /**
     * Request a new prediction.
     *
     * @param userId unique identifier of a given user.
     * @param audioFile audio file to use as input for prediction.
     * @param metadata data used to customize how the prediction should be made.
     * @param allowedSampleRate expected sample rate of given audio file.
     *
     * @return a session id that identifies this given prediction.
     *
     * @throws ApiException
     */
    public String predict(
            String userId, File audioFile, SessionSessionMetadata metadata, Integer allowedSampleRate
    ) throws ApiException {
        BigDecimal sampleRate = allowedSampleRate != null ? BigDecimal.valueOf(allowedSampleRate) : null;
        PredictSubmitV1Api predictApi = new PredictSubmitV1Api();
        PredictResponsePredictionInitiated response = predictApi.predictionPost(
                api.getXApiKey(), audioFile, api.newSession(userId, metadata), sampleRate
        );

        return response.getSessionId();
    }

    /**
     * Returns a new handler to send feedback about predictions.
     *
     * @param userId unique identifier of a given user.
     * @param audioFile audio file to use as input for prediction.
     *
     * @return
     *
     * @throws ApiException
     */
    public String predict(String userId, File audioFile) throws ApiException {
        return predict(userId, audioFile, null, null);
    }

    /**
     * Consult the results of a single prediction.
     *
     * @param sessionId session ID returned when a given prediction was created.
     *
     * @return
     * @throws ApiException
     */
    public PredictResponsePredictionRecordBySession getPredictionBySession(String sessionId) throws ApiException {
        return new PredictGetApi().predictSessionsSessionIdGet(sessionId, api.getXApiKey());
    }

    /**
     * Consult all the results respective to a given user.
     *
     * @param userId unique user identifier.
     *
     * @return
     * @throws ApiException
     */
    public List<PredictResponsePredictionRecord> getPredictionsByUser(String userId) throws ApiException {
        return new PredictGetApi().predictUsersUserIdGet(userId, api.getXApiKey());
    }
}
