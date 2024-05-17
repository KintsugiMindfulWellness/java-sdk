package com.kintsugihealth.client.openapi.api;

import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.invoker.ApiClient;
import com.kintsugihealth.client.openapi.invoker.Configuration;
import com.kintsugihealth.client.openapi.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.kintsugihealth.client.openapi.model.InitiateNewInitiateRequest;
import com.kintsugihealth.client.openapi.model.InitiateResponseInitiate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T23:40:17.598272-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class InitiateApi {
  private ApiClient apiClient;

  public InitiateApi() {
    this(Configuration.getDefaultApiClient());
  }

  public InitiateApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Initiate Session
   * Generate user session with patient consent and optional demographic metadata
   * @param xAPIKey API Key to be checked (required)
   * @param data request body (required)
   * @return a {@code InitiateResponseInitiate}
   * @throws ApiException if fails to make API call
   */
  public InitiateResponseInitiate initiatePost(String xAPIKey, InitiateNewInitiateRequest data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'xAPIKey' is set
    if (xAPIKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xAPIKey' when calling initiatePost");
    }
    
    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(400, "Missing the required parameter 'data' when calling initiatePost");
    }
    
    // create path and map variables
    String localVarPath = "/initiate".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xAPIKey != null)
      localVarHeaderParams.put("X-API-Key", apiClient.parameterToString(xAPIKey));

    
    
    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<InitiateResponseInitiate> localVarReturnType = new GenericType<InitiateResponseInitiate>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
