package com.booleanuk.core;

import java.util.ArrayList;
import java.util.List;

public class Basket {
  public int capacity = 3;
  private List<Bagel> bagels = new ArrayList<>();

  public int size() {
    return bagels.size();
  }

  private boolean isFull() {
    return this.size() == this.capacity;
  }

  public boolean add(Bagel bagel) {
    if (this.isFull())
      return false;

    this.bagels.add(bagel);
    return true;
  }

  public boolean remove(Bagel bagel) {
    if (!this.bagels.contains(bagel))
      return false;

    this.bagels.remove(bagel);
    return true;
  }

  public void setCapacity(int newCapacity) {
    this.capacity = newCapacity;
  }
}
