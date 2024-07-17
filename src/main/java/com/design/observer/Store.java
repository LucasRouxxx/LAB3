package com.design.observer;

public class Store implements Observer {
    private String storeName;

    public Store(String storeName) {
        this.storeName = storeName;
    }

    @Override
    public void update(String product) {
        System.out.println("Store " + storeName + ", Product updated: " + product);
    }
}