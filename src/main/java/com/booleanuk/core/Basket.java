package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
    List<String> BagelBasket = new ArrayList<>();
    List<String> bagelInventory = new ArrayList<>();


    public Basket() {
        this.BagelBasket = new ArrayList<>();
        this.bagelInventory = new ArrayList<>();
        bagelInventory.add("plain");
        bagelInventory.add("egg");
        bagelInventory.add("blueberry");
        bagelInventory.add("cinnamon");
        bagelInventory.add("sourDough");

    }

    public boolean search(List<String> bagelInventory, String bagelType) {
        System.out.println(this.bagelInventory);
        return bagelInventory.contains(bagelType);
    }

    public boolean add(List<String> BagelBasket, String bagelType) {
        if (bagelInventory.contains(bagelType)) {
            this.BagelBasket.add(bagelType);
            System.out.println(this.BagelBasket);
            return true;
        }
        System.out.println(this.BagelBasket);
        return false;
    }
}








