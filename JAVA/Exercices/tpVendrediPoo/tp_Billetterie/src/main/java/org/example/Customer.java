package org.example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.*;

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
    private String eMail;
    @Setter
    @Getter
    private List<Event> soldTicketList = new ArrayList<>();

    public HashMap<Integer, Customer> customerList = new HashMap<>();


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

    public boolean addCustomer(String firstName, String lastName, String eMail) {
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


    public boolean updateCustomer(Integer key) {
        Iterator<Map.Entry<Integer, Customer>> iterator = customerList.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Integer, Customer> entry = iterator.next();
            Customer existingCustomer = entry.getValue();
            if (existingCustomer.getEMail().equals(eMail)) {
                Integer keytoremove = entry.getKey();
                iterator.remove();

                for (existingCustomer : customerList.values()) {
                    if (existingCustomer.getEMail().equals(eMail)) {
                        return false;
                    }
                    return true;

                }
                return true;
            }

        }
    }
            public boolean removeCustomer (String eMail){
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



    public boolean sellATicket(Event event, int quantity, Integer key) {
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

    public boolean deleteASell(Event event, Integer key) {
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
}

