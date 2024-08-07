package com.kintsugi.client.openapi.api;

import com.kintsugi.client.openapi.invoker.ApiException;
import com.kintsugi.client.openapi.invoker.ApiClient;
import com.kintsugi.client.openapi.invoker.Configuration;
import com.kintsugi.client.openapi.invoker.Pair;

import javax.ws.rs.core.GenericType;

import java.math.BigDecimal;
import com.kintsugi.client.openapi.model.ErrorsMessagesResponse;
import java.io.File;
import com.kintsugi.client.openapi.model.PredictResponsePredictionInitiated;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-08T21:04:50.873652-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class PredictSubmitV2Api {
  private ApiClient apiClient;

  public PredictSubmitV2Api() {
    this(Configuration.getDefaultApiClient());
  }

  public PredictSubmitV2Api(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  public ApiClient getApiClient() {
    return apiClient;
  }

  public void setApiClient(ApiClient apiClient) {
    this.apiClient = apiClient;
  }

  /**
   * Depression and Anxiety on submitted audio
   * KV is able to ingest a WAV audio file of the recording of the patient speaking in a single session and respond with its prediction about the presence of current symptoms of depression in their vocal features. KV provides a 3-class result to stratify patients by symptom severity.
   * @param xAPIKey Account API Key to be checked (required)
   * @param _file Audio file to use for prediction (required)
   * @param sessionId The session id for this prediction request (required)
   * @param allowedSampleRate The allowed sample rate for this prediction request. Supports 16000 to 44100 (Hz). (optional)
   * @return a {@code PredictResponsePredictionInitiated}
   * @throws ApiException if fails to make API call
   */
  public PredictResponsePredictionInitiated predictionPost(String xAPIKey, File _file, String sessionId, BigDecimal allowedSampleRate) throws ApiException {
    Object localVarPostBody = null;
    
    // verify the required parameter 'xAPIKey' is set
    if (xAPIKey == null) {
      throw new ApiException(400, "Missing the required parameter 'xAPIKey' when calling predictionPost");
    }
    
    // verify the required parameter '_file' is set
    if (_file == null) {
      throw new ApiException(400, "Missing the required parameter '_file' when calling predictionPost");
    }
    
    // verify the required parameter 'sessionId' is set
    if (sessionId == null) {
      throw new ApiException(400, "Missing the required parameter 'sessionId' when calling predictionPost");
    }
    
    // create path and map variables
    String localVarPath = "/prediction/".replaceAll("\\{format\\}","json");

    // query params
    List<Pair> localVarQueryParams = new ArrayList<Pair>();
    Map<String, String> localVarHeaderParams = new HashMap<String, String>();
    Map<String, String> localVarCookieParams = new HashMap<String, String>();
    Map<String, Object> localVarFormParams = new HashMap<String, Object>();


    if (xAPIKey != null)
      localVarHeaderParams.put("X-API-Key", apiClient.parameterToString(xAPIKey));

    
    if (_file != null)
      localVarFormParams.put("file", _file);
if (sessionId != null)
      localVarFormParams.put("session_id", sessionId);
if (allowedSampleRate != null)
      localVarFormParams.put("allowed_sample_rate", allowedSampleRate);

    final String[] localVarAccepts = {
      "application/json"
    };
    final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);

    final String[] localVarContentTypes = {
      "multipart/form-data"
    };
    final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

    String[] localVarAuthNames = new String[] {  };

    GenericType<PredictResponsePredictionInitiated> localVarReturnType = new GenericType<PredictResponsePredictionInitiated>() {};
    return apiClient.invokeAPI(localVarPath, "POST", localVarQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
      }
}
