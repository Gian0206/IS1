package org.ulpgc.is1.model;

import java.util.Objects;

public class Customer {
    // Atributes
    private final String name;
    private final String surname;
    private final NIF nif;

    // Constructor
    public Customer(String name, String surname, NIF nif){
        this.name = name;
        this.surname = surname;
        this.nif = nif;
    }


    // Getters
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public NIF getNif() {
        return nif;
    }

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        return Objects.equals(this.getName(), ((Customer) o).getName());
    }
}
