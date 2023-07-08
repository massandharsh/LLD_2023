package solid.strategies;

public class HighFlyingStrategy implements FlyingStrategy{
    @Override
    public void makeFly() {
        System.out.println("Fly high");
    }
}
