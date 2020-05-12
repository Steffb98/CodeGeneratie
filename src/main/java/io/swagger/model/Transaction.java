package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Transaction
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-05-12T14:12:41.521Z[GMT]")
public class Transaction   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("date")
  private OffsetDateTime date = null;

  @JsonProperty("amount")
  private Double amount = null;

  @JsonProperty("from")
  private String from = null;

  @JsonProperty("to")
  private String to = null;

  @JsonProperty("userId")
  private Long userId = null;

  /**
   * Specifies the type of transaction
   */
  public enum TransactionTypeEnum {
    TRANSFER("transfer"),
    
    DEPOSIT("deposit"),
    
    WITHDRAW("withdraw");

    private String value;

    TransactionTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TransactionTypeEnum fromValue(String text) {
      for (TransactionTypeEnum b : TransactionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("transactionType")
  private TransactionTypeEnum transactionType = null;

  public Transaction id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Transaction date(OffsetDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    @Valid
    public OffsetDateTime getDate() {
    return date;
  }

  public void setDate(OffsetDateTime date) {
    this.date = date;
  }

  public Transaction amount(Double amount) {
    this.amount = amount;
    return this;
  }

  /**
   * Get amount
   * @return amount
  **/
  @ApiModelProperty(example = "5000.5", required = true, value = "")
      @NotNull

    public Double getAmount() {
    return amount;
  }

  public void setAmount(Double amount) {
    this.amount = amount;
  }

  public Transaction from(String from) {
    this.from = from;
    return this;
  }

  /**
   * Get from
   * @return from
  **/
  @ApiModelProperty(example = "NL69INGB0123456789", required = true, value = "")
      @NotNull

    public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public Transaction to(String to) {
    this.to = to;
    return this;
  }

  /**
   * Get to
   * @return to
  **/
  @ApiModelProperty(example = "NL02ABNA0123456789", required = true, value = "")
      @NotNull

    public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public Transaction userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  **/
  @ApiModelProperty(required = true, value = "")
      @NotNull

    public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public Transaction transactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
    return this;
  }

  /**
   * Specifies the type of transaction
   * @return transactionType
  **/
  @ApiModelProperty(required = true, value = "Specifies the type of transaction")
      @NotNull

    public TransactionTypeEnum getTransactionType() {
    return transactionType;
  }

  public void setTransactionType(TransactionTypeEnum transactionType) {
    this.transactionType = transactionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Transaction transaction = (Transaction) o;
    return Objects.equals(this.id, transaction.id) &&
        Objects.equals(this.date, transaction.date) &&
        Objects.equals(this.amount, transaction.amount) &&
        Objects.equals(this.from, transaction.from) &&
        Objects.equals(this.to, transaction.to) &&
        Objects.equals(this.userId, transaction.userId) &&
        Objects.equals(this.transactionType, transaction.transactionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, amount, from, to, userId, transactionType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Transaction {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    transactionType: ").append(toIndentedString(transactionType)).append("\n");
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
