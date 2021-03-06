/*
 * Postmark Account-level API
 * Postmark makes sending and receiving email  incredibly easy. The Account-level API allows users to configure all Servers, Domains, and Sender Signatures associated  with an Account. 
 *
 * OpenAPI spec version: 0.9.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package net.nextpulse.postmarkapp.models.account;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:30.269+01:00")
public class SenderSignatureCreationModel {
  @JsonProperty("FromEmail")
  private String fromEmail = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("ReplyToEmail")
  private String replyToEmail = null;

  @JsonProperty("ReturnPathDomain")
  private String returnPathDomain = null;

  public SenderSignatureCreationModel fromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
    return this;
  }

   /**
   * Get fromEmail
   * @return fromEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFromEmail() {
    return fromEmail;
  }

  public void setFromEmail(String fromEmail) {
    this.fromEmail = fromEmail;
  }

  public SenderSignatureCreationModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SenderSignatureCreationModel replyToEmail(String replyToEmail) {
    this.replyToEmail = replyToEmail;
    return this;
  }

   /**
   * Get replyToEmail
   * @return replyToEmail
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReplyToEmail() {
    return replyToEmail;
  }

  public void setReplyToEmail(String replyToEmail) {
    this.replyToEmail = replyToEmail;
  }

  public SenderSignatureCreationModel returnPathDomain(String returnPathDomain) {
    this.returnPathDomain = returnPathDomain;
    return this;
  }

   /**
   * Get returnPathDomain
   * @return returnPathDomain
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReturnPathDomain() {
    return returnPathDomain;
  }

  public void setReturnPathDomain(String returnPathDomain) {
    this.returnPathDomain = returnPathDomain;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SenderSignatureCreationModel senderSignatureCreationModel = (SenderSignatureCreationModel) o;
    return Objects.equals(this.fromEmail, senderSignatureCreationModel.fromEmail) &&
        Objects.equals(this.name, senderSignatureCreationModel.name) &&
        Objects.equals(this.replyToEmail, senderSignatureCreationModel.replyToEmail) &&
        Objects.equals(this.returnPathDomain, senderSignatureCreationModel.returnPathDomain);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fromEmail, name, replyToEmail, returnPathDomain);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SenderSignatureCreationModel {\n");
    
    sb.append("    fromEmail: ").append(toIndentedString(fromEmail)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    replyToEmail: ").append(toIndentedString(replyToEmail)).append("\n");
    sb.append("    returnPathDomain: ").append(toIndentedString(returnPathDomain)).append("\n");
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

