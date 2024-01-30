package entity;

import org.example.entity.Mask;

public class LoseFakeWord implements Mask {
    @Override
    public String generateAWord() {
        return "perdu";
    }
}
