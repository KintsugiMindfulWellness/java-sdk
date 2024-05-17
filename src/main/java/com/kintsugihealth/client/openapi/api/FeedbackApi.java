package com.kintsugihealth.client.openapi.api;

import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.invoker.ApiClient;
import com.kintsugihealth.client.openapi.invoker.Configuration;
import com.kintsugihealth.client.openapi.invoker.Pair;

import com.kintsugihealth.client.openapi.model.FeedbackFeedbackRequestPredictionValidBinaryString;
import com.kintsugihealth.client.openapi.model.FeedbackRequestPHQ2;
import com.kintsugihealth.client.openapi.model.FeedbackRequestPHQ9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T23:40:17.598272-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class FeedbackApi {
  private ApiClient apiClient;

  public FeedbackApi() {
    this(Configuration.getDefaultApiClient());
  }

  public FeedbackApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Patient Feedback for Binary Depression
   * Submits patient feedback for Binary Depression
   * @param xAPIKey API Key to be checked (required)
   * @param data request body (required)
   * @throws ApiException if fails to make API call
   */
  public void feedbackDepressionBinaryPatch(String xAPIKey, FeedbackFeedbackRequestPredictionValidBinaryString data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'xAPIKey' is set
    if (xAPIKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xAPIKey' when calling feedbackDepressionBinaryPatch");
    }
    
    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(400, "Missing the required parameter 'data' when calling feedbackDepressionBinaryPatch");
    }
    
    // create path and map variables
    String localVarPath = "/feedback/depression/binary".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xAPIKey != null)
      localVarHeaderParams.put("X-API-Key", apiClient.parameterToString(xAPIKey));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Patient Feedback for PHQ-2
   * Submits patient feedback for PHQ-2
   * @param xAPIKey API Key to be checked (required)
   * @param data request body (required)
   * @throws ApiException if fails to make API call
   */
  public void feedbackPhq2Patch(String xAPIKey, FeedbackRequestPHQ2 data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'xAPIKey' is set
    if (xAPIKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xAPIKey' when calling feedbackPhq2Patch");
    }
    
    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(400, "Missing the required parameter 'data' when calling feedbackPhq2Patch");
    }
    
    // create path and map variables
    String localVarPath = "/feedback/phq/2".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xAPIKey != null)
      localVarHeaderParams.put("X-API-Key", apiClient.parameterToString(xAPIKey));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
  /**
   * Patient Feedback for PHQ-9
   * Submits patient feedback for PHQ-9
   * @param xAPIKey API Key to be checked (required)
   * @param data request body (required)
   * @throws ApiException if fails to make API call
   */
  public void feedbackPhq9Patch(String xAPIKey, FeedbackRequestPHQ9 data) throws ApiException {
    Object localVarPostBody = data;
    
    // verify the required parameter 'xAPIKey' is set
    if (xAPIKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xAPIKey' when calling feedbackPhq9Patch");
    }
    
    // verify the required parameter 'data' is set
    if (data == null) {
      throw new ApiException(400, "Missing the required parameter 'data' when calling feedbackPhq9Patch");
    }
    
    // create path and map variables
    String localVarPath = "/feedback/phq/9".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xAPIKey != null)
      localVarHeaderParams.put("X-API-Key", apiClient.parameterToString(xAPIKey));

    
    
    final String[] localVarAccepts = {
      "*/*"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "application/json"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };


    apiClient.invokeAPI(localVarPath, "PATCH", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, null);
  }
}
