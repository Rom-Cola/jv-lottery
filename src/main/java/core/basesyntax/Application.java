package core.basesyntax;

public class Application {
    public static void main(String[] args) {
        // create three balls using class Lottery and print information about them in console
        Ball randomBall = new Lottery().getRandomBall();
        System.out.println(randomBall);
    }
}
