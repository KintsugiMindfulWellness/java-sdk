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

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

/**
 * InitiateNewInitiateRequest
 */
@JsonPropertyOrder({
  InitiateNewInitiateRequest.JSON_PROPERTY_IS_INITIATED,
  InitiateNewInitiateRequest.JSON_PROPERTY_METADATA,
  InitiateNewInitiateRequest.JSON_PROPERTY_USER_ID
})
@JsonTypeName("initiate.NewInitiateRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-05-16T23:40:17.598272-03:00[America/Fortaleza]", comments = "Generator version: 7.5.0")
public class InitiateNewInitiateRequest {
  public static final String JSON_PROPERTY_IS_INITIATED = "is_initiated";
  private Boolean isInitiated;

  public static final String JSON_PROPERTY_METADATA = "metadata";
  private SessionSessionMetadata metadata;

  public static final String JSON_PROPERTY_USER_ID = "user_id";
  private String userId;

  public InitiateNewInitiateRequest() {
  }

  public InitiateNewInitiateRequest isInitiated(Boolean isInitiated) {
    
    this.isInitiated = isInitiated;
    return this;
  }

   /**
   * Get isInitiated
   * @return isInitiated
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_IS_INITIATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public Boolean getIsInitiated() {
    return isInitiated;
  }


  @JsonProperty(JSON_PROPERTY_IS_INITIATED)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setIsInitiated(Boolean isInitiated) {
    this.isInitiated = isInitiated;
  }


  public InitiateNewInitiateRequest metadata(SessionSessionMetadata metadata) {
    
    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @javax.annotation.Nullable
  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public SessionSessionMetadata getMetadata() {
    return metadata;
  }


  @JsonProperty(JSON_PROPERTY_METADATA)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setMetadata(SessionSessionMetadata metadata) {
    this.metadata = metadata;
  }


  public InitiateNewInitiateRequest userId(String userId) {
    
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @javax.annotation.Nonnull
  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)

  public String getUserId() {
    return userId;
  }


  @JsonProperty(JSON_PROPERTY_USER_ID)
  @JsonInclude(value = JsonInclude.Include.ALWAYS)
  public void setUserId(String userId) {
    this.userId = userId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InitiateNewInitiateRequest initiateNewInitiateRequest = (InitiateNewInitiateRequest) o;
    return Objects.equals(this.isInitiated, initiateNewInitiateRequest.isInitiated) &&
        Objects.equals(this.metadata, initiateNewInitiateRequest.metadata) &&
        Objects.equals(this.userId, initiateNewInitiateRequest.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isInitiated, metadata, userId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InitiateNewInitiateRequest {\n");
    sb.append("    isInitiated: ").append(toIndentedString(isInitiated)).append("\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
