package models.behavors;

import interfaces.Behavior;

public abstract class AbstractBehavior implements Behavior {

    private boolean isTriggered;

    protected AbstractBehavior() {
    }

    @Override
    public boolean isTriggered() {
        return this.isTriggered;
    }

    public void setIsTriggered() {
        this.isTriggered = true;
    }
}
