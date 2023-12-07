package org.example;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class NavigationSystem {
    private String destination;

    public void navigate(NavigationStrategy navigationStrategy){
        if (navigationStrategy.navigate(destination)){
            System.out.println("C'est parti les copains");
        } else {
            System.out.println("On est en panne");
        }
    }
}
