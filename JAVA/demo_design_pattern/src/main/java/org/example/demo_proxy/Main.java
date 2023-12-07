package org.example.demo_proxy;

public class Main {

    public static void main(String[] args) {
        ProxyMedia media = new ProxyMedia(new Image());

        System.out.println(media.getContent());

        ProxyMedia mediaVideo = new ProxyMedia(new Video());
        System.out.println(mediaVideo.getContent());
    }
}
