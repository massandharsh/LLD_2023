package solid.strategies;

public class LowFlyingStrategy implements FlyingStrategy{
    @Override
    public void makeFly() {
        System.out.println("Fly low");
    }
}
