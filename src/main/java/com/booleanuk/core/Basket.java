package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {


    ArrayList<String> list;
    int capacity;

    public Basket (){
        this.list = new ArrayList<String>();
        this.capacity = 3;
    }

    public String add(String bagel){
        if(list.size() < capacity){
            list.add(bagel);
        }

        return list.toString();
    }

    public String remove(String bagel){
        if(list.contains(bagel)){
            list.remove(bagel);
        }else return "Bagel does not exist in basket";

        return list.toString();
    }

    public void changeCapacity(int size) {
        //list = new ArrayList<>();
        this.capacity = size;
    }




    public static void main(String[] args) {
        Basket basket = new Basket();
        String bagelOne = "Plain";
        String bagelTwo = "Everything";
        String bagelThree = "Blueberry";
        String bagelFour = "Cinnamon";

        basket.list.add(bagelOne);
        basket.list.add(bagelTwo);

        System.out.println(basket.add(bagelOne));

        System.out.println();
        System.out.println(basket.add(bagelTwo));
        System.out.println(basket.remove(bagelFour));
        System.out.println(basket.remove(bagelOne));
        System.out.println(basket.add(bagelThree));


    }
}
