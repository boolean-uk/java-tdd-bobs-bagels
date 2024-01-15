package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    //String type;
    ArrayList<String> bagels;
    int basketSize = 5;

    public Basket() {
        bagels = new ArrayList<>(5);
        //User Story 3
        /*
        bagels.add("Chocolate");
        bagels.add("Vanilla");
        bagels.add("Banana"); */
    }

    //User Story 1
    public boolean addBagelTypeToBasket(String bagelType) {
        if (this.bagels.contains(bagelType)) {
            return false;
        }
        this.bagels.add(bagelType);
        return true;
    }

    //User Story 2
    public boolean removeBagelTypeFromBasket(String bagelType) {
        if (this.bagels.contains(bagelType)) {
            this.bagels.remove(bagelType);
            return true;
        }
        return false;
    }

    //User Story 3
    public String basketIsFull() {
        if (this.bagels.size() >= this.basketSize) {
            return "Basket is full!";
        }
        return "Basket is not full!";
    }

    //User story 4
    public String changeBasketCapacity(int newCapacity) {
        if(this.bagels.size() < newCapacity) {
            this.bagels = new ArrayList<>(newCapacity);
            return "Basket capacity changed!";
        } else if (this.bagels.size() <= newCapacity) {
            return "Basket capacity is not changed.";
        }
        return "Basket capacity is not changed.";

    }

    //User Story 5
    public String canRemoveItemInBasket(String item) {
        return "Item is in basket and can be removed.";
    }
}
