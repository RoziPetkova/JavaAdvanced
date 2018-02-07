package interfaces;

import java.lang.annotation.Target;

public interface Attacker {
    void attack();
    void setTarget(Target target);
}
