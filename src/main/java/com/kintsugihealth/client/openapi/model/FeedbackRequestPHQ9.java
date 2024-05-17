/*
 * Kintsugi Voice v2 API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: 
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.kintsugihealth.client.openapi.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.util.ArrayList;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * FeedbackRequestPHQ9
 */
@JsonPropertyOrder({
  FeedbackRequestPHQ9.JSON_PROPERTY_DATA,
  FeedbackRequestPHQ9.JSON_PROPERTY_SESSION_ID
})
@JsonTypeName("feedback.requestPHQ9")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T23:40:17.598272-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class FeedbackRequestPHQ9 {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<PredictionValidPHQInt> data = new ArrayList<>();

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public FeedbackRequestPHQ9() {
  }

  public FeedbackRequestPHQ9 data(List<PredictionValidPHQInt> data) {
    
    this.data = data;
    return this;
  }

  public FeedbackRequestPHQ9 addDataItem(PredictionValidPHQInt dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * This array *MUST* have 9 elements, no more, no less
   * @return data
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PredictionValidPHQInt> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(List<PredictionValidPHQInt> data) {
    this.data = data;
  }


  public FeedbackRequestPHQ9 sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FeedbackRequestPHQ9 feedbackRequestPHQ9 = (FeedbackRequestPHQ9) o;
    return Objects.equals(this.data, feedbackRequestPHQ9.data) &&
        Objects.equals(this.sessionId, feedbackRequestPHQ9.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackRequestPHQ9 {\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

