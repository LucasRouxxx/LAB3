package com.design.observer;

public class Supplier implements Observer {
    private String supplierName;

    public Supplier(String supplierName) {
        this.supplierName = supplierName;
    }

    @Override
    public void update(String product) {
        System.out.println("Supplier " + supplierName + ", Product updated: " + product);
    }
}
