import strategy.jump.JumpHigh;
import strategy.walk.WalkFast;

public class Main {
    public static void main(String[] args) {
        Human man = new Human();
        HumanV2 superman = new HumanV2();

        System.out.println("man is...");
        man.walk();
        man.jump();

        System.out.println("superman is...");
        superman.walk();
        superman.jump();

        System.out.println("man evolving...");
        man.setJumpStrategy(new JumpHigh());
        man.setWalkStrategy(new WalkFast());

        System.out.println("man is...");
        man.walk();
        man.jump();
    }
}
