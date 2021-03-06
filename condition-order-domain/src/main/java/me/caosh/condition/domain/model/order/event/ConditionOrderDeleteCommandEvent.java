package me.caosh.condition.domain.model.order.event;

import com.google.common.base.MoreObjects;

/**
 * Created by caosh on 2017/8/11.
 *
 * @author caoshuhao@touker.com
 */
public class ConditionOrderDeleteCommandEvent implements ConditionOrderCommandEvent {
    private final Long orderId;

    public ConditionOrderDeleteCommandEvent(Long orderId) {
        this.orderId = orderId;
    }

    public Long getOrderId() {
        return orderId;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("orderId", orderId)
                .toString();
    }
}
