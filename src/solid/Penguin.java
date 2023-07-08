package solid;

import solid.strategies.LowPitchSoundingStrategy;
import solid.strategies.SoundingStrategy;

public class Penguin extends Bird implements Soundable{
    private final SoundingStrategy soundingStrategy;
    public Penguin(SoundingStrategy soundingStrategy){
        this.soundingStrategy = soundingStrategy;
    }
    @Override
    public void sound() {
        soundingStrategy.makeSound();
    }
}
