package solid.strategies;

public class LowPitchSoundingStrategy implements SoundingStrategy{
    @Override
    public void makeSound() {
        System.out.println("Low Pitch Sound");
    }
}
