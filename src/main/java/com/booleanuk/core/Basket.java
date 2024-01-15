package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
    ArrayList<String> basketList;
    int max;
    String email = "bob@bagel.com";
    String number = "12345678";
    String address = "742 Evergreen Terrace";

    public Basket()
    {
        basketList = new ArrayList<>();
        max = 10;
    }

    public boolean addToBasket(String type)
    {
        if(basketList.size() == max) {
            System.out.println("Basket is full. Please remove one or more items before adding another");
            return false;
        }
        if(basketList.contains(type))
        {
            System.out.println("Bagel of type \"" + type + "\" already exists in basket");
            return false;
        }
        basketList.add(type);
        System.out.println("Successfully added " + type + " bagel to basket");
        return true;
    }

    public boolean removeFromBasket(String type)
    {
        if(basketList.contains(type))
        {
            basketList.remove(type);
            System.out.println("Successfully removed " + type + " bagel from basket");
            return true;
        }
        System.out.println("Bagel of type \"" + type + "\" is not in basket");
        return false;
    }

    public boolean changeCapacity(int capacity) {
        if (capacity >= 0) {
            if (this.basketList.size() <= capacity) {
                this.max = capacity;
                this.basketList = new ArrayList<>();
                return true;
            } else {
                System.out.println("Could not change capacity, there are basket that exceed desired capacity size");
                return false;
            }
        } else {
            System.out.println("Capacity cannot be negative");
            return false;
        }
    }

    public String listBasketItems()
    {
        if(!basketList.isEmpty()) {
            StringBuilder result = new StringBuilder();
            result.append("Your basket has ");
            result.append(basketList.size());
            result.append(" items:\n");
            for (String item : basketList) {
                result.append(item);
                result.append("\n");
            }

            System.out.println(result);

            return result.toString();
        }
        String emptyBasket = "No items to show, basket is empty";
        System.out.println(emptyBasket);
        return emptyBasket;
    }

    public boolean emptyBasket()
    {
        if(this.basketList.size() > 0) {
            this.basketList = new ArrayList<>();
            listBasketItems();
            return true;
        }
        System.out.println("Basket is already empty");
        return false;
    }

    public String showContactInfo(String option)
    {
        switch (option) {
            case "email" -> {
                return this.email;
            }
            case "number" -> {
                return this.number;
            }
            case "address" -> {
                return this.address;
            }
        }
        return "No matching option";
    }

    public String showContactInfo()
    {
        return """
                bob@bagel.com
                12345678
                742 Evergreen Terrace
                """;
    }
}
