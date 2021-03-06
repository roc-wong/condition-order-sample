package me.caosh.condition.interfaces.command;

import com.google.common.base.MoreObjects;
import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by caosh on 2017/8/9.
 */
public class TurnUpBuyOrderCreateCommand implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    @Range(min = 1, max = 2)
    private Integer securityType;
    @NotBlank
    @Length(min = 6, max = 6)
    private String securityCode;
    @NotBlank
    @Length(min = 2, max = 2)
    private String securityExchange;
    @NotBlank
    @Length(min = 1, max = 4)
    private String securityName;
    @NotNull
    @DecimalMin("0")
    private BigDecimal breakPrice;
    @NotNull
    @DecimalMin("0")
    private BigDecimal turnUpPercent;
    @NotNull
    @Range(min = 1, max = 11)
    private Integer entrustStrategy;
    @NotNull
    @Range(min = 0, max = 1)
    private Integer entrustMethod;
    @Min(100)
    private Integer entrustNumber;
    @DecimalMin("1")
    private BigDecimal entrustAmount;

    public Integer getSecurityType() {
        return securityType;
    }

    public void setSecurityType(Integer securityType) {
        this.securityType = securityType;
    }

    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getSecurityExchange() {
        return securityExchange;
    }

    public void setSecurityExchange(String securityExchange) {
        this.securityExchange = securityExchange;
    }

    public String getSecurityName() {
        return securityName;
    }

    public void setSecurityName(String securityName) {
        this.securityName = securityName;
    }

    public BigDecimal getBreakPrice() {
        return breakPrice;
    }

    public void setBreakPrice(BigDecimal breakPrice) {
        this.breakPrice = breakPrice;
    }

    public BigDecimal getTurnUpPercent() {
        return turnUpPercent;
    }

    public void setTurnUpPercent(BigDecimal turnUpPercent) {
        this.turnUpPercent = turnUpPercent;
    }

    public Integer getEntrustMethod() {
        return entrustMethod;
    }

    public void setEntrustMethod(Integer entrustMethod) {
        this.entrustMethod = entrustMethod;
    }

    public Integer getEntrustStrategy() {
        return entrustStrategy;
    }

    public void setEntrustStrategy(Integer entrustStrategy) {
        this.entrustStrategy = entrustStrategy;
    }

    public Integer getEntrustNumber() {
        return entrustNumber;
    }

    public void setEntrustNumber(Integer entrustNumber) {
        this.entrustNumber = entrustNumber;
    }

    public BigDecimal getEntrustAmount() {
        return entrustAmount;
    }

    public void setEntrustAmount(BigDecimal entrustAmount) {
        this.entrustAmount = entrustAmount;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("securityType", securityType)
                .add("securityCode", securityCode)
                .add("securityExchange", securityExchange)
                .add("securityName", securityName)
                .add("breakPrice", breakPrice)
                .add("turnUpPercent", turnUpPercent)
                .add("entrustStrategy", entrustStrategy)
                .add("entrustMethod", entrustMethod)
                .add("entrustNumber", entrustNumber)
                .add("entrustAmount", entrustAmount)
                .toString();
    }
}
