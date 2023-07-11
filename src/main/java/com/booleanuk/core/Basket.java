package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> bagels;
    int capacity;
    int total;

    public Basket() {
        this.total = 0;
        this.capacity = 5;
        this.bagels = new HashMap<>();
    }

    public String add(String bagelType, int count) {
        if (!isOverfilled(count)) {
            this.bagels.put(bagelType, count);
            this.total += count;
            return "bagel added";
        }
        return "overfilled cart";
    }

    public String add(String bagelType) {
        if (!isOverfilled(1)) {
            this.bagels.put(bagelType, 1);
            this.total += 1;
            return "bagel added";
        }
        return "overfilled cart";
    }

    public boolean isOverfilled(int count) {
        return count + this.total > this.capacity;
    }

    public String remove(String bagelType) {
        if (bagels.containsKey(bagelType)) {
            bagels.remove(bagelType);
            total -= 1;
            return "bagel removed";
        } else return "bagel not found";
    }

    public String remove(String bagelType, int count) {
        if (bagels.containsKey(bagelType)) {
            if (bagels.get(bagelType) < count)
                return "count is bigger than quantity of this bagel";
            else if(bagels.get(bagelType) == count){
                bagels.remove(bagelType);
                total -= count;
                return "bagel removed";
            }
            else{
                bagels.replace(bagelType, bagels.get(bagelType)-count);
                total -= count;
                return "bagel removed";
            }
        } else
            return "bagel not found";
    }

    public String emptyBasket() {
        this.total = 0;
        bagels.clear();
        return "bagels removed";
    }


    public void changeCapacity(int i) {
        this.capacity = i;
    }
}
