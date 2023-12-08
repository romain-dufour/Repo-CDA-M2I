package org.example.proxy.instruments;

import org.example.proxy.Instruments;

public class Violon implements Instruments {
    @Override
    public String play() {
        return "Le violon joue";
    };
}
