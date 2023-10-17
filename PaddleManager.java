package org.ulpgc.is1.control;
import org.ulpgc.is1.model.Customer;
import org.ulpgc.is1.model.NIF;

import java.util.ArrayList;

public class PaddleManager {
    // Atributes
    public ArrayList<Customer> customers;

    public void addCustomer(String name, String surname, NIF nif){
        Customer it = new Customer(name, surname, nif);
        if (!customers.contains(it)) customers.add(it);
    }
}
