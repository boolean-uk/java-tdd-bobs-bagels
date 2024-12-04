package com.booleanuk.core;

import java.util.HashMap;
import java.util.Map;

public class Basket {
    private final Map<BagelType, Integer> bagels = new HashMap<>(capacity);
    static int capacity = 6;

    private static final String BASKET_FULL_MESSAGE = "Your basket is full! You can't add more bagels.";
    private static final String BAGEL_NOT_FOUND_MESSAGE = "Bagel of given type is not in the basket. It cannot be removed";


    public boolean add(BagelType bagel) {
        int sum = bagels.values().stream().mapToInt(Integer::intValue).sum();
        if (sum < capacity) {
            if (bagels.containsKey(bagel)) {
                bagels.put(bagel, bagels.get(bagel) + 1);
            } else {
                bagels.put(bagel, 1);
            }
            return true;
        }
        System.out.println(BASKET_FULL_MESSAGE);
        return false;
    }

    public boolean remove(BagelType bagel) {
        if (!bagels.containsKey(bagel)) {
            System.out.println(BAGEL_NOT_FOUND_MESSAGE);
            return false;
        }

        bagels.compute(bagel, (key, value) -> value - 1);
        bagels.remove(bagel, 0);

        return true;
    }

    public Map<BagelType, Integer> getBagels() {
        return bagels;
    }

    public static void changeCapacity(int newCapacity) {
        capacity = newCapacity;
    }

}
