package org.example.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMask {
    private Random random;
    private List<String> listWord = new ArrayList<>();

    public String getRandomString(){
        String randomString = null;
        int i = random.nextInt(1, listWord.size());
        randomString = listWord.get(i);
        return randomString;
    }

}
