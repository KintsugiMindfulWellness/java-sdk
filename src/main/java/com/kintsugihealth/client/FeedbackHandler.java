package com.kintsugihealth.client;

import com.kintsugihealth.client.openapi.api.FeedbackApi;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Handler to interact with all endpoints related to feedback.
 */
@NoArgsConstructor
@AllArgsConstructor
public class FeedbackHandler {

    private Api api;

    /**
     * Send feedback related to a previous depression prediction.
     *
     * @param sessionId session ID respective to the prediction.
     * @param value the correct depression label/output.
     *
     * @throws ApiException
     */
    public void depression(String sessionId, boolean value) throws ApiException {
        PredictionValidBinaryString convertedValue = PredictionValidBinaryString.False;

        if (value) {
            convertedValue = PredictionValidBinaryString.True;
        }

        FeedbackFeedbackRequestPredictionValidBinaryString data = new FeedbackFeedbackRequestPredictionValidBinaryString()
                .data(convertedValue)
                .sessionId(sessionId);
        new FeedbackApi().feedbackDepressionBinaryPatch(api.getXApiKey(), data);
    }

    private void phq(String sessionId, List<PredictionValidPHQInt> answers) throws ApiException {
        if (answers == null || (answers.size() != 2 && answers.size() != 9)) {
            throw new IllegalArgumentException("Answers must contain exactly 2 or 9 elements.");
        }

        if (answers.size() == 2) {
            FeedbackRequestPHQ2 data = new FeedbackRequestPHQ2().sessionId(sessionId);
            answers.forEach(data::addDataItem);
            new FeedbackApi().feedbackPhq2Patch(api.getXApiKey(), data);
        } else {
            FeedbackRequestPHQ9 data = new FeedbackRequestPHQ9().sessionId(sessionId);
            answers.forEach(data::addDataItem);
            new FeedbackApi().feedbackPhq9Patch(api.getXApiKey(), data);
        }
    }

    /**
     * Send PHQ-2 answers as feedback related to a previous prediction.
     *
     * @param sessionId session ID respective to the prediction.
     * @param answers PHQ-2 answers.
     * @throws ApiException
     */
    public void phq2(String sessionId, List<PredictionValidPHQInt> answers) throws ApiException {
        phq(sessionId, answers);
    }

    /**
     * Send PHQ-9 answers as feedback related to a previous prediction.
     *
     * @param sessionId session ID respective to the prediction.
     * @param answers PHQ-9 answers.
     * @throws ApiException
     */
    public void phq9(String sessionId, List<PredictionValidPHQInt> answers) throws ApiException {
        phq(sessionId, answers);
    }

}
