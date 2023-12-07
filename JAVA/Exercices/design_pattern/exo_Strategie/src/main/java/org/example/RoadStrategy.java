package org.example;


public class RoadStrategy implements NavigationStrategy{

    @Override
    public boolean navigate(String destination) {
        System.out.println("en route vers " + destination);

        return true;
    }
}
