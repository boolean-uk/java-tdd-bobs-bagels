package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

public class Basket {

    List<Bagel> bagels = new ArrayList<>();

    public void add(Bagel bagel) {
        this.bagels.add(bagel);
    }

    public boolean remove(UUID id) {
        Bagel bagel = bagels.stream().filter(x -> x.id.equals(id)).findFirst().orElse(null);
        if (bagel == null) {
            return false;
        }
        this.bagels.remove(bagels.indexOf(bagel));
        return true;
    }

//    int index = users.stream()
//            .map(user -> user.getName())
//            .collect(Collectors.toList())
//            .indexOf(username);

    static class Bagel {
        UUID id;
        BagelType bagelType;


        public Bagel(BagelType bagelType) {
            this.id = UUID.randomUUID();
            this.bagelType = bagelType;
        }
    }

    enum BagelType {
        CLASSIC, EGG, BANANA, BLUEBERRY
    }

}
