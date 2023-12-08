package org.example.proxy;

public class ProxyInstrument implements Instruments{
    private Instruments instruments;
    public ProxyInstrument(Instruments instruments){
        this.instruments = instruments;
    }

    @Override
    public String play() {
        System.out.println("Proxy Check");
        return instruments.play();
    }
}
