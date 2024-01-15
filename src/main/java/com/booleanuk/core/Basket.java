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

    public String changeCapacity(int size) {
        ArrayList <String> newList = new ArrayList<>();
        this.capacity = size;

        for (int i = 0; i < list.size() ; i++) {
            if(i >= size){
                break;
            }
            newList.add(list.get(i));
        }

        list = newList;
        return list.toString();
    }




    public static void main(String[] args) {
        Basket basket = new Basket();
        String bagelOne = "Plain";
        String bagelTwo = "Everything";
        String bagelThree = "Blueberry";
        String bagelFour = "Cinnamon";

        basket.list.add(bagelOne);
        basket.list.add(bagelTwo);
        basket.list.add(bagelTwo);
        basket.list.add(bagelFour);
        System.out.println(basket.changeCapacity(8));
        System.out.println(basket.add(bagelOne));
        System.out.println(basket.changeCapacity(2));
        System.out.println();
        System.out.println(basket.add(bagelTwo));
        System.out.println(basket.remove(bagelFour));
        System.out.println(basket.remove(bagelOne));
        System.out.println(basket.add(bagelThree));


    }
}
