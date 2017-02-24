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
import net.nextpulse.postmarkapp.models.server.InlineResponse2003Days;

/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class InlineResponse2003 {
  @JsonProperty("Desktop")
  private Integer desktop = null;

  @JsonProperty("WebMail")
  private Integer webMail = null;

  @JsonProperty("Mobile")
  private Integer mobile = null;

  @JsonProperty("Unknown")
  private Integer unknown = null;

  @JsonProperty("Days")
  private List<InlineResponse2003Days> days = new ArrayList<InlineResponse2003Days>();

  public InlineResponse2003 desktop(Integer desktop) {
    this.desktop = desktop;
    return this;
  }

   /**
   * Get desktop
   * @return desktop
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getDesktop() {
    return desktop;
  }

  public void setDesktop(Integer desktop) {
    this.desktop = desktop;
  }

  public InlineResponse2003 webMail(Integer webMail) {
    this.webMail = webMail;
    return this;
  }

   /**
   * Get webMail
   * @return webMail
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getWebMail() {
    return webMail;
  }

  public void setWebMail(Integer webMail) {
    this.webMail = webMail;
  }

  public InlineResponse2003 mobile(Integer mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Get mobile
   * @return mobile
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getMobile() {
    return mobile;
  }

  public void setMobile(Integer mobile) {
    this.mobile = mobile;
  }

  public InlineResponse2003 unknown(Integer unknown) {
    this.unknown = unknown;
    return this;
  }

   /**
   * Get unknown
   * @return unknown
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getUnknown() {
    return unknown;
  }

  public void setUnknown(Integer unknown) {
    this.unknown = unknown;
  }

  public InlineResponse2003 days(List<InlineResponse2003Days> days) {
    this.days = days;
    return this;
  }

  public InlineResponse2003 addDaysItem(InlineResponse2003Days daysItem) {
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2003Days> getDays() {
    return days;
  }

  public void setDays(List<InlineResponse2003Days> days) {
    this.days = days;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.desktop, inlineResponse2003.desktop) &&
        Objects.equals(this.webMail, inlineResponse2003.webMail) &&
        Objects.equals(this.mobile, inlineResponse2003.mobile) &&
        Objects.equals(this.unknown, inlineResponse2003.unknown) &&
        Objects.equals(this.days, inlineResponse2003.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(desktop, webMail, mobile, unknown, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    desktop: ").append(toIndentedString(desktop)).append("\n");
    sb.append("    webMail: ").append(toIndentedString(webMail)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    unknown: ").append(toIndentedString(unknown)).append("\n");
    sb.append("    days: ").append(toIndentedString(days)).append("\n");
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

