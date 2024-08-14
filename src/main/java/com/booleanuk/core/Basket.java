package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;

public class Basket {

    static HashMap<String, Integer> bagelMenu = new HashMap<String, Integer>();
    static{
        bagelMenu.put("Sesame", 3);
        bagelMenu.put("Oat", 3);
        bagelMenu.put("Chicken", 5);
        bagelMenu.put("Cheese", 4);
    }

    int basketSize = 5;

    ArrayList<String> basket = new ArrayList<>();

    Boolean isManager=false;

    public String addBagel(String bagel){
        if (basket.size()<basketSize){
            if (bagelMenu.containsKey(bagel)){
                basket.add(bagel);
                return "Bagel added to basket.";
            }else {
                return "This bagel is not on the menu.";
            }
        }else{
            return "Basket is full.";
        }
    }

    public String removeBagel(String bagel){
        if (basket.contains(bagel)){
            basket.remove(bagel);
            return "Bagel removed from basket.";
        }else {
            return "This bagel is not in your basket.";
        }
    }

    public Boolean setBasketSize(int basketSize){
        if ((basketSize > 0 && isManager)){
            this.basketSize=basketSize;
            return true;
        }else{
            return false;
        }
    }

}
