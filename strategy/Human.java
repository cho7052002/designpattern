import strategy.jump.JumpLow;
import strategy.jump.JumpStrategy;
import strategy.walk.WalkSlow;
import strategy.walk.WalkStrategy;

public class Human{
    private JumpStrategy jumpStrategy;
    private WalkStrategy walkStrategy;

    public Human(JumpStrategy jumpStrategy, WalkStrategy walkStrategy) {
        this.jumpStrategy = jumpStrategy;
        this.walkStrategy = walkStrategy;
    }

    public Human() {
        this.jumpStrategy = new JumpLow();
        this.walkStrategy = new WalkSlow();
    }

    public void setJumpStrategy(JumpStrategy jumpStrategy) {
        this.jumpStrategy = jumpStrategy;
    }

    public void setWalkStrategy(WalkStrategy walkStrategy) {
        this.walkStrategy = walkStrategy;
    }

    public void jump(){
        jumpStrategy.jump();
    }

    public void walk(){
        walkStrategy.walk();
    }
}
