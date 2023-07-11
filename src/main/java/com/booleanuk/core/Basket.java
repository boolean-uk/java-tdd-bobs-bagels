package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    List<String> bagels = new ArrayList<>();
    int capacity = 3;
    double bagelPrice = 8.99;

    public List<String> getBagels() {
        return bagels;
    }

    public int getCapacity() {
        return capacity;
    }

    public void add(String bagel) {
        if (isFull()) {
            System.out.println("Basket is full.");
            return;
        }
        bagels.add(bagel);
    }

    public void remove(String bagel) {
        if (doesBagelExist(bagel)) {
            bagels.remove(bagel);
        } else {
            System.out.println("Bagel does not exist.");
        }
    }

    public boolean isFull() {
        if (bagels.size() < capacity) return false;
        else return true;
    }

    public void setCapacity(int newCapacity) {
        if (newCapacity < bagels.size()) {
            System.out.println("You cannot change capacity.");
            return;
        }
        capacity = newCapacity;
    }

    public boolean doesBagelExist(String bagel) {
        return bagels.contains(bagel);
    }

    public void empty() {
        bagels.clear();
    }

    public int getAvailableCapacity() {
        return capacity - bagels.size();
    }

    public double checkPrice() {
        return bagelPrice;
    }

    public void setPrice(double newBagelPrice) {
        if (newBagelPrice > 0) {
            bagelPrice = newBagelPrice;
        } else {
            System.out.println("Price must be greater than 0.");
        }
    }

    public double getTotalPrice() {
        return bagelPrice * bagels.size();
    }
}
