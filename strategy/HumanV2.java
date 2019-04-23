import strategy.jump.JumpHigh;
import strategy.walk.WalkFast;

public class HumanV2 extends Human {
    public HumanV2() {
        super(new JumpHigh(), new WalkFast());
    }
}
