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
import java.util.Date;
import java.util.List;
import net.nextpulse.postmarkapp.models.server.AttachmentCollection;
import net.nextpulse.postmarkapp.models.server.EmailNameAddressPair;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class OutboundMessageDetail {
  @JsonProperty("Tag")
  private String tag = null;

  @JsonProperty("MessageID")
  private String messageID = null;

  @JsonProperty("To")
  private List<EmailNameAddressPair> to = new ArrayList<EmailNameAddressPair>();

  @JsonProperty("Cc")
  private List<EmailNameAddressPair> cc = new ArrayList<EmailNameAddressPair>();

  @JsonProperty("Bcc")
  private List<EmailNameAddressPair> bcc = new ArrayList<EmailNameAddressPair>();

  @JsonProperty("Recipients")
  private List<String> recipients = new ArrayList<String>();

  @JsonProperty("ReceivedAt")
  private Date receivedAt = null;

  @JsonProperty("From")
  private String from = null;

  @JsonProperty("Subject")
  private String subject = null;

  @JsonProperty("Attachments")
  private AttachmentCollection attachments = null;

  @JsonProperty("Status")
  private String status = null;

  @JsonProperty("TrackOpens")
  private Boolean trackOpens = null;

  /**
   * Gets or Sets trackLinks
   */
  public enum TrackLinksEnum {
    NONE("None"),
    
    HTMLANDTEXT("HtmlAndText"),
    
    HTMLONLY("HtmlOnly"),
    
    TEXTONLY("TextOnly");

    private String value;

    TrackLinksEnum(String value) {
      this.value = value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TrackLinksEnum fromValue(String text) {
      for (TrackLinksEnum b : TrackLinksEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("TrackLinks")
  private TrackLinksEnum trackLinks = null;

  public OutboundMessageDetail tag(String tag) {
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

  public OutboundMessageDetail messageID(String messageID) {
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

  public OutboundMessageDetail to(List<EmailNameAddressPair> to) {
    this.to = to;
    return this;
  }

  public OutboundMessageDetail addToItem(EmailNameAddressPair toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EmailNameAddressPair> getTo() {
    return to;
  }

  public void setTo(List<EmailNameAddressPair> to) {
    this.to = to;
  }

  public OutboundMessageDetail cc(List<EmailNameAddressPair> cc) {
    this.cc = cc;
    return this;
  }

  public OutboundMessageDetail addCcItem(EmailNameAddressPair ccItem) {
    this.cc.add(ccItem);
    return this;
  }

   /**
   * Get cc
   * @return cc
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EmailNameAddressPair> getCc() {
    return cc;
  }

  public void setCc(List<EmailNameAddressPair> cc) {
    this.cc = cc;
  }

  public OutboundMessageDetail bcc(List<EmailNameAddressPair> bcc) {
    this.bcc = bcc;
    return this;
  }

  public OutboundMessageDetail addBccItem(EmailNameAddressPair bccItem) {
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * Get bcc
   * @return bcc
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EmailNameAddressPair> getBcc() {
    return bcc;
  }

  public void setBcc(List<EmailNameAddressPair> bcc) {
    this.bcc = bcc;
  }

  public OutboundMessageDetail recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public OutboundMessageDetail addRecipientsItem(String recipientsItem) {
    this.recipients.add(recipientsItem);
    return this;
  }

   /**
   * Get recipients
   * @return recipients
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getRecipients() {
    return recipients;
  }

  public void setRecipients(List<String> recipients) {
    this.recipients = recipients;
  }

  public OutboundMessageDetail receivedAt(Date receivedAt) {
    this.receivedAt = receivedAt;
    return this;
  }

   /**
   * Get receivedAt
   * @return receivedAt
  **/
  @ApiModelProperty(example = "null", value = "")
  public Date getReceivedAt() {
    return receivedAt;
  }

  public void setReceivedAt(Date receivedAt) {
    this.receivedAt = receivedAt;
  }

  public OutboundMessageDetail from(String from) {
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

  public OutboundMessageDetail subject(String subject) {
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

  public OutboundMessageDetail attachments(AttachmentCollection attachments) {
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

  public OutboundMessageDetail status(String status) {
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

  public OutboundMessageDetail trackOpens(Boolean trackOpens) {
    this.trackOpens = trackOpens;
    return this;
  }

   /**
   * Get trackOpens
   * @return trackOpens
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getTrackOpens() {
    return trackOpens;
  }

  public void setTrackOpens(Boolean trackOpens) {
    this.trackOpens = trackOpens;
  }

  public OutboundMessageDetail trackLinks(TrackLinksEnum trackLinks) {
    this.trackLinks = trackLinks;
    return this;
  }

   /**
   * Get trackLinks
   * @return trackLinks
  **/
  @ApiModelProperty(example = "null", value = "")
  public TrackLinksEnum getTrackLinks() {
    return trackLinks;
  }

  public void setTrackLinks(TrackLinksEnum trackLinks) {
    this.trackLinks = trackLinks;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessageDetail outboundMessageDetail = (OutboundMessageDetail) o;
    return Objects.equals(this.tag, outboundMessageDetail.tag) &&
        Objects.equals(this.messageID, outboundMessageDetail.messageID) &&
        Objects.equals(this.to, outboundMessageDetail.to) &&
        Objects.equals(this.cc, outboundMessageDetail.cc) &&
        Objects.equals(this.bcc, outboundMessageDetail.bcc) &&
        Objects.equals(this.recipients, outboundMessageDetail.recipients) &&
        Objects.equals(this.receivedAt, outboundMessageDetail.receivedAt) &&
        Objects.equals(this.from, outboundMessageDetail.from) &&
        Objects.equals(this.subject, outboundMessageDetail.subject) &&
        Objects.equals(this.attachments, outboundMessageDetail.attachments) &&
        Objects.equals(this.status, outboundMessageDetail.status) &&
        Objects.equals(this.trackOpens, outboundMessageDetail.trackOpens) &&
        Objects.equals(this.trackLinks, outboundMessageDetail.trackLinks);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tag, messageID, to, cc, bcc, recipients, receivedAt, from, subject, attachments, status, trackOpens, trackLinks);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessageDetail {\n");
    
    sb.append("    tag: ").append(toIndentedString(tag)).append("\n");
    sb.append("    messageID: ").append(toIndentedString(messageID)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    recipients: ").append(toIndentedString(recipients)).append("\n");
    sb.append("    receivedAt: ").append(toIndentedString(receivedAt)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    trackOpens: ").append(toIndentedString(trackOpens)).append("\n");
    sb.append("    trackLinks: ").append(toIndentedString(trackLinks)).append("\n");
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

