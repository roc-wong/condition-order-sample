package me.caosh.condition.domain.model.order.event;

import me.caosh.condition.domain.model.constants.OrderCommandType;
import me.caosh.condition.domain.model.order.ConditionOrder;

/**
 * Created by caosh on 2017/8/11.
 *
 * @author caoshuhao@touker.com
 */
public class ConditionOrderCreateCommandEvent implements ConditionOrderCommandEvent {
    private final ConditionOrder conditionOrder;

    public ConditionOrderCreateCommandEvent(ConditionOrder conditionOrder) {
        this.conditionOrder = conditionOrder;
    }

    public ConditionOrder getConditionOrder() {
        return conditionOrder;
    }
}
