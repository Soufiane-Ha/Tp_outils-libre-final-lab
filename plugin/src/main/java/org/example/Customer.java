package org.example;

public class Customer {

    private String name;
    private String type;

    public Customer(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
