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
import java.util.ArrayList;
import java.util.List;

/**
 * 
 */
@ApiModel(description = "")
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:30.269+01:00")
public class ExtendedServerInfo {
  @JsonProperty("ID")
  private Integer ID = null;

  @JsonProperty("Name")
  private String name = null;

  @JsonProperty("ApiTokens")
  private List<String> apiTokens = new ArrayList<String>();

  @JsonProperty("ServerLink")
  private String serverLink = null;

  @JsonProperty("Color")
  private String color = null;

  @JsonProperty("SmtpApiActivated")
  private Boolean smtpApiActivated = null;

  @JsonProperty("RawEmailEnabled")
  private Boolean rawEmailEnabled = null;

  @JsonProperty("DeliveryHookUrl")
  private String deliveryHookUrl = null;

  @JsonProperty("InboundAddress")
  private String inboundAddress = null;

  @JsonProperty("InboundHookUrl")
  private String inboundHookUrl = null;

  @JsonProperty("BounceHookUrl")
  private String bounceHookUrl = null;

  @JsonProperty("OpenHookUrl")
  private String openHookUrl = null;

  @JsonProperty("PostFirstOpenOnly")
  private Boolean postFirstOpenOnly = null;

  @JsonProperty("TrackOpens")
  private Boolean trackOpens = null;

  /**
   * Gets or Sets trackLinks
   */
  public enum TrackLinksEnum {
    NONE("None"),
    
    HTMLANDTEXTTRACKING("HtmlAndTextTracking"),
    
    HTMLONLYTRACKING("HtmlOnlyTracking"),
    
    TEXTONLYTRACKING("TextOnlyTracking");

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

  @JsonProperty("InboundDomain")
  private String inboundDomain = null;

  @JsonProperty("InboundHash")
  private String inboundHash = null;

  @JsonProperty("InboundSpamThreshold")
  private Integer inboundSpamThreshold = null;

  public ExtendedServerInfo ID(Integer ID) {
    this.ID = ID;
    return this;
  }

