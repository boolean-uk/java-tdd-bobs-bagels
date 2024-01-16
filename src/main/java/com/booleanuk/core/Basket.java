package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BooleanSupplier;

public class Basket {
    private Map<String, Double> items;
    private int capacity;
    private int managerCode = 1234;

    public Basket() {
        this.items = new HashMap<>();
        this.capacity = 6;
    }

    public void add(String bagel, double price) {
        if (!isFull());
        {
            items.put(bagel, price);
            System.out.println("Added " + bagel +" to basket");
        }
        System.out.println("Basket is full.");
    }
    public boolean isFull() {
        return items.size() >= capacity;
    }

    public boolean isNotEmpty(String bagel){
        if (items.containsKey(bagel)) {
            return true;
        } else {
            return false;
        }
    }
    public void remove(String bagel) {
        if (items.containsKey(bagel)) {
            items.remove(bagel);
            System.out.println("Removed " + bagel + " from basket.");
        } System.out.println(bagel + " not in basket.");
    }

    public Map<String, Double> getItems() {
        return items;
    }

    public boolean isManager(int password) {
        return password == managerCode;
    }

    public int changeCap(int newCapacity, int password) {
        if (isManager(password)) {
            this.capacity = newCapacity;
            System.out.println("Password correct, capacity is updated!");
            return newCapacity;
        } else {
            System.out.println("Password incorrect, capacity is not updated!");
            return this.capacity; // Return the current capacity if the password is incorrect
        }
    }

    public int getCapacity() {
        return capacity;
    }
}

