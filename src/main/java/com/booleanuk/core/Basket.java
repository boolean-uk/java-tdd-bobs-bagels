package com.booleanuk.core;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;

public class Basket {
    ArrayList<String> basket;
    int basketSize;

    public Basket() {
        this.basket = new ArrayList<>();
        this.basketSize = 4;
    }

    public boolean add(String bagel) {
        if(this.basket.size() < this.basketSize) {
            basket.add(bagel);
            return basket.contains(bagel);
        }
        else {
            return false;
        }

    }

    public boolean remove(String bagel) {
        if(basket.contains(bagel)) {
            basket.remove(bagel);
            return true;
        }
        return false;
    }

    public boolean checkBasketSize() {
        return basket.size() <= basketSize;
    }

    public boolean changeBasketSize(int memberId, int newSize) {
        if(memberId == 0) {
            this.basketSize = newSize;
            return true;
        }
        else {
            return false;
        }
    }
}
