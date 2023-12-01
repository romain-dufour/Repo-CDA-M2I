package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDate;
import java.time.LocalTime;

@AllArgsConstructor
@ToString
public class Event {
    @Setter
    @Getter
    private String name;
    @Setter
    @Getter
    private LocalDate localDate;
    @Setter
    @Getter
    private LocalTime localTime ;
    @Setter
    @Getter
    private Place place;
    @Setter
    @Getter
    private double price;
    @Setter
    @Getter
    private int soldTicketQuantity;


    public boolean isTicketAvailable(Event event,int quantity){
if ((event.place.getCapacity() - (event.soldTicketQuantity + quantity)) >= 0){
        return true;
}
        return false;
    }



}
