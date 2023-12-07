package org.example;

public class OffroadStrategy implements NavigationStrategy{
    @Override
    public boolean navigate(String destination) {
        System.out.println("en 4x4 vers " + destination);
        return true;
    }


}
