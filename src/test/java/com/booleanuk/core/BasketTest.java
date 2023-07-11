package com.booleanuk.core;

import com.booleanuk.core.Basket.Bagel;
import com.booleanuk.core.Basket.BagelType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    public void shouldAddBagelToBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel(BagelType.CLASSIC);

        basket.add(bagel);

        assertEquals(1, basket.bagels.size());

    }

    @Test
    public void shouldRemoveBagelFromBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel(BagelType.CLASSIC);
        basket.add(bagel);

        assertTrue(basket.remove(bagel.id));
        assertFalse(basket.remove(bagel.id));
        assertEquals(0, basket.bagels.size());
    }
}
