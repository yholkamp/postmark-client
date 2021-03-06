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
import net.nextpulse.postmarkapp.models.server.InlineResponse2006InboundRules;

/**
 * InlineResponse2006
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class InlineResponse2006 {
  @JsonProperty("TotalCount")
  private Integer totalCount = null;

  @JsonProperty("InboundRules")
  private List<InlineResponse2006InboundRules> inboundRules = new ArrayList<InlineResponse2006InboundRules>();

  public InlineResponse2006 totalCount(Integer totalCount) {
    this.totalCount = totalCount;
    return this;
  }

   /**
   * Get totalCount
   * @return totalCount
  **/
  @ApiModelProperty(example = "null", value = "")
  public Integer getTotalCount() {
    return totalCount;
  }

  public void setTotalCount(Integer totalCount) {
    this.totalCount = totalCount;
  }

  public InlineResponse2006 inboundRules(List<InlineResponse2006InboundRules> inboundRules) {
    this.inboundRules = inboundRules;
    return this;
  }

  public InlineResponse2006 addInboundRulesItem(InlineResponse2006InboundRules inboundRulesItem) {
    this.inboundRules.add(inboundRulesItem);
    return this;
  }

   /**
   * Get inboundRules
   * @return inboundRules
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2006InboundRules> getInboundRules() {
    return inboundRules;
  }

  public void setInboundRules(List<InlineResponse2006InboundRules> inboundRules) {
    this.inboundRules = inboundRules;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2006 inlineResponse2006 = (InlineResponse2006) o;
    return Objects.equals(this.totalCount, inlineResponse2006.totalCount) &&
        Objects.equals(this.inboundRules, inlineResponse2006.inboundRules);
  }

  @Override
  public int hashCode() {
    return Objects.hash(totalCount, inboundRules);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2006 {\n");
    
    sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
    sb.append("    inboundRules: ").append(toIndentedString(inboundRules)).append("\n");
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

