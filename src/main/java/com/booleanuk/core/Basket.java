package com.booleanuk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Basket {

    private Map<String, Map<String, Integer>> basket;
    private Map<String, Integer> bagels;
    private int capacityOfBasket;

    public Basket(int capacityOfBasket, Map<String, Integer> bagels) {
        this.capacityOfBasket = capacityOfBasket;
        this.bagels = bagels;

    }
    public boolean addBagelToBasket(String bagel1) {

        if(this.basket != null) {
            if(this.basket.size() < capacityOfBasket) {
                if (!this.basket.containsKey(bagel1)) {
                    if (this.bagels.containsKey(bagel1)) {
                        this.basket.put(bagel1, new HashMap<String, Integer>() {
                            {
                                putIfAbsent("Quantity", 1);
                                putIfAbsent("Price", bagels.get(bagel1));
                            }

                        });


                        return true;
                    }
                }
            }
        } else if(bagels.containsKey(bagel1)){
            Map<String, Map<String, Integer>> newBasket = new HashMap<>();
            newBasket.put(bagel1, new HashMap<String, Integer>() {
                {
                    putIfAbsent("Quantity", 1);
                    putIfAbsent("Price", bagels.get(bagel1));
                }

            });
            this.basket = newBasket;
            return true;
        }

        return false;
    }

    public void changeCapacityOfBasket(int i) {

        this.capacityOfBasket = i;
    }

    public boolean removeBagelFromBasket() {

        return true;
    }
}


