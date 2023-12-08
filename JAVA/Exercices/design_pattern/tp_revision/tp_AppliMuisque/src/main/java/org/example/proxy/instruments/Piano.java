package org.example.proxy.instruments;

import org.example.proxy.Instruments;

public class Piano implements Instruments {
    @Override
    public String play() {
        return "Le piano joue";
    }
}
