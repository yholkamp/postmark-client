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
import net.nextpulse.postmarkapp.models.server.InlineResponse2004Days;

/**
 * InlineResponse2004
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class InlineResponse2004 {
  @JsonProperty("SpamComplaint")
  private Integer spamComplaint = null;

  @JsonProperty("Days")
  private List<InlineResponse2004Days> days = new ArrayList<InlineResponse2004Days>();

  public InlineResponse2004 spamComplaint(Integer spamComplaint) {
    this.spamComplaint = spamComplaint;
    return this;
  }

   /**
   * Get spamComplaint
   * @return spamComplaint
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getSpamComplaint() {
    return spamComplaint;
  }

  public void setSpamComplaint(Integer spamComplaint) {
    this.spamComplaint = spamComplaint;
  }

  public InlineResponse2004 days(List<InlineResponse2004Days> days) {
    this.days = days;
    return this;
  }

  public InlineResponse2004 addDaysItem(InlineResponse2004Days daysItem) {
    this.days.add(daysItem);
    return this;
  }

   /**
   * Get days
   * @return days
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2004Days> getDays() {
    return days;
  }

  public void setDays(List<InlineResponse2004Days> days) {
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
    InlineResponse2004 inlineResponse2004 = (InlineResponse2004) o;
    return Objects.equals(this.spamComplaint, inlineResponse2004.spamComplaint) &&
        Objects.equals(this.days, inlineResponse2004.days);
  }

  @Override
  public int hashCode() {
    return Objects.hash(spamComplaint, days);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004 {\n");
    
    sb.append("    spamComplaint: ").append(toIndentedString(spamComplaint)).append("\n");
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

