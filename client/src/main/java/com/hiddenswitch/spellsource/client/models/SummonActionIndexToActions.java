/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 3.0.3
 * Contact: ben@hiddenswitch.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.hiddenswitch.spellsource.client.models;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * A single index-action pair. 
 */
@ApiModel(description = "A single index-action pair. ")
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class SummonActionIndexToActions implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("index")
  private Integer index = null;

  @JsonProperty("action")
  private Integer action = null;

  public SummonActionIndexToActions index(Integer index) {
    this.index = index;
    return this;
  }

   /**
   * The position in the battlefield that corresponds to this summon action. 
   * @return index
  **/
  @ApiModelProperty(value = "The position in the battlefield that corresponds to this summon action. ")
  public Integer getIndex() {
    return index;
  }

  public void setIndex(Integer index) {
    this.index = index;
  }

  public SummonActionIndexToActions action(Integer action) {
    this.action = action;
    return this;
  }

   /**
   * The action index of this particular summon index position for this card. 
   * @return action
  **/
  @ApiModelProperty(value = "The action index of this particular summon index position for this card. ")
  public Integer getAction() {
    return action;
  }

  public void setAction(Integer action) {
    this.action = action;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SummonActionIndexToActions summonActionIndexToActions = (SummonActionIndexToActions) o;
    return Objects.equals(this.index, summonActionIndexToActions.index) &&
        Objects.equals(this.action, summonActionIndexToActions.action);
  }

  @Override
  public int hashCode() {
    return Objects.hash(index, action);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SummonActionIndexToActions {\n");
    
    sb.append("    index: ").append(toIndentedString(index)).append("\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
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

