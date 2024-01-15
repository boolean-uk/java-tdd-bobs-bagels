package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
	Inventory inventory;

	@Test
	public void addBagelTest(){
		initInventory();
		Basket basket = new Basket(inventory);
		Assertions.assertFalse(basket.inBasket(1));
		Assertions.assertFalse(basket.inBasket(2));
		basket.addBagel(1);
		Assertions.assertTrue(basket.inBasket(1));
		Assertions.assertFalse(basket.inBasket(2));
	}

	public void removeBagelTest(){
		initInventory();
		Basket basket=new Basket(inventory);
		basket.addBagel(1);
		Assertions.assertTrue(basket.inBasket(1));
		Assertions.assertFalse(basket.inBasket(2));
		basket.removeBagel(1);
		Assertions.assertFalse(basket.inBasket(1));
		Assertions.assertFalse(basket.inBasket(2));
	}
	private void initInventory(){
		inventory=new Inventory();
		Bagel bagel1 = new Bagel(0,"Plain",1.99);
		Bagel bagel2 = new Bagel(1,"Ham",1.99);
		Bagel bagel3 = new Bagel(2,"Cheese",1.99);
		Bagel bagel4 = new Bagel(3,"Everything",2.49);
		inventory.addItem(bagel1.id);
		inventory.addItem(bagel2.id);
		inventory.addItem(bagel3.id);
		inventory.addItem(bagel4.id);
	}
}
