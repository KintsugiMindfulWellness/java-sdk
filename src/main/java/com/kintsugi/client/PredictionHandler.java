package com.kintsugi.client;

import com.kintsugi.client.openapi.api.PredictGetApi;
import com.kintsugi.client.openapi.api.PredictSubmitV2Api;
import com.kintsugi.client.openapi.invoker.ApiException;
import com.kintsugi.client.openapi.model.PredictResponsePredictionInitiated;
import com.kintsugi.client.openapi.model.PredictResponsePredictionRecord;
import com.kintsugi.client.openapi.model.PredictResponsePredictionRecordBySession;
import com.kintsugi.client.openapi.model.SessionSessionMetadata;
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
     * @throws ApiException if an exception occurs.
     */
    public String predict(
            String userId, File audioFile, SessionSessionMetadata metadata, Integer allowedSampleRate
    ) throws ApiException {
        BigDecimal sampleRate = allowedSampleRate != null ? BigDecimal.valueOf(allowedSampleRate) : null;
        PredictSubmitV2Api predictApi = new PredictSubmitV2Api();
        PredictResponsePredictionInitiated response = predictApi.predictionPost(
                api.getXApiKey(), audioFile, api.newSession(userId, metadata), sampleRate
        );

        return response.getSessionId();
    }

    /**
     * Request a new prediction.
     *
     * @param userId unique identifier of a given user.
     * @param audioFile audio file to use as input for prediction.
     *
     * @return the session ID that identifies this prediction request.
     * @throws ApiException if an exception occurs.
     */
    public String predict(String userId, File audioFile) throws ApiException {
        return predict(userId, audioFile, null, null);
    }

    /**
     * Consult the results of a single prediction.
     *
     * @param sessionId session ID returned when a given prediction was created.
     *
     * @return the result of a single prediction
     * @throws ApiException if an exception occurs.
     */
    public PredictResponsePredictionRecordBySession getPredictionBySession(String sessionId) throws ApiException {
        return new PredictGetApi().predictSessionsSessionIdGet(sessionId, api.getXApiKey());
    }

    /**
     * Consult all prediction results respective to a given user.
     *
     * @param userId unique user identifier.
     *
     * @return a list of prediction results.
     * @throws ApiException if an exception occurs.
     */
    public List<PredictResponsePredictionRecord> getPredictionsByUser(String userId) throws ApiException {
        return new PredictGetApi().predictUsersUserIdGet(userId, api.getXApiKey());
    }
}
