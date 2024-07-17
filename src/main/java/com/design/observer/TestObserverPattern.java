package com.design.observer;

public class TestObserverPattern {
    public static void main(String[] args) {
        Product product = new Product();

        Observer customer1 = new Customer("Alice");
        Observer customer2 = new Customer("Bob");
        Observer store = new Store("TechStore");
        Observer supplier = new Supplier("TechSupplier");

        product.registerObserver(customer1);
        product.registerObserver(customer2);
        product.registerObserver(store);
        product.registerObserver(supplier);

        product.addProduct("Laptop");
        product.removeProduct("Laptop");
    }
}
