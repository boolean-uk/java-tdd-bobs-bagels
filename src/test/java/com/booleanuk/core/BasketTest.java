package com.booleanuk.core;

import com.booleanuk.core.Basket.Bagel;
import com.booleanuk.core.Basket.BagelType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class BasketTest {

    @Test
    public void shouldNotCreateBasket() {
        assertThrows(IllegalArgumentException.class, () -> new Basket(-1));
    }

    @Test
    public void shouldAddBagelToBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel(BagelType.CLASSIC);

        basket.addBagel(bagel);

        assertEquals(1, basket.bagels.size());

    }

    @Test
    public void shouldRemoveBagelFromBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel(BagelType.CLASSIC);
        basket.addBagel(bagel);

        assertTrue(basket.removeBagel(bagel.id));
        assertFalse(basket.removeBagel(bagel.id));
        assertEquals(0, basket.bagels.size());
    }

    @Test
    public void shouldPreventOverfillingBasket() {
        Basket basket = new Basket(2);
        basket.addBagel(new Bagel(BagelType.CLASSIC));

        assertTrue(basket.addBagel(new Bagel(BagelType.CLASSIC)));
        assertFalse(basket.addBagel(new Bagel(BagelType.CLASSIC)));
    }

    @Test
    public void shouldChangeCapacity() {
        Basket basket = new Basket(2);
        basket.addBagel(new Bagel(BagelType.CLASSIC));

        assertTrue(basket.addBagel(new Bagel(BagelType.CLASSIC)));
        assertFalse(basket.addBagel(new Bagel(BagelType.CLASSIC)));

        assertFalse(basket.changeCapacity(-1));
        assertTrue(basket.changeCapacity(3));

        assertTrue(basket.addBagel(new Bagel(BagelType.CLASSIC)));
        assertFalse(basket.addBagel(new Bagel(BagelType.CLASSIC)));
    }

    @Test
    public void shouldReturnFalseWhenDeletingBagelNotStoredInBasket() {
        Basket basket = new Basket();
        Bagel bagel = new Bagel(BagelType.CLASSIC);
        basket.addBagel(bagel);
        Bagel notInBasketBagel = new Bagel(BagelType.BLUEBERRY);

        assertFalse(basket.removeBagel(notInBasketBagel.id));
    }
}
