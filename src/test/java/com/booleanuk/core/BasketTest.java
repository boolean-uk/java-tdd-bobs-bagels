package com.booleanuk.core;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BasketTest {
    @Test
    public void addBagelTest(){
        Basket b = new Basket();
        b.basketSize = 1;

        String expectedSuccess = "Bagel added successfully.";
        String expectedFail = "Basket is full.";

        String testSuccess = b.addBagel("Cream");
        String testFail = b.addBagel("Chocolate");

        Assertions.assertEquals(expectedSuccess, testSuccess);
        Assertions.assertEquals(expectedFail, testFail);
    }

    @Test
    public void removeBagelTest(){
        Basket b = new Basket();

        b.addBagel("Chocolate");

        String expectedSuccess = "Bagel successfully removed from basket.";
        String expectedFail = "This bagel is not in your basket.";

        String testSuccess = b.removeBagel("Chocolate");
        String testFail = b.removeBagel("Cream");

        Assertions.assertEquals(expectedSuccess, testSuccess);
        Assertions.assertEquals(expectedFail, testFail);
    }
}


/*


### User story 2
```
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

### User story 3
```
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

### User story 4
```
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

### User story 5
```
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```
 */