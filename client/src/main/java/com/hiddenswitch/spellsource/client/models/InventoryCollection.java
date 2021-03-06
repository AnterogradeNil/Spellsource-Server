/*
 * Hidden Switch Spellsource API
 * The Spellsource API for matchmaking, user accounts, collections management and more.  To get started, create a user account and make sure to include the entirety of the returned login token as the X-Auth-Token header. You can reuse this token, or login for a new one.  ClientToServerMessage and ServerToClientMessage are used for the realtime game state and actions two-way websocket interface for actually playing a game. Envelope is used for the realtime API services. 
 *
 * OpenAPI spec version: 2.1.0
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
import com.hiddenswitch.spellsource.client.models.CardRecord;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * InventoryCollection
 */
@JsonInclude(JsonInclude.Include.NON_DEFAULT)

public class InventoryCollection implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("_id")
  private String id = null;

  @JsonProperty("userId")
  private String userId = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("heroClass")
  private String heroClass = null;

  @JsonProperty("format")
  private String format = null;

  /**
   * Gets or Sets type
   */
  public enum TypeEnum {
    USER("USER"),
    
    ALLIANCE("ALLIANCE"),
    
    DECK("DECK");

    private String value;

    TypeEnum(String value) {
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
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("type")
  private TypeEnum type = null;

  /**
   * Gets or Sets deckType
   */
  public enum DeckTypeEnum {
    DRAFT("DRAFT"),
    
    CONSTRUCTED("CONSTRUCTED");

    private String value;

    DeckTypeEnum(String value) {
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
    public static DeckTypeEnum fromValue(String text) {
      for (DeckTypeEnum b : DeckTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("deckType")
  private DeckTypeEnum deckType = null;

  @JsonProperty("inventory")
  private List<CardRecord> inventory = null;

  public InventoryCollection id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InventoryCollection userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(value = "")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }

  public InventoryCollection name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(value = "")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InventoryCollection heroClass(String heroClass) {
    this.heroClass = heroClass;
    return this;
  }

   /**
   * Get heroClass
   * @return heroClass
  **/
  @ApiModelProperty(value = "")
  public String getHeroClass() {
    return heroClass;
  }

  public void setHeroClass(String heroClass) {
    this.heroClass = heroClass;
  }

  public InventoryCollection format(String format) {
    this.format = format;
    return this;
  }

   /**
   * Get format
   * @return format
  **/
  @ApiModelProperty(value = "")
  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public InventoryCollection type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public InventoryCollection deckType(DeckTypeEnum deckType) {
    this.deckType = deckType;
    return this;
  }

   /**
   * Get deckType
   * @return deckType
  **/
  @ApiModelProperty(value = "")
  public DeckTypeEnum getDeckType() {
    return deckType;
  }

  public void setDeckType(DeckTypeEnum deckType) {
    this.deckType = deckType;
  }

  public InventoryCollection inventory(List<CardRecord> inventory) {
    this.inventory = inventory;
    return this;
  }

  public InventoryCollection addInventoryItem(CardRecord inventoryItem) {
    if (this.inventory == null) {
      this.inventory = new ArrayList<>();
    }
    this.inventory.add(inventoryItem);
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @ApiModelProperty(value = "")
  public List<CardRecord> getInventory() {
    return inventory;
  }

  public void setInventory(List<CardRecord> inventory) {
    this.inventory = inventory;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InventoryCollection inventoryCollection = (InventoryCollection) o;
    return Objects.equals(this.id, inventoryCollection.id) &&
        Objects.equals(this.userId, inventoryCollection.userId) &&
        Objects.equals(this.name, inventoryCollection.name) &&
        Objects.equals(this.heroClass, inventoryCollection.heroClass) &&
        Objects.equals(this.format, inventoryCollection.format) &&
        Objects.equals(this.type, inventoryCollection.type) &&
        Objects.equals(this.deckType, inventoryCollection.deckType) &&
        Objects.equals(this.inventory, inventoryCollection.inventory);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, userId, name, heroClass, format, type, deckType, inventory);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InventoryCollection {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    heroClass: ").append(toIndentedString(heroClass)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    deckType: ").append(toIndentedString(deckType)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
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

