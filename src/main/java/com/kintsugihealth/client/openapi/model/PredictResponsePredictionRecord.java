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
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * PredictResponsePredictionRecord
 */
@JsonPropertyOrder({
  PredictResponsePredictionRecord.JSON_PROPERTY_ACTUAL_SCORE,
  PredictResponsePredictionRecord.JSON_PROPERTY_CREATED_AT,
  PredictResponsePredictionRecord.JSON_PROPERTY_IS_CALIBRATED,
  PredictResponsePredictionRecord.JSON_PROPERTY_MODEL_CATEGORY,
  PredictResponsePredictionRecord.JSON_PROPERTY_MODEL_GRANULARITY,
  PredictResponsePredictionRecord.JSON_PROPERTY_PREDICT_ERROR,
  PredictResponsePredictionRecord.JSON_PROPERTY_PREDICTED_SCORE,
  PredictResponsePredictionRecord.JSON_PROPERTY_SESSION_ID,
  PredictResponsePredictionRecord.JSON_PROPERTY_STATUS,
  PredictResponsePredictionRecord.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("predict.ResponsePredictionRecord")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T23:40:17.598272-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class PredictResponsePredictionRecord {
  public static final String JSON_PROPERTY_ACTUAL_SCORE = "actual_score";
  private PredictionActualScoreFeedback actualScore;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private String createdAt;

  public static final String JSON_PROPERTY_IS_CALIBRATED = "is_calibrated";
  private Boolean isCalibrated;

  public static final String JSON_PROPERTY_MODEL_CATEGORY = "model_category";
  private String modelCategory;

  public static final String JSON_PROPERTY_MODEL_GRANULARITY = "model_granularity";
  private String modelGranularity;

  public static final String JSON_PROPERTY_PREDICT_ERROR = "predict_error";
  private PredictionPredictError predictError;

  public static final String JSON_PROPERTY_PREDICTED_SCORE = "predicted_score";
  private String predictedScore;

  public static final String JSON_PROPERTY_SESSION_ID = "session_id";
  private String sessionId;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public PredictResponsePredictionRecord() {
  }

  public PredictResponsePredictionRecord actualScore(PredictionActualScoreFeedback actualScore) {
    
    this.actualScore = actualScore;
    return this;
  }

   /**
   * Get actualScore
   * @return actualScore
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_ACTUAL_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PredictionActualScoreFeedback getActualScore() {
    return actualScore;
  }


  @JsonProperty(JSON_PROPERTY_ACTUAL_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setActualScore(PredictionActualScoreFeedback actualScore) {
    this.actualScore = actualScore;
  }


  public PredictResponsePredictionRecord createdAt(String createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }


  public PredictResponsePredictionRecord isCalibrated(Boolean isCalibrated) {
    
    this.isCalibrated = isCalibrated;
    return this;
  }

   /**
   * Get isCalibrated
   * @return isCalibrated
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_IS_CALIBRATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public Boolean getIsCalibrated() {
    return isCalibrated;
  }


  @JsonProperty(JSON_PROPERTY_IS_CALIBRATED)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setIsCalibrated(Boolean isCalibrated) {
    this.isCalibrated = isCalibrated;
  }


  public PredictResponsePredictionRecord modelCategory(String modelCategory) {
    
    this.modelCategory = modelCategory;
    return this;
  }

   /**
   * Get modelCategory
   * @return modelCategory
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelCategory() {
    return modelCategory;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_CATEGORY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelCategory(String modelCategory) {
    this.modelCategory = modelCategory;
  }


  public PredictResponsePredictionRecord modelGranularity(String modelGranularity) {
    
    this.modelGranularity = modelGranularity;
    return this;
  }

   /**
   * Get modelGranularity
   * @return modelGranularity
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_MODEL_GRANULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getModelGranularity() {
    return modelGranularity;
  }


  @JsonProperty(JSON_PROPERTY_MODEL_GRANULARITY)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setModelGranularity(String modelGranularity) {
    this.modelGranularity = modelGranularity;
  }


  public PredictResponsePredictionRecord predictError(PredictionPredictError predictError) {
    
    this.predictError = predictError;
    return this;
  }

   /**
   * Get predictError
   * @return predictError
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREDICT_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public PredictionPredictError getPredictError() {
    return predictError;
  }


  @JsonProperty(JSON_PROPERTY_PREDICT_ERROR)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredictError(PredictionPredictError predictError) {
    this.predictError = predictError;
  }


  public PredictResponsePredictionRecord predictedScore(String predictedScore) {
    
    this.predictedScore = predictedScore;
    return this;
  }

   /**
   * Get predictedScore
   * @return predictedScore
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREDICTED_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPredictedScore() {
    return predictedScore;
  }


  @JsonProperty(JSON_PROPERTY_PREDICTED_SCORE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredictedScore(String predictedScore) {
    this.predictedScore = predictedScore;
  }


  public PredictResponsePredictionRecord sessionId(String sessionId) {
    
    this.sessionId = sessionId;
    return this;
  }

   /**
   * Get sessionId
   * @return sessionId
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getSessionId() {
    return sessionId;
  }


  @JsonProperty(JSON_PROPERTY_SESSION_ID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setSessionId(String sessionId) {
    this.sessionId = sessionId;
  }


  public PredictResponsePredictionRecord status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getStatus() {
    return status;
  }


  @JsonProperty(JSON_PROPERTY_STATUS)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setStatus(String status) {
    this.status = status;
  }


  public PredictResponsePredictionRecord updatedAt(String updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getUpdatedAt() {
    return updatedAt;
  }


  @JsonProperty(JSON_PROPERTY_UPDATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PredictResponsePredictionRecord predictResponsePredictionRecord = (PredictResponsePredictionRecord) o;
    return Objects.equals(this.actualScore, predictResponsePredictionRecord.actualScore) &&
        Objects.equals(this.createdAt, predictResponsePredictionRecord.createdAt) &&
        Objects.equals(this.isCalibrated, predictResponsePredictionRecord.isCalibrated) &&
        Objects.equals(this.modelCategory, predictResponsePredictionRecord.modelCategory) &&
        Objects.equals(this.modelGranularity, predictResponsePredictionRecord.modelGranularity) &&
        Objects.equals(this.predictError, predictResponsePredictionRecord.predictError) &&
        Objects.equals(this.predictedScore, predictResponsePredictionRecord.predictedScore) &&
        Objects.equals(this.sessionId, predictResponsePredictionRecord.sessionId) &&
        Objects.equals(this.status, predictResponsePredictionRecord.status) &&
        Objects.equals(this.updatedAt, predictResponsePredictionRecord.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualScore, createdAt, isCalibrated, modelCategory, modelGranularity, predictError, predictedScore, sessionId, status, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictResponsePredictionRecord {\n");
    sb.append("    actualScore: ").append(toIndentedString(actualScore)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isCalibrated: ").append(toIndentedString(isCalibrated)).append("\n");
    sb.append("    modelCategory: ").append(toIndentedString(modelCategory)).append("\n");
    sb.append("    modelGranularity: ").append(toIndentedString(modelGranularity)).append("\n");
    sb.append("    predictError: ").append(toIndentedString(predictError)).append("\n");
    sb.append("    predictedScore: ").append(toIndentedString(predictedScore)).append("\n");
    sb.append("    sessionId: ").append(toIndentedString(sessionId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

