package com.booleanuk.core;

import java.util.HashMap;

public class Basket {

    public HashMap<String, Integer> bagelTypes;

    public int capacity;


    public Basket(){
        bagelTypes = new HashMap<>();
        capacity = 4;
    }

    private int getBasketSize(){
        int count = 0;
        for(String key : bagelTypes.keySet())
            count += bagelTypes.get(key);

        System.out.println(count);
        return count;
    }

    public boolean add(String bagelType, int count){
        if(capacity < getBasketSize() + count) {
            System.out.println("Cannot add so many bagels :(");
            return false;
        }

        Integer bagelCount = bagelTypes.get(bagelType);

        if(bagelCount != null){
            bagelTypes.replace(bagelType, bagelCount + count);
            return true;
        }

        this.bagelTypes.put(bagelType, count);
        return true;
    }

    public boolean remove(String bagelType, int count){
        Integer bagelCount = this.bagelTypes.get(bagelType);

        if(bagelCount == null){
            System.out.println("Given bagel could not be found in the basket");
            return false;
        }

        int result = bagelCount - count;
        if(result <= bagelCount && result >= 0) {
            this.bagelTypes.replace(bagelType, result);
            return true;
        }

        System.out.println("Could not remove because the count is invalid");
        return false;
    }

    public boolean updateBasketCapacity(int newCapacity){
        if(newCapacity <= 0){
            System.out.println("Wrong capacity value");
            return false;
        }

        this.capacity = newCapacity;
        return true;
    }
}
