package com.booleanuk.core;

import java.util.List;

public class Basket {

    public boolean search(List<String> bagelInventory, String bagelType) {
        return bagelInventory.contains(bagelType);
    }
}
