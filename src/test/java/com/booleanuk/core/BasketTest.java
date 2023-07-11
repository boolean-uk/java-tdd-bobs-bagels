package com.booleanuk.core;

import com.booleanuk.core.Basket.Bagel;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {

    @Test
    public void shouldAddBagelToBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel(Basket.BagelType.CLASSIC);

        basket.add(bagel);

        Assertions.assertEquals(1, basket.bagels.size());

    }
}
