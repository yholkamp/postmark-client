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
 * TemplateDetailResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class TemplateDetailResponse {
  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("TemplateID")
  private Integer templateID = null;

  @JsonProperty("HtmlBody")
  private String htmlBody = null;

  @JsonProperty("TextBody")
  private String textBody = null;

  @JsonProperty("AssociatedServerId")
  private Integer associatedServerId = null;

  @JsonProperty("Subject")
  private String subject = null;

  @JsonProperty("Active")
  private Boolean active = null;

  public TemplateDetailResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The display name for the template.
   * @return name
  **/
  @ApiModelProperty(example = "null", value = "The display name for the template.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public TemplateDetailResponse templateID(Integer templateID) {
    this.templateID = templateID;
    return this;
  }

   /**
   * The ID associated with the template.
   * @return templateID
  **/
  @ApiModelProperty(example = "null", value = "The ID associated with the template.")
  public Integer getTemplateID() {
    return templateID;
  }

  public void setTemplateID(Integer templateID) {
    this.templateID = templateID;
  }

  public TemplateDetailResponse htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * The content to use for the HtmlBody when this template is used to send email.
   * @return htmlBody
  **/
  @ApiModelProperty(example = "null", value = "The content to use for the HtmlBody when this template is used to send email.")
  public String getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  public TemplateDetailResponse textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

   /**
   * The content to use for the TextBody when this template is used to send email.
   * @return textBody
  **/
  @ApiModelProperty(example = "null", value = "The content to use for the TextBody when this template is used to send email.")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public TemplateDetailResponse associatedServerId(Integer associatedServerId) {
    this.associatedServerId = associatedServerId;
    return this;
  }

   /**
   * The ID of the Server with which this template is associated.
   * @return associatedServerId
  **/
  @ApiModelProperty(example = "null", value = "The ID of the Server with which this template is associated.")
  public Integer getAssociatedServerId() {
    return associatedServerId;
  }

  public void setAssociatedServerId(Integer associatedServerId) {
    this.associatedServerId = associatedServerId;
  }

  public TemplateDetailResponse subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The content to use for the Subject when this template is used to send email.
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "The content to use for the Subject when this template is used to send email.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public TemplateDetailResponse active(Boolean active) {
    this.active = active;
    return this;
  }

   /**
   * Indicates that this template may be used for sending email.
   * @return active
  **/
  @ApiModelProperty(example = "null", value = "Indicates that this template may be used for sending email.")
  public Boolean getActive() {
    return active;
  }

  public void setActive(Boolean active) {
    this.active = active;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TemplateDetailResponse templateDetailResponse = (TemplateDetailResponse) o;
    return Objects.equals(this.name, templateDetailResponse.name) &&
        Objects.equals(this.templateID, templateDetailResponse.templateID) &&
        Objects.equals(this.htmlBody, templateDetailResponse.htmlBody) &&
        Objects.equals(this.textBody, templateDetailResponse.textBody) &&
        Objects.equals(this.associatedServerId, templateDetailResponse.associatedServerId) &&
        Objects.equals(this.subject, templateDetailResponse.subject) &&
        Objects.equals(this.active, templateDetailResponse.active);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, templateID, htmlBody, textBody, associatedServerId, subject, active);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TemplateDetailResponse {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    templateID: ").append(toIndentedString(templateID)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    associatedServerId: ").append(toIndentedString(associatedServerId)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    active: ").append(toIndentedString(active)).append("\n");
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

