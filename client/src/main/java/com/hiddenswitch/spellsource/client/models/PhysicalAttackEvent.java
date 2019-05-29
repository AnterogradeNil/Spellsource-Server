/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services.  For the routes that correspond to the paths in this file, visit the Gateway.java file in the Spellsource-Server GitHub repository located in this definition file. 
 *
 * OpenAPI spec version: 3.0.4
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
import com.hiddenswitch.spellsource.client.models.Entity;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * PhysicalAttackEvent
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class PhysicalAttackEvent implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("attacker")
  private Entity attacker = null;

  @JsonProperty("defender")
  private Entity defender = null;

  @JsonProperty("damageDealt")
  private Integer damageDealt = null;

  public PhysicalAttackEvent attacker(Entity attacker) {
    this.attacker = attacker;
    return this;
  }

   /**
   * Get attacker
   * @return attacker
  **/
  @ApiModelProperty(value = "")
  public Entity getAttacker() {
    return attacker;
  }

  public void setAttacker(Entity attacker) {
    this.attacker = attacker;
  }

  public PhysicalAttackEvent defender(Entity defender) {
    this.defender = defender;
    return this;
  }

   /**
   * Get defender
   * @return defender
  **/
  @ApiModelProperty(value = "")
  public Entity getDefender() {
    return defender;
  }

  public void setDefender(Entity defender) {
    this.defender = defender;
  }

  public PhysicalAttackEvent damageDealt(Integer damageDealt) {
    this.damageDealt = damageDealt;
    return this;
  }

   /**
   * Get damageDealt
   * @return damageDealt
  **/
  @ApiModelProperty(value = "")
  public Integer getDamageDealt() {
    return damageDealt;
  }

  public void setDamageDealt(Integer damageDealt) {
    this.damageDealt = damageDealt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PhysicalAttackEvent physicalAttackEvent = (PhysicalAttackEvent) o;
    return Objects.equals(this.attacker, physicalAttackEvent.attacker) &&
        Objects.equals(this.defender, physicalAttackEvent.defender) &&
        Objects.equals(this.damageDealt, physicalAttackEvent.damageDealt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(attacker, defender, damageDealt);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PhysicalAttackEvent {\n");
    
    sb.append("    attacker: ").append(toIndentedString(attacker)).append("\n");
    sb.append("    defender: ").append(toIndentedString(defender)).append("\n");
    sb.append("    damageDealt: ").append(toIndentedString(damageDealt)).append("\n");
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

