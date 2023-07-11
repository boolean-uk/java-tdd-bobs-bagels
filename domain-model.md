# Bob's Bagels

## User Stories

```
1.As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```


## -----------------------

| Class  | Method                         | Fields                      | Outcome                                         |
|--------|--------------------------------|-----------------------------|-------------------------------------------------|
| Basket | `addBagel(String bagel)`       | `ArrayList<String> basket`  | bagel is added to the basket                    |
|        | `removeBagel(String bagel)`    | `ArrayList<String> basket`  | bagel is removed from the basket                |
|        | `checkBasket()`                | `ArrayList<String> basket`  | true if the basket is full, false if not        |
|        | `changeCapacity(int capacity)` | `ArrayList<String> basket`  | capacity of the basket is changed               |
|        | `checkSanity(String bagel)`    | `ArrayList<String> basket`  | true if the basket contains bagel, false if not |
