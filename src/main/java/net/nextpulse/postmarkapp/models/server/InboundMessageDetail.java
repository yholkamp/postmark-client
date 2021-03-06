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
import java.util.ArrayList;
import java.util.List;
import net.nextpulse.postmarkapp.models.server.AttachmentCollection;
import net.nextpulse.postmarkapp.models.server.EmailNameAddressPair;
import net.nextpulse.postmarkapp.models.server.InboundMessageFullDetailsResponseFromFull;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class InboundMessageDetail {
  @JsonProperty("From")
  private String from = null;

  @JsonProperty("FromName")
  private String fromName = null;

  @JsonProperty("FromFull")
  private InboundMessageFullDetailsResponseFromFull fromFull = null;

  @JsonProperty("To")
  private String to = null;

  @JsonProperty("ToFull")
  private List<EmailNameAddressPair> toFull = new ArrayList<EmailNameAddressPair>();

  @JsonProperty("Cc")
  private String cc = null;

  @JsonProperty("CcFull")
  private List<EmailNameAddressPair> ccFull = new ArrayList<EmailNameAddressPair>();

  @JsonProperty("ReplyTo")
  private String replyTo = null;

  @JsonProperty("OriginalRecipient")
  private String originalRecipient = null;

  @JsonProperty("Subject")
  private String subject = null;

  @JsonProperty("Date")
  private String date = null;

  @JsonProperty("MailboxHash")
  private String mailboxHash = null;

  @JsonProperty("Tag")
  private String tag = null;

  @JsonProperty("Attachments")
  private AttachmentCollection attachments = null;

  @JsonProperty("MessageID")
  private String messageID = null;

  @JsonProperty("Status")
  private String status = null;

  public InboundMessageDetail from(String from) {
    this.from = from;
    return this;
  }

   /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public InboundMessageDetail fromName(String fromName) {
    this.fromName = fromName;
    return this;
  }

   /**
   * Get fromName
   * @return fromName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getFromName() {
    return fromName;
  }

  public void setFromName(String fromName) {
    this.fromName = fromName;
  }

  public InboundMessageDetail fromFull(InboundMessageFullDetailsResponseFromFull fromFull) {
    this.fromFull = fromFull;
    return this;
  }

   /**
   * Get fromFull
   * @return fromFull
  **/
  @ApiModelProperty(example = "null", value = "")
  public InboundMessageFullDetailsResponseFromFull getFromFull() {
    return fromFull;
  }

  public void setFromFull(InboundMessageFullDetailsResponseFromFull fromFull) {
    this.fromFull = fromFull;
  }

  public InboundMessageDetail to(String to) {
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

  public InboundMessageDetail toFull(List<EmailNameAddressPair> toFull) {
    this.toFull = toFull;
    return this;
  }

  public InboundMessageDetail addToFullItem(EmailNameAddressPair toFullItem) {
    this.toFull.add(toFullItem);
    return this;
  }

   /**
   * Get toFull
   * @return toFull
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EmailNameAddressPair> getToFull() {
    return toFull;
  }

  public void setToFull(List<EmailNameAddressPair> toFull) {
    this.toFull = toFull;
  }

  public InboundMessageDetail cc(String cc) {
    this.cc = cc;
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getCc() {
    return cc;
  }

  public void setCc(String cc) {
    this.cc = cc;
  }

  public InboundMessageDetail ccFull(List<EmailNameAddressPair> ccFull) {
    this.ccFull = ccFull;
    return this;
  }

  public InboundMessageDetail addCcFullItem(EmailNameAddressPair ccFullItem) {
    this.ccFull.add(ccFullItem);
    return this;
  }

   /**
   * Get ccFull
   * @return ccFull
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EmailNameAddressPair> getCcFull() {
    return ccFull;
  }

  public void setCcFull(List<EmailNameAddressPair> ccFull) {
    this.ccFull = ccFull;
  }

  public InboundMessageDetail replyTo(String replyTo) {
    this.replyTo = replyTo;
    return this;
  }

   /**
   * Get replyTo
   * @return replyTo
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getReplyTo() {
    return replyTo;
  }

  public void setReplyTo(String replyTo) {
    this.replyTo = replyTo;
  }

  public InboundMessageDetail originalRecipient(String originalRecipient) {
    this.originalRecipient = originalRecipient;
    return this;
  }

   /**
   * Get originalRecipient
   * @return originalRecipient
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOriginalRecipient() {
    return originalRecipient;
  }

  public void setOriginalRecipient(String originalRecipient) {
    this.originalRecipient = originalRecipient;
  }

  public InboundMessageDetail subject(String subject) {
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

  public InboundMessageDetail date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public InboundMessageDetail mailboxHash(String mailboxHash) {
    this.mailboxHash = mailboxHash;
    return this;
  }

   /**
   * Get mailboxHash
   * @return mailboxHash
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMailboxHash() {
    return mailboxHash;
  }

  public void setMailboxHash(String mailboxHash) {
    this.mailboxHash = mailboxHash;
  }

  public InboundMessageDetail tag(String tag) {
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

  public InboundMessageDetail attachments(AttachmentCollection attachments) {
    this.attachments = attachments;
    return this;
  }

   /**
   * Get attachments
   * @return attachments
  **/
  @ApiModelProperty(example = "null", value = "")
  public AttachmentCollection getAttachments() {
    return attachments;
  }

  public void setAttachments(AttachmentCollection attachments) {
    this.attachments = attachments;
  }

  public InboundMessageDetail messageID(String messageID) {
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

  public InboundMessageDetail status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InboundMessageDetail inboundMessageDetail = (InboundMessageDetail) o;
    return Objects.equals(this.from, inboundMessageDetail.from) &&
        Objects.equals(this.fromName, inboundMessageDetail.fromName) &&
        Objects.equals(this.fromFull, inboundMessageDetail.fromFull) &&
        Objects.equals(this.to, inboundMessageDetail.to) &&
        Objects.equals(this.toFull, inboundMessageDetail.toFull) &&
        Objects.equals(this.cc, inboundMessageDetail.cc) &&
        Objects.equals(this.ccFull, inboundMessageDetail.ccFull) &&
        Objects.equals(this.replyTo, inboundMessageDetail.replyTo) &&
        Objects.equals(this.originalRecipient, inboundMessageDetail.originalRecipient) &&
        Objects.equals(this.subject, inboundMessageDetail.subject) &&
        Objects.equals(this.date, inboundMessageDetail.date) &&
        Objects.equals(this.mailboxHash, inboundMessageDetail.mailboxHash) &&
        Objects.equals(this.tag, inboundMessageDetail.tag) &&
        Objects.equals(this.attachments, inboundMessageDetail.attachments) &&
        Objects.equals(this.messageID, inboundMessageDetail.messageID) &&
        Objects.equals(this.status, inboundMessageDetail.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(from, fromName, fromFull, to, toFull, cc, ccFull, replyTo, originalRecipient, subject, date, mailboxHash, tag, attachments, messageID, status);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InboundMessageDetail {\n");
    
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    fromName: ").append(toIndentedString(fromName)).append("\n");
    sb.append("    fromFull: ").append(toIndentedString(fromFull)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    toFull: ").append(toIndentedString(toFull)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    ccFull: ").append(toIndentedString(ccFull)).append("\n");
    sb.append("    replyTo: ").append(toIndentedString(replyTo)).append("\n");
    sb.append("    originalRecipient: ").append(toIndentedString(originalRecipient)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    mailboxHash: ").append(toIndentedString(mailboxHash)).append("\n");
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

