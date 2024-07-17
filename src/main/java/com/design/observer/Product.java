package com.design.observer;

import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {
    private List<Observer> observers;
    private String productName;

    public Product() {
        this.observers = new ArrayList<>();
    }

    public void addProduct(String productName) {
        this.productName = productName;
        System.out.println("Product added: " + productName);
        notifyObservers();
    }

    public void removeProduct(String productName) {
        this.productName = productName;
        System.out.println("Product removed: " + productName);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(productName);
        }
    }
}
