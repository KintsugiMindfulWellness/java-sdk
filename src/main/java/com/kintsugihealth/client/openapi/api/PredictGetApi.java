package com.kintsugihealth.client.openapi.api;

import com.kintsugihealth.client.openapi.invoker.ApiException;
import com.kintsugihealth.client.openapi.invoker.ApiClient;
import com.kintsugihealth.client.openapi.invoker.Configuration;
import com.kintsugihealth.client.openapi.invoker.Pair;

import javax.ws.rs.core.GenericType;

import com.kintsugihealth.client.openapi.model.PredictResponsePredictionRecord;
import com.kintsugihealth.client.openapi.model.PredictResponsePredictionRecordBySession;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T23:40:17.598272-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class PredictGetApi {
  private ApiClient apiClient;

  public PredictGetApi() {
    this(Configuration.getDefaultApiClient());
  }

  public PredictGetApi(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Get prediction by session ID
   * Get the prediction associated with a given session id if requesting account has access
   * @param sessionId unique id for session (required)
   * @param xAPIKey API Key to be checked (required)
   * @return a {@code PredictResponsePredictionRecordBySession}
   * @throws ApiException if fails to make API call
   */
  public PredictResponsePredictionRecordBySession predictSessionsSessionIdGet(String sessionId, String xAPIKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling predictSessionsSessionIdGet");
    }
    
    // verify the required parameter 'xAPIKey' is set
    if (xAPIKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xAPIKey' when calling predictSessionsSessionIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/predict/sessions/{session_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "session_id" + "\\}", apiClient.escapeString(sessionId.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PredictResponsePredictionRecordBySession> localVarReturnType = new GenericType<PredictResponsePredictionRecordBySession>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
  /**
   * Get predictions by user ID
   * Get all predictions associated with a given user id if requesting account has access
   * @param userId id of user (required)
   * @param xAPIKey API Key to be checked (required)
   * @return a {@code List<PredictResponsePredictionRecord>}
   * @throws ApiException if fails to make API call
   */
  public List<PredictResponsePredictionRecord> predictUsersUserIdGet(String userId, String xAPIKey) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'userId' is set
    if (userId == null) {
      throw new ApiException(400, "Missing the required parameter 'userId' when calling predictUsersUserIdGet");
    }
    
    // verify the required parameter 'xAPIKey' is set
    if (xAPIKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xAPIKey' when calling predictUsersUserIdGet");
    }
    
    // create path and map variables
    String localVarPath = "/predict/users/{user_id}".replaceAll("\\{format\\}","json")
      .replaceAll("\\{" + "user_id" + "\\}", apiClient.escapeString(userId.toString()));

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
      
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<List<PredictResponsePredictionRecord>> localVarReturnType = new GenericType<List<PredictResponsePredictionRecord>>() {};
    return apiClient.invokeAPI(localVarPath, "GET", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
