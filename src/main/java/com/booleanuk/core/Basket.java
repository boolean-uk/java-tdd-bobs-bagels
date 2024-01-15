package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    //String type;
    ArrayList<String> bagels;

    public Basket(){
        bagels = new ArrayList<>();
    }

    //User Story 1
    public boolean addBagelTypeToBasket(String bagelType) {
        if(this.bagels.contains(bagelType)) {
            return false;
        }
        this.bagels.add(bagelType);
        return true;
    }

    //User Story 2
    public boolean removeBagelTypeFromBasket(String bagelType) {
        if(this.bagels.contains(bagelType)) {
            this.bagels.remove(bagelType);
            return true;
        }
        return false;
    }


}
