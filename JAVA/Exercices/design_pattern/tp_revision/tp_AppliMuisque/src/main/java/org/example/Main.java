package org.example;

import org.example.Compositions.Composition;
import org.example.proxy.Instruments;
import org.example.proxy.ProxyInstrument;
import org.example.proxy.instruments.Flute;
import org.example.proxy.instruments.Piano;
import org.example.proxy.instruments.Violon;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        ProxyInstrument proxyPiano = new ProxyInstrument(new Piano());
        ProxyInstrument proxyViolon = new ProxyInstrument(new Violon());
        ProxyInstrument proxyFlute = new ProxyInstrument(new Flute());
     //   Instruments piano = new Piano();
     //   Instruments flute = new Flute();
      //  Instruments violon = new Violon();

        Composition fluteEnchantee = new Composition.Builder()
                .titre("flute enchantee")
                .compositeur("Mozart")
                .instruments(proxyPiano).instruments(proxyFlute)
                .build();


        Composition cinquiemeSymphonie = new Composition.Builder()
                .titre("cinquieme Symphonie")
                .compositeur("Mozart")
                .instruments(proxyPiano).instruments(proxyFlute).instruments(proxyViolon)
                .build();

        System.out.println(proxyPiano.play());
        System.out.println(fluteEnchantee);
        System.out.println(proxyPiano.play());
        System.out.println(proxyFlute.play());
        System.out.println(cinquiemeSymphonie);
        System.out.println(proxyPiano.play());
        System.out.println(proxyFlute.play());
        System.out.println(proxyViolon.play());

        //System.out.println(piano.play());

        MusicAppSettings.getInstance().setVolume(80);
        MusicAppSettings.getInstance().setBasseLevel(60);
    }
}