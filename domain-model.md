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

## Domain model

| Classes | Methods                      | Member variables         | Scenario                         | Outputs |
|---------|------------------------------|--------------------------|----------------------------------|---------|
| Basket  | add(String bagel)            | ArrayList<String> items  | Add bagel to basket.             | True    |
|         |                              |                          | Bagel could not be added,        |         |
|         |                              |                          | basket is full.                  | False   |
|         | remove(String bagel)         | ArrayList<String> items  | Remove bagel from basket.        | True    |
|         |                              |                          | Bagel no in basket, cannot       |         |
|         |                              |                          | be removed.                      | False   |
|         | isFull()                     | ArrayList<String> items, | Basket has reached max capacity. | True    |
|         |                              | int capacity             | Basket is not full.              | False   |
|         | changeCapacity(int capacity) | int capacity             | Manager changes the capacity     |         |
|         |                              |                          | of baskets to non-negative int.  |         |
