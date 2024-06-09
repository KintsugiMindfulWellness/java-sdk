package com.kintsugi.client;

import com.kintsugi.client.openapi.model.*;
import com.kintsugi.client.openapi.api.FeedbackApi;
import com.kintsugi.client.openapi.invoker.ApiException;
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
     * @throws ApiException if an exception occurs.
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

    private void sendAnswers(String sessionId, List<PredictionValidFeedbackInt> answers) throws ApiException {
        if (answers.size() == 2) {
            FeedbackRequestPHQ2 data = new FeedbackRequestPHQ2().sessionId(sessionId);
            answers.forEach(data::addDataItem);
            new FeedbackApi().feedbackPhq2Patch(api.getXApiKey(), data);
        } else if (answers.size() == 7) {
            FeedbackRequestGAD7 data = new FeedbackRequestGAD7().sessionId(sessionId);
            answers.forEach(data::addDataItem);
            new FeedbackApi().feedbackGad7Patch(api.getXApiKey(), data);
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
     *
     * @throws ApiException if an exception occurs.
     */
    public void phq2(String sessionId, List<PredictionValidFeedbackInt> answers) throws ApiException {
        if (answers == null || answers.size() != 2) {
            throw new IllegalArgumentException("PHQ-2 answers must contains exactly 2 values.");
        }
        sendAnswers(sessionId, answers);
    }

    /**
     * Send PHQ-9 answers as feedback related to a previous prediction.
     *
     * @param sessionId session ID respective to the prediction.
     * @param answers PHQ-9 answers.
     *
     * @throws ApiException if an exception occurs.
     */
    public void phq9(String sessionId, List<PredictionValidFeedbackInt> answers) throws ApiException {
        if (answers == null || answers.size() != 9) {
            throw new IllegalArgumentException("PHQ-9 answers must contains exactly 9 values.");
        }
        sendAnswers(sessionId, answers);
    }

    /**
     * Send GAD-7 answers as feedback related to a previous prediction.
     * @param sessionId session ID respective to the prediction.
     * @param answers GAD-7 answers.
     * @throws ApiException if an exception occurs.
     */
    public void gad7(String sessionId, List<PredictionValidFeedbackInt> answers) throws ApiException {
        if (answers == null || answers.size() != 7) {
            throw new IllegalArgumentException("GAD-7 answers must contains exactly 7 values.");
        }
        sendAnswers(sessionId, answers);
    }

}
