package com.booleanuk.core;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Basket {

    public boolean search(List<String> bagelInventory, String bagelType) {
        return bagelInventory.contains(bagelType);
    }

    public boolean addToBagelBasket(List<String> BagelBasket, String bagelType) {
        if (!BagelBasket.contains(bagelType)) {
            BagelBasket.add(bagelType);
            return true;
        }
        return false;
    }
}




