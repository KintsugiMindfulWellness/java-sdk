package com.kintsugihealth.client;

import com.kintsugihealth.client.openapi.api.InitiateApi;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.InitiateNewInitiateRequest;
import com.kintsugihealth.client.openapi.model.SessionSessionMetadata;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Api {
    private String xApiKey;
    private InitiateApi internalApi;

    public Api(String xApiKey, String url) {
        this();
        this.xApiKey = xApiKey;
        internalApi = new InitiateApi();
        internalApi.getApiClient().setBasePath(url);
    }

    public String newSession(String userId, SessionSessionMetadata metadata) throws ApiException {
        InitiateNewInitiateRequest params = new InitiateNewInitiateRequest()
                .isInitiated(true)
                .userId(userId);

        if (metadata != null) {
            params.setMetadata(metadata);
        }

        return internalApi.initiatePost(xApiKey, params).getSessionId();
    }

    public String getXApiKey() {
        return xApiKey;
    }

    public PredictionHandler prediction() {
        return new PredictionHandler(this);
    }

    public FeedbackHandler feedback() {
        return new FeedbackHandler(this);
    }

}
