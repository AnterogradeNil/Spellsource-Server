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
import com.hiddenswitch.spellsource.client.models.EntityState;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * EntityChangeSetInner
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class EntityChangeSetInner implements Serializable {
  private static final long serialVersionUID = 1L;

  /**
   * Describes a change to an entity. &#39;A&#39; corresponds to added/inserted, &#39;C&#39; corresponds to changed, &#39;R&#39; corresponds to removed. p0 is the previous value, if it exists. p1 is the current value. Only the entity&#39;s locatino is currently populated in this changeset. 
   */
  public enum OpEnum {
    A("A"),
    
    C("C"),
    
    R("R");

    private String value;

    OpEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static OpEnum fromValue(String text) {
      for (OpEnum b : OpEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("op")
  private OpEnum op = null;

  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("p0")
  private EntityState p0 = null;

  @JsonProperty("p1")
  private EntityState p1 = null;

  public EntityChangeSetInner op(OpEnum op) {
    this.op = op;
    return this;
  }

   /**
   * Describes a change to an entity. &#39;A&#39; corresponds to added/inserted, &#39;C&#39; corresponds to changed, &#39;R&#39; corresponds to removed. p0 is the previous value, if it exists. p1 is the current value. Only the entity&#39;s locatino is currently populated in this changeset. 
   * @return op
  **/
  @ApiModelProperty(value = "Describes a change to an entity. 'A' corresponds to added/inserted, 'C' corresponds to changed, 'R' corresponds to removed. p0 is the previous value, if it exists. p1 is the current value. Only the entity's locatino is currently populated in this changeset. ")
  public OpEnum getOp() {
    return op;
  }

  public void setOp(OpEnum op) {
    this.op = op;
  }

  public EntityChangeSetInner id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of the entity in this change set. 
   * @return id
  **/
  @ApiModelProperty(value = "The ID of the entity in this change set. ")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public EntityChangeSetInner p0(EntityState p0) {
    this.p0 = p0;
    return this;
  }

   /**
   * Get p0
   * @return p0
  **/
  @ApiModelProperty(value = "")
  public EntityState getP0() {
    return p0;
  }

  public void setP0(EntityState p0) {
    this.p0 = p0;
  }

  public EntityChangeSetInner p1(EntityState p1) {
    this.p1 = p1;
    return this;
  }

   /**
   * Get p1
   * @return p1
  **/
  @ApiModelProperty(value = "")
  public EntityState getP1() {
    return p1;
  }

  public void setP1(EntityState p1) {
    this.p1 = p1;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EntityChangeSetInner entityChangeSetInner = (EntityChangeSetInner) o;
    return Objects.equals(this.op, entityChangeSetInner.op) &&
        Objects.equals(this.id, entityChangeSetInner.id) &&
        Objects.equals(this.p0, entityChangeSetInner.p0) &&
        Objects.equals(this.p1, entityChangeSetInner.p1);
  }

  @Override
  public int hashCode() {
    return Objects.hash(op, id, p0, p1);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EntityChangeSetInner {\n");
    
    sb.append("    op: ").append(toIndentedString(op)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    p0: ").append(toIndentedString(p0)).append("\n");
    sb.append("    p1: ").append(toIndentedString(p1)).append("\n");
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

