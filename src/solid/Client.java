package solid;

import solid.enums.Color;
import solid.strategies.HighFlyingStrategy;
import solid.strategies.LowFlyingStrategy;
import solid.strategies.LowPitchSoundingStrategy;

public class Client {
    //Liskov substitution principle
    public static void doFly(Flyable f){
        f.fly();
    }
    public static void main(String[] args) {
        Pigeon pigeon = new Pigeon(new LowPitchSoundingStrategy(),new HighFlyingStrategy());
        pigeon.setColor(Color.RED);
        pigeon.setWings(2);
        pigeon.setLegs(2);
        doFly(pigeon);
    }
}
