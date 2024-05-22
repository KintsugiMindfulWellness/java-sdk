package com.kintsugihealth.client;

import com.kintsugihealth.client.openapi.api.InitiateApi;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.InitiateNewInitiateRequest;
import com.kintsugihealth.client.openapi.model.SessionSessionMetadata;
import lombok.NoArgsConstructor;

/**
 * Provide access to all features related to prediction and feedback.
 */
@NoArgsConstructor
public class Api {
    private String xApiKey;
    private InitiateApi internalApi;

    /**
     * Creates a new api instance.
     *
     * @param xApiKey authentication key necessary to make api requests.
     * @param url base url for the api.
     */
    public Api(String xApiKey, String url) {
        this();
        this.xApiKey = xApiKey;
        internalApi = new InitiateApi();
        internalApi.getApiClient().setBasePath(url);
    }

    /**
     * Create a new prediction session and returns its ID.
     *
     * @param userId user related to the prediction.
     * @param metadata additional data to customize how prediction is performed.
     * @return a new session ID as a string.
     * @throws ApiException
     */
    public String newSession(String userId, SessionSessionMetadata metadata) throws ApiException {
        InitiateNewInitiateRequest params = new InitiateNewInitiateRequest()
                .isInitiated(true)
                .userId(userId);

        if (metadata != null) {
            params.setMetadata(metadata);
        }

        return internalApi.initiatePost(xApiKey, params).getSessionId();
    }

    /**
     * Return the api authentication key.
     * @return
     */
    public String getXApiKey() {
        return xApiKey;
    }

    /**
     * @return a new handler to interact with prediction endpoints.
     */
    public PredictionHandler prediction() {
        return new PredictionHandler(this);
    }

    /**
     * @return a new handler to send feedback about predictions.
     */
    public FeedbackHandler feedback() {
        return new FeedbackHandler(this);
    }

}
