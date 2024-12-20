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
import com.kintsugi.client.openapi.model.PredictionActualScoreFeedback;
import com.kintsugi.client.openapi.model.PredictionPredictError;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * PredictResponsePredictionRecordBySession
 */
@JsonPropertyOrder({
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_ACTUAL_SCORE,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_CREATED_AT,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_IS_CALIBRATED,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_MODEL_CATEGORY,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_MODEL_GRANULARITY,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_PREDICT_ERROR,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_PREDICTED_SCORE,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_PREDICTED_SCORE_DEPRESSION,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_PREDICTED_SCORE_ANXIETY,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_STATUS,
  PredictResponsePredictionRecordBySession.JSON_PROPERTY_UPDATED_AT
})
@JsonTypeName("predict.ResponsePredictionRecordBySession")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-06-08T21:04:50.873652-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class PredictResponsePredictionRecordBySession {
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

  public static final String JSON_PROPERTY_PREDICTED_SCORE_DEPRESSION = "predicted_score_depression";
  private String predictedScoreDepression;

  public static final String JSON_PROPERTY_PREDICTED_SCORE_ANXIETY = "predicted_score_anxiety";
  private String predictedScoreAnxiety;

  public static final String JSON_PROPERTY_STATUS = "status";
  private String status;

  public static final String JSON_PROPERTY_UPDATED_AT = "updated_at";
  private String updatedAt;

  public PredictResponsePredictionRecordBySession() {
  }

  public PredictResponsePredictionRecordBySession actualScore(PredictionActualScoreFeedback actualScore) {
    
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


  public PredictResponsePredictionRecordBySession createdAt(String createdAt) {
    
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


  public PredictResponsePredictionRecordBySession isCalibrated(Boolean isCalibrated) {
    
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


  public PredictResponsePredictionRecordBySession modelCategory(String modelCategory) {
    
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


  public PredictResponsePredictionRecordBySession modelGranularity(String modelGranularity) {
    
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


  public PredictResponsePredictionRecordBySession predictError(PredictionPredictError predictError) {
    
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


  public PredictResponsePredictionRecordBySession predictedScore(String predictedScore) {
    
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

  //*** */
  public PredictResponsePredictionRecordBySession predictedScoreDepression(String predictedScoreDepression) {
    
    this.predictedScoreDepression = predictedScoreDepression;
    return this;
  }

   /**
   * Get predictedScoreDepression
   * @return predictedScoreDepression
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_PREDICTED_SCORE_DEPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getPredictedScoreDepression() {
    return predictedScoreDepression;
  }


  @JsonProperty(JSON_PROPERTY_PREDICTED_SCORE_DEPRESSION)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPredictedScoreDepression(String predictedScoreDepression) {
    this.predictedScoreDepression = predictedScoreDepression;
  }
//*** */
public PredictResponsePredictionRecordBySession predictedScoreAnxiety(String predictedScoreAnxiety) {
    
  this.predictedScoreAnxiety = predictedScoreAnxiety;
  return this;
}

 /**
 * Get predictedScoreAnxiety
 * @return predictedScoreAnxiety
**/
@javax.annotation.Nullable
@JsonProperty(JSON_PROPERTY_PREDICTED_SCORE_ANXIETY)
@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

public String getPredictedScoreAnxiety() {
  return predictedScoreAnxiety;
}


@JsonProperty(JSON_PROPERTY_PREDICTED_SCORE_ANXIETY)
@JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
public void setPredictedScoreAnxiety(String predictedScoreAnxiety) {
  this.predictedScoreAnxiety = predictedScoreAnxiety;
}

  public PredictResponsePredictionRecordBySession status(String status) {
    
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


  public PredictResponsePredictionRecordBySession updatedAt(String updatedAt) {
    
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
    PredictResponsePredictionRecordBySession predictResponsePredictionRecordBySession = (PredictResponsePredictionRecordBySession) o;
    return Objects.equals(this.actualScore, predictResponsePredictionRecordBySession.actualScore) &&
        Objects.equals(this.createdAt, predictResponsePredictionRecordBySession.createdAt) &&
        Objects.equals(this.isCalibrated, predictResponsePredictionRecordBySession.isCalibrated) &&
        Objects.equals(this.modelCategory, predictResponsePredictionRecordBySession.modelCategory) &&
        Objects.equals(this.modelGranularity, predictResponsePredictionRecordBySession.modelGranularity) &&
        Objects.equals(this.predictError, predictResponsePredictionRecordBySession.predictError) &&
        Objects.equals(this.predictedScore, predictResponsePredictionRecordBySession.predictedScore) &&
        Objects.equals(this.status, predictResponsePredictionRecordBySession.status) &&
        Objects.equals(this.updatedAt, predictResponsePredictionRecordBySession.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actualScore, createdAt, isCalibrated, modelCategory, modelGranularity, predictError, predictedScore, status, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PredictResponsePredictionRecordBySession {\n");
    sb.append("    actualScore: ").append(toIndentedString(actualScore)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    isCalibrated: ").append(toIndentedString(isCalibrated)).append("\n");
    sb.append("    modelCategory: ").append(toIndentedString(modelCategory)).append("\n");
    sb.append("    modelGranularity: ").append(toIndentedString(modelGranularity)).append("\n");
    sb.append("    predictError: ").append(toIndentedString(predictError)).append("\n");
    sb.append("    predictedScore: ").append(toIndentedString(predictedScore)).append("\n");
    sb.append("    predictedScoreDepression: ").append(toIndentedString(predictedScoreDepression)).append("\n");
    sb.append("    predictedScoreAnxiety: ").append(toIndentedString(predictedScoreAnxiety)).append("\n");
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

