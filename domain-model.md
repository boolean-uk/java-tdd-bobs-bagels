```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.

2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.

3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.

4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.

5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Classes  | Members                                                           | Methods                                 | Scenario                                                                              | Outputs |
|----------|-------------------------------------------------------------------|-----------------------------------------|---------------------------------------------------------------------------------------|---------|
| `Basket` | HashMap<String, Integer> bagels (key is bagel, value is quantity) | `add(String bagel, int quantity)`       | there is still room for another bagel and specific bagel does not exist in the basket | true    |
|          |                                                                   |                                         | there is still room for another bagel and specific bagel exists in the basket         | true    |
|          |                                                                   |                                         | there is no room for another bagel                                                    | false   |
|          |                                                                   |                                         | given quantity is invalid                                                             | false   |
|          |                                                                   | `remove(String bagel)`                  | all bagels of specific name are removed                                               | true    |
|          |                                                                   |                                         | bagel with given name does not exists in the basket                                   | false   |
|          |                                                                   | `remove(String bagel, int quantity)`    | specific quantity of bagels of specific name are removed                              | true    |
|          |                                                                   |                                         | bagel with given name does not exists                                                 | false   |
|          |                                                                   | `changeBasketCapacity(int newCapacity)` | new capacity of baskets is valid                                                      | true    |
|          |                                                                   |                                         | new capacity of baskets is invalid                                                    | false   |

