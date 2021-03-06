package me.caosh.condition.domain.model.order.time;

import com.google.common.base.MoreObjects;
import me.caosh.condition.domain.model.order.ConditionVisitor;
import me.caosh.condition.domain.model.order.TimeCondition;

import java.time.LocalDateTime;

/**
 * Created by caosh on 2017/8/20.
 */
public class SimpleTimeCondition implements TimeCondition {
    private final LocalDateTime targetTime;

    public SimpleTimeCondition(LocalDateTime targetTime) {
        this.targetTime = targetTime;
    }

    public LocalDateTime getTargetTime() {
        return targetTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SimpleTimeCondition)) return false;

        SimpleTimeCondition that = (SimpleTimeCondition) o;

        return !(targetTime != null ? !targetTime.equals(that.targetTime) : that.targetTime != null);

    }

    @Override
    public int hashCode() {
        return targetTime != null ? targetTime.hashCode() : 0;
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .add("targetTime", targetTime)
                .toString();
    }

    @Override
    public boolean isSatisfiedNow() {
        return LocalDateTime.now().isAfter(targetTime);
    }

    @Override
    public void accept(ConditionVisitor visitor) {
        visitor.visitSimpleTimeCondition(this);
    }
}
