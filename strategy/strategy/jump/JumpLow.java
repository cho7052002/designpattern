package strategy.jump;

public class JumpLow implements JumpStrategy {
    @Override
    public void jump() {
        jumpLow();
    }

    private void jumpLow(){
        System.out.println("jump 0.1m");
    }
}
