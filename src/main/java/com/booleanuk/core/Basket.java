package com.booleanuk.core;

import java.util.ArrayList;

enum NOTIFICATION {
    NOERROR,
    BAGELNOTFOUND,
    MAXCAPACITY
}

public class Basket {
    ArrayList<String> bagels;
    static int capacity = 1;
    NOTIFICATION notification;

    public Basket() {
        this.bagels = new ArrayList<>(capacity);
        this.notification = NOTIFICATION.NOERROR;
    }

    public boolean addBagel(String type) {
        if (bagels.size() >= capacity) {
            notification = NOTIFICATION.MAXCAPACITY;
            return false;
        }

        notification = NOTIFICATION.NOERROR;
        bagels.add(type);
        return true;
    }

    public boolean removeBagel(String type) {
        int position = bagels.indexOf(type);

        if (position == -1) {
            notification = NOTIFICATION.BAGELNOTFOUND;
            return false;
        }

        notification = NOTIFICATION.NOERROR;
        bagels.remove(position);
        return true;
    }

    static boolean setCapacity(int size) {
        if (size < 0) return false;

        capacity = size;
        return true;
    }
}
