package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//import java.util.*;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

@AllArgsConstructor
@ToString
public class Customer {
    private static int count = 0;

    @Setter
    @Getter
    private String firstName;
    @Setter
    @Getter
    private String lastName;
    @Setter
    @Getter
    private static String eMail;
    @Setter
    @Getter
    private static List<Event> soldTicketList = new ArrayList<>();
    private static List<Place> placeList = new ArrayList<>();
    @Setter
    @Getter
    private static List<Event> EventList = new ArrayList<>();

    public static HashMap<Integer, Customer> customerList = new HashMap<>();


    public Customer(String firstName, String lastName, String eMail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.eMail = eMail;
    }

    public boolean buyTicket(Event event, int quantity) {
        return false;
    }

    public boolean deleteTicketBought(Event event) {
        return false;
    }

    public static boolean addCustomer(String firstName, String lastName, String eMail) {
        Customer customer = new Customer(firstName, lastName, eMail);

        for (Customer existingCustomer : customerList.values()) {
            if (existingCustomer.getFirstName().equals(firstName) &&
                    existingCustomer.getLastName().equals(lastName) &&
                    existingCustomer.getEMail().equals(eMail)) {

// TODO: 01/12/2023 voir pour lever des exceptions
                return false;
            }
        }
        customerList.put(++count, customer);
        return true;
    }


    public static boolean updateCustomer(Integer key, String newFirstName, String newLastName, String newEMail) {
        Iterator<Map.Entry<Integer, Customer>> iterator = customerList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Customer> entry = iterator.next();
            Customer existingCustomer = entry.getValue();
            if (existingCustomer.getEMail().equals(eMail)) {
                // Mettre à jour les informations du client
                existingCustomer.setFirstName(newFirstName);
                existingCustomer.setLastName(newLastName);
                existingCustomer.setEMail(newEMail);

                // TODO: Voir pour lever des exceptions
                return true;
            }
        }
        return false;
    }


            public static boolean removeCustomer (String eMail){
                Iterator<Map.Entry<Integer, Customer>> iterator = customerList.entrySet().iterator();

                while (iterator.hasNext()) {
                    Map.Entry<Integer, Customer> entry = iterator.next();
                    Customer existingCustomer = entry.getValue();
                    if (existingCustomer.getEMail().equals(eMail)) {
                        Integer keytoremove = entry.getKey();
                        iterator.remove();

// TODO: 01/12/2023 voir pour lever des exceptions
                        return true;
                    }
                }
                return false;
            }



    public static boolean sellATicket(Event event, int quantity, Integer key) {
        if ((event.getPlace().getCapacity() - (event.getSoldTicketQuantity() + quantity)) < 0) {
            return false;
        } else {
            if (customerList.containsKey(key)) {
                //   Customer customer = customerList.get(key);
                for (int i = 0; i < quantity; i++) {
                    soldTicketList.add(event);
                }
                int soldTicketQuantity = event.getSoldTicketQuantity();
                soldTicketQuantity += quantity;
                event.setSoldTicketQuantity(soldTicketQuantity);
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean deleteASell(Event event, Integer key) {
        if (customerList.containsKey(key)) {
            Customer customer = customerList.get(key);

            if (customer.getSoldTicketList().contains(event)) {
                customer.getSoldTicketList().remove(event);

                int soldTicketQuantity = event.getSoldTicketQuantity();
                soldTicketQuantity -= 1;
                event.setSoldTicketQuantity(soldTicketQuantity);

                return true;
            }
        }
        return false;
    }

    public static boolean addPlace(String name, String adress, Integer capacity){
        Place newPlace = new Place(name,adress,capacity);
        placeList.add(newPlace);
        return true;
    }

    public static boolean updatePlace(String nameToFind, String newAddress, Integer newCapacity) {
        for (Place place : placeList) {
            if (place.getName().equals(nameToFind)) {
                place.setName(nameToFind);
                place.setAddress(newAddress);
                place.setCapacity(newCapacity);
                return true;
            }
        }
        return false;
    }

    public static boolean removePlace(String nameToRemove) {
        Iterator<Place> iterator = placeList.iterator();
        while (iterator.hasNext()) {
            Place place = iterator.next();
            if (place.getName().equals(nameToRemove)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }



    public static boolean addEvent(String name, LocalDate localDate, LocalTime localTime, Place place,double price){
        Event newEvent = new Event(name,localDate,localTime,place,price);
        EventList.add(newEvent);
        return true;
    }

    public static boolean updateEvent(String nameToFind,LocalDate newLocalDate, LocalTime newLocalTime, Place newPlace,double newPrice){
        for (Event event : EventList) {
            if (event.getName().equals(nameToFind)) {
                event.setName(nameToFind);
                event.setLocalDate(newLocalDate);
                event.setLocalTime(newLocalTime);
                event.setPlace(newPlace);
                event.setPrice(newPrice);
                return true;
            }
        }
        return false;
    }

    public static boolean removeEvent(String nameToRemove){
        Iterator<Event> iterator = EventList.iterator();
        while (iterator.hasNext()) {
            Event event = iterator.next();
            if (event.getName().equals(nameToRemove)) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }
}

