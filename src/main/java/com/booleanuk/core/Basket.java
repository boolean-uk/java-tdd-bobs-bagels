package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> basket;
    int maxCapBasket;

    public Basket() {
        this.basket = new ArrayList<>();
        this.maxCapBasket = 6;
    }

    public boolean add(String product) {
        if (checkBasket() >= maxCapBasket) {
            return false;
        }
        basket.add(product);
        return basket.contains(product);
    }

    public boolean remove(String product) {
        basket.remove(product);
        return basket.contains(product);
    }

    public boolean changeCapBasket(int currentCapBasket, int newCapBasket) {
        if (currentCapBasket == 0) {
            this.maxCapBasket = newCapBasket;
            return true;
        }
        else {
            return false;
        }
    }

    public int checkBasket() {
        return basket.size();
    }
}
