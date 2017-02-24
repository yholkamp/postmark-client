/*
 * Postmark API
 * Postmark makes sending and receiving email incredibly easy. 
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.nextpulse.postmarkapp.models.server;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;

/**
 * The standard response when a postmark message is sent
 */
@ApiModel(description = "The standard response when a postmark message is sent")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class SendEmailResponse {
  @JsonProperty("To")
  private String to = null;

  @JsonProperty("SubmittedAt")
  private Date submittedAt = null;

  @JsonProperty("MessageID")
  private String messageID = null;

  @JsonProperty("ErrorCode")
  private Integer errorCode = null;

  @JsonProperty("Message")
  private String message = null;

  public SendEmailResponse to(String to) {
    this.to = to;
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public SendEmailResponse submittedAt(Date submittedAt) {
    this.submittedAt = submittedAt;
    return this;
  }

   /**
   * Get submittedAt
   * @return submittedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Date getSubmittedAt() {
    return submittedAt;
  }

  public void setSubmittedAt(Date submittedAt) {
    this.submittedAt = submittedAt;
  }

  public SendEmailResponse messageID(String messageID) {
    this.messageID = messageID;
    return this;
  }

   /**
   * Get messageID
   * @return messageID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessageID() {
    return messageID;
  }

  public void setMessageID(String messageID) {
    this.messageID = messageID;
  }

  public SendEmailResponse errorCode(Integer errorCode) {
    this.errorCode = errorCode;
    return this;
  }

   /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(Integer errorCode) {
    this.errorCode = errorCode;
  }

  public SendEmailResponse message(String message) {
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SendEmailResponse sendEmailResponse = (SendEmailResponse) o;
    return Objects.equals(this.to, sendEmailResponse.to) &&
        Objects.equals(this.submittedAt, sendEmailResponse.submittedAt) &&
        Objects.equals(this.messageID, sendEmailResponse.messageID) &&
        Objects.equals(this.errorCode, sendEmailResponse.errorCode) &&
        Objects.equals(this.message, sendEmailResponse.message);
  }

  @Override
  public int hashCode() {
    return Objects.hash(to, submittedAt, messageID, errorCode, message);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SendEmailResponse {\n");
    
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    submittedAt: ").append(toIndentedString(submittedAt)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

