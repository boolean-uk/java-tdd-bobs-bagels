package com.booleanuk.core;

public class Basket {

    public boolean basketCheck(String[] arr) {
        if (arr[arr.length - 1] == null) {
            return true;
        }
        return false;
    }

    public boolean bagelCheck(String[] basketArray, String bagel) {
        for (int i = 0; i < basketArray.length; i++) {
            if (basketArray[i] != null && basketArray[i].equals(bagel)) return true;
        }
        return false;
    }

    public boolean removeBagel(String[] basketArray, String bagel) {
        for (int i = 0; i < basketArray.length; i++) {
            if (basketArray[i] != null && basketArray[i].equals(bagel)) {
                basketArray[i] = null;
                return true;
            }
        }
        return false;
    }

    public boolean addBagel(String[] basketArray, String bagel) {
        if(basketCheck(basketArray)) {
            for (int i = 0; i < basketArray.length; i++) {
                if(basketArray[i]==null){
                    basketArray[i] = bagel;
                    break;
                }
            }
            return true;
        }
        return false;
    }

    public String[] sizeChange(String[] basketArray, int size) {
        if(size<101 && size>basketArray.length) {
            String[] newArray = new String[size];
            for(int i=0;i<basketArray.length;i++){
                if(basketArray[i]!=null) newArray[i]=basketArray[i];
            }
            return newArray;
        }
        return null;
    }
}


