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
 * BounceInfoResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class BounceInfoResponse {
  @JsonProperty("ID")
  private String ID = null;

  @JsonProperty("Type")
  private String type = null;

  @JsonProperty("TypeCode")
  private Integer typeCode = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("Tag")
  private String tag = null;

  @JsonProperty("MessageID")
  private String messageID = null;

  @JsonProperty("Description")
  private String description = null;

  @JsonProperty("Details")
  private String details = null;

  @JsonProperty("Email")
  private String email = null;

  @JsonProperty("BouncedAt")
  private Date bouncedAt = null;

  @JsonProperty("DumpAvailable")
  private Boolean dumpAvailable = null;

  @JsonProperty("Inactive")
  private Boolean inactive = null;

  @JsonProperty("CanActivate")
  private Boolean canActivate = null;

  @JsonProperty("Subject")
  private String subject = null;

  @JsonProperty("Content")
  private String content = null;

  public BounceInfoResponse ID(String ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getID() {
    return ID;
  }

  public void setID(String ID) {
    this.ID = ID;
  }

  public BounceInfoResponse type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public BounceInfoResponse typeCode(Integer typeCode) {
    this.typeCode = typeCode;
    return this;
  }

   /**
   * Get typeCode
   * @return typeCode
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTypeCode() {
    return typeCode;
  }

  public void setTypeCode(Integer typeCode) {
    this.typeCode = typeCode;
  }

  public BounceInfoResponse name(String name) {
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

  public BounceInfoResponse tag(String tag) {
    this.tag = tag;
    return this;
  }

   /**
   * Get tag
   * @return tag
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTag() {
    return tag;
  }

  public void setTag(String tag) {
    this.tag = tag;
  }

  public BounceInfoResponse messageID(String messageID) {
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

  public BounceInfoResponse description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public BounceInfoResponse details(String details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDetails() {
    return details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public BounceInfoResponse email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Get email
   * @return email
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public BounceInfoResponse bouncedAt(Date bouncedAt) {
    this.bouncedAt = bouncedAt;
    return this;
  }

   /**
   * Get bouncedAt
   * @return bouncedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Date getBouncedAt() {
    return bouncedAt;
  }

  public void setBouncedAt(Date bouncedAt) {
    this.bouncedAt = bouncedAt;
  }

  public BounceInfoResponse dumpAvailable(Boolean dumpAvailable) {
    this.dumpAvailable = dumpAvailable;
    return this;
  }

   /**
   * Get dumpAvailable
   * @return dumpAvailable
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getDumpAvailable() {
    return dumpAvailable;
  }

  public void setDumpAvailable(Boolean dumpAvailable) {
    this.dumpAvailable = dumpAvailable;
  }

  public BounceInfoResponse inactive(Boolean inactive) {
    this.inactive = inactive;
    return this;
  }

   /**
   * Get inactive
   * @return inactive
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getInactive() {
    return inactive;
  }

  public void setInactive(Boolean inactive) {
    this.inactive = inactive;
  }

  public BounceInfoResponse canActivate(Boolean canActivate) {
    this.canActivate = canActivate;
    return this;
  }

   /**
   * Get canActivate
   * @return canActivate
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getCanActivate() {
    return canActivate;
  }

  public void setCanActivate(Boolean canActivate) {
    this.canActivate = canActivate;
  }

  public BounceInfoResponse subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Get subject
   * @return subject
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public BounceInfoResponse content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BounceInfoResponse bounceInfoResponse = (BounceInfoResponse) o;
    return Objects.equals(this.ID, bounceInfoResponse.ID) &&
        Objects.equals(this.type, bounceInfoResponse.type) &&
        Objects.equals(this.typeCode, bounceInfoResponse.typeCode) &&
        Objects.equals(this.name, bounceInfoResponse.name) &&
        Objects.equals(this.tag, bounceInfoResponse.tag) &&
        Objects.equals(this.messageID, bounceInfoResponse.messageID) &&
        Objects.equals(this.description, bounceInfoResponse.description) &&
        Objects.equals(this.details, bounceInfoResponse.details) &&
        Objects.equals(this.email, bounceInfoResponse.email) &&
        Objects.equals(this.bouncedAt, bounceInfoResponse.bouncedAt) &&
        Objects.equals(this.dumpAvailable, bounceInfoResponse.dumpAvailable) &&
        Objects.equals(this.inactive, bounceInfoResponse.inactive) &&
        Objects.equals(this.canActivate, bounceInfoResponse.canActivate) &&
        Objects.equals(this.subject, bounceInfoResponse.subject) &&
        Objects.equals(this.content, bounceInfoResponse.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, type, typeCode, name, tag, messageID, description, details, email, bouncedAt, dumpAvailable, inactive, canActivate, subject, content);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BounceInfoResponse {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    typeCode: ").append(toIndentedString(typeCode)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    bouncedAt: ").append(toIndentedString(bouncedAt)).append("\n");
    sb.append("    dumpAvailable: ").append(toIndentedString(dumpAvailable)).append("\n");
    sb.append("    inactive: ").append(toIndentedString(inactive)).append("\n");
    sb.append("    canActivate: ").append(toIndentedString(canActivate)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

