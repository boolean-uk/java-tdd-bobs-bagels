package com.booleanuk.core;
import java.util.HashMap;

public class Basket {
    HashMap<String, Integer> bagels = new HashMap<String, Integer>();
    int capacity;

    public Basket(int num){
        capacity=num;
    }

    public boolean add(String bagel, int num){
        if (!(bagels.containsKey(bagel) & checkCapacity())){
            bagels.put(bagel, 0);
        }

         for (int i=0; i<num; i++){
             if (checkCapacity()) {
                 bagels.replace(bagel, bagels.get(bagel) + 1);

             }
             else {
             System.out.println("The basket is full");
             return false;
             }
         }
         return true;



    }

    public boolean remove(String bagel, int num){
        if (bagels.containsKey(bagel)){
            if (bagels.get(bagel)==0){
                System.out.println("The basket does not contain this bagle type");
                return false;
            }

            bagels.replace(bagel, bagels.get(bagel)-num);
            return true;
        }
        else{
            System.out.println("The basket does not contain this bagle type");
            return false;
        }
    }

    public boolean checkCapacity(){
        int num=0;
        for (String key: bagels.keySet()){
            num+=bagels.get(key);

            if (num>=capacity){
                return false;
            }
        }
        return true;

    }

    public boolean incCapacity(int num){
        capacity+=num;
        return true;
    }
}
