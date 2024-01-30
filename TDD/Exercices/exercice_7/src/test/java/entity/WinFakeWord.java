package entity;

import org.example.entity.Mask;

public class WinFakeWord implements Mask {
    @Override
    public String generateAWord() {
        return "toto";
    }
}
