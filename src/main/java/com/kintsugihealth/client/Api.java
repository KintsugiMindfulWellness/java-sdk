package com.kintsugihealth.client;

import com.kintsugihealth.client.openapi.api.InitiateApi;
import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.model.InitiateNewInitiateRequest;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class Api {
    private String xApiKey;

    private InitiateNewInitiateRequest requestParams;
    private InitiateApi internalApi;

    public Api(String xApiKey, String url, String userId, boolean isInitiated) {
        this();

        this.xApiKey = xApiKey;

        internalApi = new InitiateApi();
        internalApi.getApiClient().setBasePath(url);

        requestParams = new InitiateNewInitiateRequest();
        requestParams.setUserId(userId);
        requestParams.setIsInitiated(isInitiated);
    }

    public String newSession() throws ApiException {
        return internalApi.initiatePost(xApiKey, requestParams).getSessionId();
    }

    public String getXApiKey() {
        return xApiKey;
    }

    public PredictionHandler prediction() {
        return new PredictionHandler(this);
    }

}
