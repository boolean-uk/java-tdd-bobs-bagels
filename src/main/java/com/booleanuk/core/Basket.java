package com.booleanuk.core;

import java.util.ArrayList;

public class Basket {
	int size = 3;
	Inventory inventory;
	ArrayList<Integer> items;

	public Basket(Inventory inventory) {
		this.items = new ArrayList<>();
		this.inventory = inventory;
	}

	public boolean inBasket(int id) {
		return items.contains(id);
	}

	public void addBagel(int id) {
		if (inventory.inInventory(id)) {
			if (!isFull()) {
				items.add(id);
			}
		}
	}

	public void removeBagel(int id) {
		if (items.contains(id)) {
			items.remove((Integer) id);
		}
	}

	public boolean isFull() {
		return items.size() >= size;
	}


}
