package com.booleanuk.core;

import java.util.HashMap;

public class Basket {
    private final HashMap<String, Integer> bagels;
    private int basketCapacity;
    private int basketQuantity;

    public Basket(int basketCapacity) {
        this.basketCapacity = basketCapacity;
        this.bagels = new HashMap<>();
    }

    public boolean add(String bagel, int quantity) {
        if(quantity < 0){
            System.out.println("Invalid quantity of specific bagel!");
            return false;
        } else if(basketQuantity + quantity > basketCapacity){
            System.out.println("There is no room for another bagel!");
            return false;
        } else {
            this.basketQuantity += quantity;

            if(this.bagels.containsKey(bagel)){
                int newQuantity = this.bagels.get(bagel) + quantity;
                this.bagels.put(bagel, newQuantity);
            } else {
                bagels.put(bagel, quantity);
            }

            return true;
        }
    }

    public HashMap<String, Integer> getBagels() {
        return bagels;
    }

    public boolean remove(String bagel) {
        if(this.bagels.containsKey(bagel)) {
            bagels.remove(bagel);
            return true;
        } else {
            System.out.println("Specific bagel is not in the basket!");
            return false;
        }
    }

    public boolean remove(String bagel, int quantity) {
        if(this.bagels.containsKey(bagel)){
            int newQuantity = this.bagels.get(bagel) - quantity;

            if(newQuantity <= 0) this.bagels.remove(bagel);
            else this.bagels.put(bagel, newQuantity);

            return true;
        } else {
            System.out.println("Specific bagel is not in the basket!");
            return false;
        }
    }

}
