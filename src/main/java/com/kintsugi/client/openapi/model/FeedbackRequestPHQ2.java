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


package com.kintsugi.client.openapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import com.kintsugi.client.openapi.model.PredictionValidFeedbackInt;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * FeedbackRequestPHQ2
 */
@JsonPropertyOrder({
  FeedbackRequestPHQ2.JSON_PROPERTY_DATA,
  FeedbackRequestPHQ2.JSON_PROPERTY_SESSION_ID
})
@JsonTypeName("feedback.requestPHQ2")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-08T21:04:50.873652-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class FeedbackRequestPHQ2 {
  public static final String JSON_PROPERTY_DATA = "data";
  private List<PredictionValidFeedbackInt> data = new ArrayList<>();

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public FeedbackRequestPHQ2() {
  }

  public FeedbackRequestPHQ2 data(List<PredictionValidFeedbackInt> data) {
    
    this.data = data;
    return this;
  }

  public FeedbackRequestPHQ2 addDataItem(PredictionValidFeedbackInt dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * This array *MUST* have 2 elements, no more, no less
   * @return data
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public List<PredictionValidFeedbackInt> getData() {
    return data;
  }


  @JsonProperty(JSON_PROPERTY_DATA)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setData(List<PredictionValidFeedbackInt> data) {
    this.data = data;
  }


  public FeedbackRequestPHQ2 sessionId(String sessionId) {
    
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
    FeedbackRequestPHQ2 feedbackRequestPHQ2 = (FeedbackRequestPHQ2) o;
    return Objects.equals(this.data, feedbackRequestPHQ2.data) &&
        Objects.equals(this.sessionId, feedbackRequestPHQ2.sessionId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(data, sessionId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FeedbackRequestPHQ2 {\n");
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

