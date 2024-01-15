
```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Classes        | Methods                     | Scenario                                   | Output                      |
|----------------|-----------------------------|--------------------------------------------|-----------------------------|
| Basket         | addBagel(int bagelId)       | Bagel type is available, not in basket     | add item to basket          |
|                |                             | Bagel type is available, already in basket | increase amount in basket   |
|                |                             | Bagel type is not available                | throw exception NoSuchBagel |
| BagelInventory | availableBagel(int bagelId) | Bagel is in inventory                      | true                        |
|                |                             | Bagel is not in inventory                  | false                       |


```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

| Classes | Methods                  | Scenarios              | Outputs                     |
|---------|--------------------------|------------------------|-----------------------------|
| Basket  | removeBagel(int bagelId) | Bagel is in basket     | item removed                |
|         |                          | Bagel is not in basket | throw exception NotInBasket |
|         |                          |                        |                             |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

| Classes | Methods  | Scenarios          | Outputs |
|---------|----------|--------------------|---------|
| Basket  | isFull() | Basket is full     | true    |
|         |          | Basket is not full | false   |

```