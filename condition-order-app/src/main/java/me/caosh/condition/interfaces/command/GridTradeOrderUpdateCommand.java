package me.caosh.condition.interfaces.command;

import com.google.common.base.MoreObjects;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by caosh on 2017/8/9.
 */
public class GridTradeOrderUpdateCommand implements Serializable {
    private static final long serialVersionUID = 1L;

    @NotNull
    private Long orderId;
    @NotNull
    @DecimalMin("0")
    private BigDecimal gridLength;
    @NotNull
    @DecimalMin("0")
    private BigDecimal basePrice;
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

    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    public BigDecimal getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(BigDecimal basePrice) {
        this.basePrice = basePrice;
    }

    public BigDecimal getGridLength() {
        return gridLength;
    }

    public void setGridLength(BigDecimal gridLength) {
        this.gridLength = gridLength;
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
                .add("orderId", orderId)
                .add("gridLength", gridLength)
                .add("basePrice", basePrice)
                .add("entrustStrategy", entrustStrategy)
                .add("entrustMethod", entrustMethod)
                .add("entrustNumber", entrustNumber)
                .add("entrustAmount", entrustAmount)
                .toString();
    }
}
