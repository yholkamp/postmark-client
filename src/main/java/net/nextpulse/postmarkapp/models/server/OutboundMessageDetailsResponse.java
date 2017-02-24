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
import net.nextpulse.postmarkapp.models.server.MessageEventDetails;

/**
 * OutboundMessageDetailsResponse
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class OutboundMessageDetailsResponse {
  @JsonProperty("TextBody")
  private String textBody = null;

  @JsonProperty("HtmlBody")
  private String htmlBody = null;

  @JsonProperty("Body")
  private String body = null;

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

  @JsonProperty("MessageEvents")
  private List<MessageEventDetails> messageEvents = new ArrayList<MessageEventDetails>();

  public OutboundMessageDetailsResponse textBody(String textBody) {
    this.textBody = textBody;
    return this;
  }

   /**
   * Get textBody
   * @return textBody
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getTextBody() {
    return textBody;
  }

  public void setTextBody(String textBody) {
    this.textBody = textBody;
  }

  public OutboundMessageDetailsResponse htmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
    return this;
  }

   /**
   * Get htmlBody
   * @return htmlBody
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getHtmlBody() {
    return htmlBody;
  }

  public void setHtmlBody(String htmlBody) {
    this.htmlBody = htmlBody;
  }

  public OutboundMessageDetailsResponse body(String body) {
    this.body = body;
    return this;
  }

   /**
   * Get body
   * @return body
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public OutboundMessageDetailsResponse tag(String tag) {
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

  public OutboundMessageDetailsResponse messageID(String messageID) {
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

  public OutboundMessageDetailsResponse to(List<EmailNameAddressPair> to) {
    this.to = to;
    return this;
  }

  public OutboundMessageDetailsResponse addToItem(EmailNameAddressPair toItem) {
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

  public OutboundMessageDetailsResponse cc(List<EmailNameAddressPair> cc) {
    this.cc = cc;
    return this;
  }

  public OutboundMessageDetailsResponse addCcItem(EmailNameAddressPair ccItem) {
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

  public OutboundMessageDetailsResponse bcc(List<EmailNameAddressPair> bcc) {
    this.bcc = bcc;
    return this;
  }

  public OutboundMessageDetailsResponse addBccItem(EmailNameAddressPair bccItem) {
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

  public OutboundMessageDetailsResponse recipients(List<String> recipients) {
    this.recipients = recipients;
    return this;
  }

  public OutboundMessageDetailsResponse addRecipientsItem(String recipientsItem) {
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

  public OutboundMessageDetailsResponse receivedAt(Date receivedAt) {
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

  public OutboundMessageDetailsResponse from(String from) {
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

  public OutboundMessageDetailsResponse subject(String subject) {
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

  public OutboundMessageDetailsResponse attachments(AttachmentCollection attachments) {
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

  public OutboundMessageDetailsResponse status(String status) {
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

  public OutboundMessageDetailsResponse trackOpens(Boolean trackOpens) {
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

  public OutboundMessageDetailsResponse trackLinks(TrackLinksEnum trackLinks) {
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

  public OutboundMessageDetailsResponse messageEvents(List<MessageEventDetails> messageEvents) {
    this.messageEvents = messageEvents;
    return this;
  }

  public OutboundMessageDetailsResponse addMessageEventsItem(MessageEventDetails messageEventsItem) {
    this.messageEvents.add(messageEventsItem);
    return this;
  }

   /**
   * Get messageEvents
   * @return messageEvents
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<MessageEventDetails> getMessageEvents() {
    return messageEvents;
  }

  public void setMessageEvents(List<MessageEventDetails> messageEvents) {
    this.messageEvents = messageEvents;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OutboundMessageDetailsResponse outboundMessageDetailsResponse = (OutboundMessageDetailsResponse) o;
    return Objects.equals(this.textBody, outboundMessageDetailsResponse.textBody) &&
        Objects.equals(this.htmlBody, outboundMessageDetailsResponse.htmlBody) &&
        Objects.equals(this.body, outboundMessageDetailsResponse.body) &&
        Objects.equals(this.tag, outboundMessageDetailsResponse.tag) &&
        Objects.equals(this.messageID, outboundMessageDetailsResponse.messageID) &&
        Objects.equals(this.to, outboundMessageDetailsResponse.to) &&
        Objects.equals(this.cc, outboundMessageDetailsResponse.cc) &&
        Objects.equals(this.bcc, outboundMessageDetailsResponse.bcc) &&
        Objects.equals(this.recipients, outboundMessageDetailsResponse.recipients) &&
        Objects.equals(this.receivedAt, outboundMessageDetailsResponse.receivedAt) &&
        Objects.equals(this.from, outboundMessageDetailsResponse.from) &&
        Objects.equals(this.subject, outboundMessageDetailsResponse.subject) &&
        Objects.equals(this.attachments, outboundMessageDetailsResponse.attachments) &&
        Objects.equals(this.status, outboundMessageDetailsResponse.status) &&
        Objects.equals(this.trackOpens, outboundMessageDetailsResponse.trackOpens) &&
        Objects.equals(this.trackLinks, outboundMessageDetailsResponse.trackLinks) &&
        Objects.equals(this.messageEvents, outboundMessageDetailsResponse.messageEvents);
  }

  @Override
  public int hashCode() {
    return Objects.hash(textBody, htmlBody, body, tag, messageID, to, cc, bcc, recipients, receivedAt, from, subject, attachments, status, trackOpens, trackLinks, messageEvents);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OutboundMessageDetailsResponse {\n");
    
    sb.append("    textBody: ").append(toIndentedString(textBody)).append("\n");
    sb.append("    htmlBody: ").append(toIndentedString(htmlBody)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
    sb.append("    messageEvents: ").append(toIndentedString(messageEvents)).append("\n");
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

