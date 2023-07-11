package com.booleanuk.core;

import com.booleanuk.core.Basket.Bagel;
import com.booleanuk.core.Basket.BagelType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

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

    @Test
    public void shouldPreventOverfillingBasket() {
        Basket basket = new Basket(2);
        basket.add(new Bagel(BagelType.CLASSIC));

        assertTrue(basket.add(new Bagel(BagelType.CLASSIC)));
        assertFalse(basket.add(new Bagel(BagelType.CLASSIC)));
    }
}
