package org.example;

public class EconomicStrategy implements NavigationStrategy{
    @Override
    public boolean navigate(String destination) {

        System.out.println("On roule doucement vers " + destination);

        return true;
    }
}
