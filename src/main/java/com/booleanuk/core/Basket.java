package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Arrays;

public class Basket {
    ArrayList<String> bagels;
    final String[] allowedTypes;
    int basketSize;
    int standardBasketSize = 10;
    boolean userIsBob;

    public Basket() {
        userIsBob = false;
        bagels = new ArrayList<>();
        allowedTypes = new String[]{"everything", "whole_wheat", "chocolate_chip", "onion", "sesame", "poppy"};
        basketSize = standardBasketSize;
    }

    public Basket(int basketSize) {
        userIsBob = false;
        bagels = new ArrayList<>();
        allowedTypes = new String[]{"everything", "whole_wheat", "chocolate_chip", "onion", "sesame", "poppy"};
        this.basketSize = basketSize;
    }

    public Basket(int basketSize, boolean userIsBob) {
        this.userIsBob = userIsBob;
        bagels = new ArrayList<>();
        allowedTypes = new String[]{"everything", "whole_wheat", "chocolate_chip", "onion", "sesame", "poppy"};
        this.basketSize = basketSize;
    }

    public void addToBasket(String bagelType, int amount) {
        if (!Arrays.asList(allowedTypes).contains(bagelType) || bagels.size() + amount > basketSize) return;
        for (int i = 0; i < amount; i++) {
            bagels.add(bagelType);
        }
    }

    public ArrayList<String> getBasket() {
        return bagels;
    }

    public boolean order() {
        System.out.printf("Order of %d bagels sent", bagels.size());
        bagels = new ArrayList<>();
        return true;
    }

    public boolean contains(String bagelType) {
        return bagels.contains(bagelType);
    }

    public void remove(String bagelType) {
        bagels.remove(bagelType);
    }

    public void setBasketSize(int basketSize) {
        if (userIsBob) {
            this.basketSize = basketSize;
            standardBasketSize = basketSize;
        }
    }
}
