package strategy.jump;

public class JumpHigh implements JumpStrategy {
    @Override
    public void jump() {
        jumpHigh();
    }

    private void jumpHigh(){
        System.out.println("jumps 5m");
    }
}
