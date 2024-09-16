package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {
    ArrayList<String> bagelList;
    int capacity;
    public Basket() {
        this.bagelList = new ArrayList<>();
    }

    public boolean add(String type) {
        if (this.bagelList.contains(type.toLowerCase())) {
            return false;
        } else {
            this.bagelList.add(type.toLowerCase());
            return true;
        }
    }

    public boolean remove(String type) {
        if (this.bagelList.contains(type.toLowerCase())) {
            this.bagelList.remove(type.toLowerCase());
            return true;
        }else {
            return false;
        }
    }

    public boolean setCapacity(int capacity) {
        if (capacity > 0) {
            this.capacity = capacity;
            return true;
        } else {
            return false;
        }
    }

    public boolean checkIfFull() {
        if (this.bagelList.size() <= this.capacity) {
            return false;
        } else {
            return true;
        }
    }


}
