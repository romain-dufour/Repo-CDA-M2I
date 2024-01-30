package org.example.entity;

public class LePendu {

    private RandomMask randomMask;
    public LePendu (RandomMask randomMask) {
        this.randomMask = randomMask;

    }

    public LePendu() {
    }

    public RandomMask getRandomMask() {
        return randomMask;
    }

    public void setRandomMask(RandomMask randomMask) {
        this.randomMask = randomMask;
    }

    public static boolean containsChar(String mot, char caractere) {
        return mot.indexOf(caractere) != -1;
    }

    public boolean isACharInTheWord(char caractereRecherche){
        return containsChar(getRandomMask().getRandomString(), caractereRecherche);
    }

    public boolean isThePlayerWin(String Word){
        return (getRandomMask().getRandomString()).equals(Word);
    }
}
