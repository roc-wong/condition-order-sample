package me.caosh.condition.domain.model.order;

import com.google.common.base.MoreObjects;
import me.caosh.condition.domain.model.market.RealTimeMarket;
import me.caosh.condition.domain.model.market.SecurityInfo;
import me.caosh.condition.domain.model.signal.TradeSignal;
import me.caosh.condition.domain.model.strategy.StrategyInfo;
import me.caosh.condition.domain.model.trade.EntrustCommand;

import java.time.LocalDateTime;

/**
 * Created by caosh on 2017/8/2.
 */
public abstract class ConditionOrder {
    private final Long orderId;
    private final TradeCustomerIdentity customerIdentity;
    private OrderState orderState;
    private final SecurityInfo securityInfo;
    private final StrategyInfo strategyInfo;
    private final Condition condition;
    private final TradePlan tradePlan;
    // TODO: add create/update time fields

    public ConditionOrder(Long orderId, TradeCustomerIdentity customerIdentity, OrderState orderState,
                          SecurityInfo securityInfo, StrategyInfo strategyInfo, Condition condition, TradePlan tradePlan) {
        this.orderId = orderId;
        this.customerIdentity = customerIdentity;
        this.orderState = orderState;
        this.securityInfo = securityInfo;
        this.strategyInfo = strategyInfo;
        this.condition = condition;
        this.tradePlan = tradePlan;
    }

    public Long getOrderId() {
        return orderId;
    }

    public TradeCustomerIdentity getCustomerIdentity() {
        return customerIdentity;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public SecurityInfo getSecurityInfo() {
        return securityInfo;
    }

    public StrategyInfo getStrategyInfo() {
        return strategyInfo;
    }

    public Condition getCondition() {
        return condition;
    }

    public TradePlan getTradePlan() {
        return tradePlan;
    }

    public abstract EntrustCommand onTradeSignal(TradeSignal signal, RealTimeMarket realTimeMarket);

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(ConditionOrder.class).omitNullValues()
                .addValue(ConditionOrder.class.getSuperclass() != Object.class ? super.toString() : null)
                .add("orderId", orderId)
                .add("customerIdentity", customerIdentity)
                .add("orderState", orderState)
                .add("securityInfo", securityInfo)
                .add("strategyInfo", strategyInfo)
                .add("condition", condition)
                .add("tradePlan", tradePlan)
                .toString();
    }
}
