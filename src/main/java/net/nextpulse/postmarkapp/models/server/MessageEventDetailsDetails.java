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

/**
 * MessageEventDetailsDetails
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class MessageEventDetailsDetails {
  @JsonProperty("Summary")
  private String summary = null;

  @JsonProperty("BounceID")
  private String bounceID = null;

  @JsonProperty("DeliveryMessage")
  private String deliveryMessage = null;

  @JsonProperty("DestinationServer")
  private String destinationServer = null;

  @JsonProperty("DestinationIP")
  private String destinationIP = null;

  public MessageEventDetailsDetails summary(String summary) {
    this.summary = summary;
    return this;
  }

   /**
   * Get summary
   * @return summary
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSummary() {
    return summary;
  }

  public void setSummary(String summary) {
    this.summary = summary;
  }

  public MessageEventDetailsDetails bounceID(String bounceID) {
    this.bounceID = bounceID;
    return this;
  }

   /**
   * Get bounceID
   * @return bounceID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBounceID() {
    return bounceID;
  }

  public void setBounceID(String bounceID) {
    this.bounceID = bounceID;
  }

  public MessageEventDetailsDetails deliveryMessage(String deliveryMessage) {
    this.deliveryMessage = deliveryMessage;
    return this;
  }

   /**
   * Get deliveryMessage
   * @return deliveryMessage
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeliveryMessage() {
    return deliveryMessage;
  }

  public void setDeliveryMessage(String deliveryMessage) {
    this.deliveryMessage = deliveryMessage;
  }

  public MessageEventDetailsDetails destinationServer(String destinationServer) {
    this.destinationServer = destinationServer;
    return this;
  }

   /**
   * Get destinationServer
   * @return destinationServer
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDestinationServer() {
    return destinationServer;
  }

  public void setDestinationServer(String destinationServer) {
    this.destinationServer = destinationServer;
  }

  public MessageEventDetailsDetails destinationIP(String destinationIP) {
    this.destinationIP = destinationIP;
    return this;
  }

   /**
   * Get destinationIP
   * @return destinationIP
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDestinationIP() {
    return destinationIP;
  }

  public void setDestinationIP(String destinationIP) {
    this.destinationIP = destinationIP;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageEventDetailsDetails messageEventDetailsDetails = (MessageEventDetailsDetails) o;
    return Objects.equals(this.summary, messageEventDetailsDetails.summary) &&
        Objects.equals(this.bounceID, messageEventDetailsDetails.bounceID) &&
        Objects.equals(this.deliveryMessage, messageEventDetailsDetails.deliveryMessage) &&
        Objects.equals(this.destinationServer, messageEventDetailsDetails.destinationServer) &&
        Objects.equals(this.destinationIP, messageEventDetailsDetails.destinationIP);
  }

  @Override
  public int hashCode() {
    return Objects.hash(summary, bounceID, deliveryMessage, destinationServer, destinationIP);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageEventDetailsDetails {\n");
    
    sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
    sb.append("    bounceID: ").append(toIndentedString(bounceID)).append("\n");
    sb.append("    deliveryMessage: ").append(toIndentedString(deliveryMessage)).append("\n");
    sb.append("    destinationServer: ").append(toIndentedString(destinationServer)).append("\n");
    sb.append("    destinationIP: ").append(toIndentedString(destinationIP)).append("\n");
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

