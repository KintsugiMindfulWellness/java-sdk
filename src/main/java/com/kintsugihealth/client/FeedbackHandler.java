package com.kintsugihealth.client;

import com.kintsugihealth.client.openapi.api.FeedbackApi;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class FeedbackHandler {

    private Api api;

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

    public void phq2(String sessionId, List<PredictionValidPHQInt> answers) throws ApiException {
        phq(sessionId, answers);
    }

    public void phq9(String sessionId, List<PredictionValidPHQInt> answers) throws ApiException {
        phq(sessionId, answers);
    }

}
