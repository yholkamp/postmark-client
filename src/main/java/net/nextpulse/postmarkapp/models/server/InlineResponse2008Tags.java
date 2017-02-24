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
 * InlineResponse2008Tags
 */
@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2017-02-24T16:43:29.220+01:00")
public class InlineResponse2008Tags {
  @JsonProperty("ID")
  private Integer ID = null;

  @JsonProperty("MatchName")
  private String matchName = null;

  @JsonProperty("TrackOpens")
  private Boolean trackOpens = null;

  public InlineResponse2008Tags ID(Integer ID) {
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

  public InlineResponse2008Tags matchName(String matchName) {
    this.matchName = matchName;
    return this;
  }

   /**
   * Get matchName
   * @return matchName
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getMatchName() {
    return matchName;
  }

  public void setMatchName(String matchName) {
    this.matchName = matchName;
  }

  public InlineResponse2008Tags trackOpens(Boolean trackOpens) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2008Tags inlineResponse2008Tags = (InlineResponse2008Tags) o;
    return Objects.equals(this.ID, inlineResponse2008Tags.ID) &&
        Objects.equals(this.matchName, inlineResponse2008Tags.matchName) &&
        Objects.equals(this.trackOpens, inlineResponse2008Tags.trackOpens);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ID, matchName, trackOpens);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2008Tags {\n");
    
    sb.append("    ID: ").append(toIndentedString(ID)).append("\n");
    sb.append("    matchName: ").append(toIndentedString(matchName)).append("\n");
    sb.append("    trackOpens: ").append(toIndentedString(trackOpens)).append("\n");
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

