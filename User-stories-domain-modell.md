#User Stories

```dtd
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```
```dtd
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
```dtd
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
```dtd
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
```dtd
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Class    | Field                    | Method                          | Situation                                                              | Output                                                                |
|----------|--------------------------|---------------------------------|------------------------------------------------------------------------|-----------------------------------------------------------------------|
| Basket() | ArrayList<String> bagels | addBagel(String type)           | addBagel(bagel) is run                                                 | bagel is added to field within basket class. method returns true      |
|          |                          | removeBagel(String type)        | removeBagel(bagel) is run but the corresponding bagel is not in basket | no bagels are removed and the method returns false                    |
|          |                          |                                 | removeBagel(bagel) is run and corresponding bagel is in the basket     | a single bagel is removed from the basket and the method returns true |
|          | int basketCapacity       | isBasketFull()                  | a bagel is added but the basket is full                                | the method returns true and no bagel is added to basket               |
|          |                          |                                 | a bagel is added but the basket does not go over capacity              | the method returns false and a bagel is added to basket               |
|          |                          | setBasketCapacity(int capacity) | the method is called with a parameter 10                               | the basketCapacity is set to 10                                       |
|          |                          | removeBagel(String type)        | A customer attempts to remove a bagel that is not in the basket        | A message notifying the customer is sent to System.out                |
