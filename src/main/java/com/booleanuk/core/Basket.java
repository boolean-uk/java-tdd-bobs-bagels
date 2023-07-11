package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    private ArrayList<String> basket = new ArrayList<>();
    private int capacity;

    public Basket(int capacity) {
        this.capacity = capacity;
    }

    public ArrayList<String> getBasket() {
        return basket;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void add(String bagel) {
        if(checkBasket()){
            System.out.println("Basket is full!");
        } else {
            basket.add(bagel);
        }
    }

    public void remove(String bagel) {
        if(!checkSanity(bagel)){
            System.out.println("This bagel does not exist!");
        } else {
            basket.remove(bagel);
        }
    }

    public boolean checkSanity(String bagel){
        return basket.contains(bagel);
    }

    private boolean checkBasket() {
        return basket.size() == capacity;
    }
}
