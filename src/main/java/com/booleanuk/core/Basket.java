package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {

    ArrayList<String> bagelsBasket=new ArrayList<>();
    ArrayList<String> menu =new ArrayList<>();
    int capacity;
    boolean isManager = false;

    public Basket()
    {
        capacity = 5;
        menu.add("bagel");
        menu.add("bagel1");
        menu.add("bagel2");
    }

    public Basket(int capacity) {
        this.capacity = capacity;
    }

    public boolean add(String bagel)
    {
        if(bagelsBasket.size()==capacity) {
            System.out.println("Sorry, your basket if full");
            return false;
        } else if(!menu.contains(bagel)) {
             System.out.println("We don't have it on the menu");
             return false;
        }
        bagelsBasket.add(bagel);
        return true;
    }

    public boolean remove(String bagel)
    {
        if(!bagelsBasket.contains(bagel)) {
            System.out.println("You can't remove a bagel you don't have");
            return false;
        }
        bagelsBasket.remove(bagel);
        return true;
    }

    public void changeCapacity(int capacity){
        if(isManager) {
            if(capacity<= this.capacity)
            {
                System.out.println("You shouldn't change capacity to smaller one, you may lose your bagels!");
            }
            else {
                this.capacity = capacity;
                System.out.println("Capacity of the basket is changed");
            }
        } else {
            System.out.println("Customers cannot change basket capacity");
        }
    }

    public void addToMenu(String bagel){
          if(isManager) {
              menu.add(bagel);
              System.out.println("Bagel added to menu");
          } else {
              System.out.println("Customers cannot change menu");
          }
    }

    public void removeFromMenu(String bagel){
           if(isManager) {
               menu.remove(bagel);
               System.out.println("Bagel removed from menu");
           } else {
               System.out.println("Customers cannot change menu");
           }
    }

}
