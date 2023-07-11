## User Stories

```
1.
As a member of the public,
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

## Domain Model
| Classes | Methods                         | Fields             | Scenario                                               | Outcome                  |
|---------|---------------------------------|--------------------|--------------------------------------------------------|--------------------------|
| Basket  | add(Bagel bagel)                | List<Bagel> bagels | Add bagel to basket                                    | Return id of added bagel |
|         | remove(UUID id)                 |                    | If bagel in basket                                     | Return true              |
|         |                                 |                    | If bagel not in basket                                 | Return false             |
|         | isFull()                        | int capacity       | If basket full                                         | Return true              |
|         |                                 |                    | If basket not full                                     | Return false             |
|         | changeCapacity(int newCapacity) |                    | If newCapacity > 0 and newCapacity >= bagels in basket | Return true              |
|         |                                 |                    | If newCapacity <= 0 or newCapacity < bagels in basket  | Return false             |
|         | isInBasket(UUID id)             |                    | If bagel in basket                                     | Return true              |
|         |                                 |                    | If bagel not in basket                                 | Return false             |
