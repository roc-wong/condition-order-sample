package me.caosh.condition.application.order;

import me.caosh.condition.domain.model.order.TriggerContext;

/**
 * Created by caosh on 2017/8/13.
 *
 * @implNote 仅作示例，没有并发控制不可用于生产
 */
public interface ConditionOrderTradeCenter {
    void handleTriggerContext(TriggerContext triggerContext);
}
