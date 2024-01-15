package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
	Inventory inventory;

	@Test
	public void addBagelTest(){
		initInventroy();
		Basket basket = new Basket();
		Assertions.assertFalse(basket.inBasket(1));
		Assertions.assertFalse(basket.inBasket(2));
		basket.addBagel(1);
		Assertions.assertTrue(basket.inBasket(1));
		Assertions.assertFalse(basket.inBasket(2));

	}
	private void initInventroy(){
		Bagel bagel1 = new Bagel(1,"Plain",1.99);
		Bagel bagel2 = new Bagel(2,"Ham",1.99);
		Bagel bagel3 = new Bagel(3,"Cheese",1.99);
		Bagel bagel4 = new Bagel(4,"Everything",2.49);
		inventroy.add(bagel1);
		inventroy.add(bagel2);
		inventroy.add(bagel3);
		inventroy.add(bagel4);
	}
}
