package solid;

import solid.strategies.FlyingStrategy;
import solid.strategies.HighFlyingStrategy;
import solid.strategies.LowPitchSoundingStrategy;
import solid.strategies.SoundingStrategy;

public class Pigeon extends Bird implements Soundable,Flyable{
    //Composition
    //Dependency inversion
    private final SoundingStrategy soundingStrategy;
    private final FlyingStrategy flyingStrategy;

    //Dependency injection
    public Pigeon(SoundingStrategy soundingStrategy,FlyingStrategy flyingStrategy){
        this.soundingStrategy = soundingStrategy;
        this.flyingStrategy = flyingStrategy;
    }
    @Override
    public void fly() {
        flyingStrategy.makeFly();
    }

    @Override
    public void sound() {
        soundingStrategy.makeSound();
    }
}
