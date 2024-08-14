package com.booleanuk.core;


import java.util.HashMap;

public class Basket {
    // TODO: Difference between ArrayList and simple List??
    // TODO: Should this be private variables?
    HashMap<String, Integer> products;
    int maxCapacity;
    int size = 0;

    public Basket() {
        this.products = new HashMap<>();
        this.maxCapacity = 3;
    }

    public boolean add(String productName) {
        // Check if max capacity
        if (this.size >= maxCapacity) {
            System.out.println("Basket is full, can't add more items.");
            return false;
        }

        // List properties
        int numOfProducts;

        // Update numOfProducts if already exist, otherwise just add
        if (products.containsKey(productName)) {
            numOfProducts = products.get(productName) + 1;
        } else {
            numOfProducts = 1;
        }

        // Add product
        products.put(productName, numOfProducts);

        // Update size
        size++;

        return true;
    }

    public boolean remove(String productName) {

        // Check if product does not exist
        if (!this.products.containsKey(productName)) {
            System.out.println("Product does not exist. Can't remove.");
            return false;
        }

        // Update quantity if already in list, remove if it is the last product in this type/category
        int newNumOfProducts = this.products.get(productName) - 1;
        if (newNumOfProducts == 0) {
            this.products.remove(productName);
        } else {
            this.products.put(productName, newNumOfProducts);
        }

        // Update size
        size--;

        return true;
    }

    public boolean changeCapacity(int newMaxCapacity) {
        if (newMaxCapacity < 1) {
            System.out.println("Invalid max capacity. Can't be less than 1");
            return false;
        }
        this.maxCapacity = newMaxCapacity;
        return true;
    }
}