   /**
   * Get ID
   * @return ID
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getID() {
    return ID;
  }

  public void setID(Integer ID) {
    this.ID = ID;
  }

  public ExtendedServerInfo name(String name) {
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

  public ExtendedServerInfo apiTokens(List<String> apiTokens) {
    this.apiTokens = apiTokens;
    return this;
  }

  public ExtendedServerInfo addApiTokensItem(String apiTokensItem) {
    this.apiTokens.add(apiTokensItem);
    return this;
  }

   /**
   * Get apiTokens
   * @return apiTokens
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<String> getApiTokens() {
    return apiTokens;
  }

  public void setApiTokens(List<String> apiTokens) {
    this.apiTokens = apiTokens;
  }

  public ExtendedServerInfo serverLink(String serverLink) {
    this.serverLink = serverLink;
    return this;
  }

   /**
   * Get serverLink
   * @return serverLink
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getServerLink() {
    return serverLink;
  }

  public void setServerLink(String serverLink) {
    this.serverLink = serverLink;
  }

  public ExtendedServerInfo color(String color) {
    this.color = color;
    return this;
  }

   /**
   * Get color
   * @return color
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  public ExtendedServerInfo smtpApiActivated(Boolean smtpApiActivated) {
    this.smtpApiActivated = smtpApiActivated;
    return this;
  }

   /**
   * Get smtpApiActivated
   * @return smtpApiActivated
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getSmtpApiActivated() {
    return smtpApiActivated;
  }

  public void setSmtpApiActivated(Boolean smtpApiActivated) {
    this.smtpApiActivated = smtpApiActivated;
  }

  public ExtendedServerInfo rawEmailEnabled(Boolean rawEmailEnabled) {
    this.rawEmailEnabled = rawEmailEnabled;
    return this;
  }

   /**
   * Get rawEmailEnabled
   * @return rawEmailEnabled
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getRawEmailEnabled() {
    return rawEmailEnabled;
  }

  public void setRawEmailEnabled(Boolean rawEmailEnabled) {
    this.rawEmailEnabled = rawEmailEnabled;
  }

  public ExtendedServerInfo deliveryHookUrl(String deliveryHookUrl) {
    this.deliveryHookUrl = deliveryHookUrl;
    return this;
  }

   /**
   * Get deliveryHookUrl
   * @return deliveryHookUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getDeliveryHookUrl() {
    return deliveryHookUrl;
  }

  public void setDeliveryHookUrl(String deliveryHookUrl) {
    this.deliveryHookUrl = deliveryHookUrl;
  }

  public ExtendedServerInfo inboundAddress(String inboundAddress) {
    this.inboundAddress = inboundAddress;
    return this;
  }

   /**
   * Get inboundAddress
   * @return inboundAddress
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInboundAddress() {
    return inboundAddress;
  }

  public void setInboundAddress(String inboundAddress) {
    this.inboundAddress = inboundAddress;
  }

  public ExtendedServerInfo inboundHookUrl(String inboundHookUrl) {
    this.inboundHookUrl = inboundHookUrl;
    return this;
  }

   /**
   * Get inboundHookUrl
   * @return inboundHookUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInboundHookUrl() {
    return inboundHookUrl;
  }

  public void setInboundHookUrl(String inboundHookUrl) {
    this.inboundHookUrl = inboundHookUrl;
  }

  public ExtendedServerInfo bounceHookUrl(String bounceHookUrl) {
    this.bounceHookUrl = bounceHookUrl;
    return this;
  }

   /**
   * Get bounceHookUrl
   * @return bounceHookUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getBounceHookUrl() {
    return bounceHookUrl;
  }

  public void setBounceHookUrl(String bounceHookUrl) {
    this.bounceHookUrl = bounceHookUrl;
  }

  public ExtendedServerInfo openHookUrl(String openHookUrl) {
    this.openHookUrl = openHookUrl;
    return this;
  }

   /**
   * Get openHookUrl
   * @return openHookUrl
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getOpenHookUrl() {
    return openHookUrl;
  }

  public void setOpenHookUrl(String openHookUrl) {
    this.openHookUrl = openHookUrl;
  }

  public ExtendedServerInfo postFirstOpenOnly(Boolean postFirstOpenOnly) {
    this.postFirstOpenOnly = postFirstOpenOnly;
    return this;
  }

   /**
   * Get postFirstOpenOnly
   * @return postFirstOpenOnly
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getPostFirstOpenOnly() {
    return postFirstOpenOnly;
  }

  public void setPostFirstOpenOnly(Boolean postFirstOpenOnly) {
    this.postFirstOpenOnly = postFirstOpenOnly;
  }

  public ExtendedServerInfo trackOpens(Boolean trackOpens) {
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

  public ExtendedServerInfo trackLinks(TrackLinksEnum trackLinks) {
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

  public ExtendedServerInfo inboundDomain(String inboundDomain) {
    this.inboundDomain = inboundDomain;
    return this;
  }

   /**
   * Get inboundDomain
   * @return inboundDomain
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInboundDomain() {
    return inboundDomain;
  }

  public void setInboundDomain(String inboundDomain) {
    this.inboundDomain = inboundDomain;
  }

  public ExtendedServerInfo inboundHash(String inboundHash) {
    this.inboundHash = inboundHash;
    return this;
  }

   /**
   * Get inboundHash
   * @return inboundHash
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getInboundHash() {
    return inboundHash;
  }

  public void setInboundHash(String inboundHash) {
    this.inboundHash = inboundHash;
  }

  public ExtendedServerInfo inboundSpamThreshold(Integer inboundSpamThreshold) {
    this.inboundSpamThreshold = inboundSpamThreshold;
    return this;
  }

   /**
   * Get inboundSpamThreshold
   * @return inboundSpamThreshold
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getInboundSpamThreshold() {
    return inboundSpamThreshold;
  }

  public void setInboundSpamThreshold(Integer inboundSpamThreshold) {
    this.inboundSpamThreshold = inboundSpamThreshold;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ExtendedServerInfo extendedServerInfo = (ExtendedServerInfo) o;
    return Objects.equals(this.ID, extendedServerInfo.ID) &&
        Objects.equals(this.name, extendedServerInfo.name) &&
        Objects.equals(this.apiTokens, extendedServerInfo.apiTokens) &&
        Objects.equals(this.serverLink, extendedServerInfo.serverLink) &&
        Objects.equals(this.color, extendedServerInfo.color) &&
        Objects.equals(this.smtpApiActivated, extendedServerInfo.smtpApiActivated) &&
        Objects.equals(this.rawEmailEnabled, extendedServerInfo.rawEmailEnabled) &&
        Objects.equals(this.deliveryHookUrl, extendedServerInfo.deliveryHookUrl) &&
        Objects.equals(this.inboundAddress, extendedServerInfo.inboundAddress) &&
        Objects.equals(this.inboundHookUrl, extendedServerInfo.inboundHookUrl) &&
        Objects.equals(this.bounceHookUrl, extendedServerInfo.bounceHookUrl) &&
        Objects.equals(this.openHookUrl, extendedServerInfo.openHookUrl) &&
        Objects.equals(this.postFirstOpenOnly, extendedServerInfo.postFirstOpenOnly) &&
        Objects.equals(this.trackOpens, extendedServerInfo.trackOpens) &&
        Objects.equals(this.trackLinks, extendedServerInfo.trackLinks) &&
        Objects.equals(this.inboundDomain, extendedServerInfo.inboundDomain) &&
        Objects.equals(this.inboundHash, extendedServerInfo.inboundHash) &&
        Objects.equals(this.inboundSpamThreshold, extendedServerInfo.inboundSpamThreshold);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, name, apiTokens, serverLink, color, smtpApiActivated, rawEmailEnabled, deliveryHookUrl, inboundAddress, inboundHookUrl, bounceHookUrl, openHookUrl, postFirstOpenOnly, trackOpens, trackLinks, inboundDomain, inboundHash, inboundSpamThreshold);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtendedServerInfo {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    apiTokens: ").append(toIndentedString(apiTokens)).append("\n");
    sb.append("    serverLink: ").append(toIndentedString(serverLink)).append("\n");
    sb.append("    color: ").append(toIndentedString(color)).append("\n");
    sb.append("    smtpApiActivated: ").append(toIndentedString(smtpApiActivated)).append("\n");
    sb.append("    rawEmailEnabled: ").append(toIndentedString(rawEmailEnabled)).append("\n");
    sb.append("    deliveryHookUrl: ").append(toIndentedString(deliveryHookUrl)).append("\n");
    sb.append("    inboundAddress: ").append(toIndentedString(inboundAddress)).append("\n");
    sb.append("    inboundHookUrl: ").append(toIndentedString(inboundHookUrl)).append("\n");
    sb.append("    bounceHookUrl: ").append(toIndentedString(bounceHookUrl)).append("\n");
    sb.append("    openHookUrl: ").append(toIndentedString(openHookUrl)).append("\n");
    sb.append("    postFirstOpenOnly: ").append(toIndentedString(postFirstOpenOnly)).append("\n");
    sb.append("    trackOpens: ").append(toIndentedString(trackOpens)).append("\n");
    sb.append("    trackLinks: ").append(toIndentedString(trackLinks)).append("\n");
    sb.append("    inboundDomain: ").append(toIndentedString(inboundDomain)).append("\n");
    sb.append("    inboundHash: ").append(toIndentedString(inboundHash)).append("\n");
    sb.append("    inboundSpamThreshold: ").append(toIndentedString(inboundSpamThreshold)).append("\n");
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

