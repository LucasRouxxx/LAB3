package com.design.observer;

public class Customer implements Observer {
    private String customerName;

    public Customer(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public void update(String product) {
        System.out.println("Hello " + customerName + ", Product updated: " + product);
    }
}