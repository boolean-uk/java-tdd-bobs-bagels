package com.booleanuk.core;

import com.booleanuk.core.Basket.Bagel;
import com.booleanuk.core.Basket.BagelType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BasketTest {

    @Test
    public void shouldNotCreateBasket() {
        assertThrows(IllegalArgumentException.class, () -> new Basket(-1));
    }

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

    @Test
    public void shouldChangeCapacity() {
        Basket basket = new Basket(2);
        basket.add(new Bagel(BagelType.CLASSIC));

        assertTrue(basket.add(new Bagel(BagelType.CLASSIC)));
        assertFalse(basket.add(new Bagel(BagelType.CLASSIC)));

        assertFalse(basket.changeCapacity(-1));
        assertTrue(basket.changeCapacity(3));

        assertTrue(basket.add(new Bagel(BagelType.CLASSIC)));
        assertFalse(basket.add(new Bagel(BagelType.CLASSIC)));
    }
}
