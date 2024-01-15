package com.booleanuk.core;

import java.lang.reflect.Array;

public class Basket {
    String[] basketArr;

    public Basket(){
        this.basketArr = new String[4];
        this.basketArr[0] = "Chocolate";
        this.basketArr[3] = "Strawberry";
    }

    public boolean addToBasket(String bagel){
        //Check if the basket is full
        boolean bool = false;
        if(this.basketArr[this.basketArr.length-1] == null){
            //Go through the array to find the first empty slot
            for (int i = 0; i < basketArr.length; i++) {
                //Add the bagel if the slot is empty
                if(this.basketArr[i] == null){
                    this.basketArr[i] = bagel;
                    bool = true;
                }
            }
        }

        return bool;
    }

    public boolean removeFromBasket(String bagel){
        //Go through the array to find the bagel
        boolean bool = false;
        for (int i = 0; i < basketArr.length; i++) {
            //Check if it is empty
            if(basketArr[i]!=null){
                //If it is the same String, remove it
                if(basketArr[i].equals(bagel)){
                    basketArr[i] = null;
                    bool = true;
                }
            }

        }
        return bool;


    }

    public void changeBasketCapacity(int size){
        String[] newArray = new String[size];

        for (int i = 0; i < this.basketArr.length; i++) {
            newArray[i] = this.basketArr[i];
        }
        this.basketArr = newArray;
    }


}
