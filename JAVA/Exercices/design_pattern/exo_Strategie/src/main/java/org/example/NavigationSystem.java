package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NavigationSystem {
    private NavigationStrategy navigationStrategy;

    public NavigationSystem(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void setNavigationStrategy(NavigationStrategy navigationStrategy) {
        this.navigationStrategy = navigationStrategy;
    }

    public void navigate(String destination) {
        navigationStrategy.navigate(destination);
    }

//    public void setDestination(String destination) {
//        this.destination = destination;
//    }
//
//    public void navigate(String destination){
//
//        setDestination(destination);
//    }
}
