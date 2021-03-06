package me.caosh.condition.domain.model.order.plan;

import com.google.common.base.MoreObjects;
import me.caosh.condition.domain.model.constants.EntrustMethod;

import java.math.BigDecimal;

/**
 * Created by caosh on 2017/8/17.
 */
public class TradeNumberDirect implements TradeNumber {
    private final int number;

    public TradeNumberDirect(int number) {
        this.number = number;
    }

    @Override
    public EntrustMethod getEntrustMethod() {
        return EntrustMethod.NUMBER;
    }

    @Override
    public int getNumber(BigDecimal price) {
        return number;
    }

    public int getNumber() {
        return number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TradeNumberDirect)) return false;

        TradeNumberDirect that = (TradeNumberDirect) o;

        return number == that.number;

    }

    @Override
    public int hashCode() {
        return number;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("number", number)
                .toString();
    }

    @Override
    public void accept(TradeNumberVisitor visitor) {
        visitor.visitTradeNumberDirect(this);
    }
}
