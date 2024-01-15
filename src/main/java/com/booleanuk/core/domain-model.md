# Domain Model for Bobs Bagels Shop :-)

## User Story (1)

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

### Keywords
```
1) Order a bagel
2) Specific type of bagel
3) Add bagel to basket
```

### Class Bagel

| Member Variables | Methods   | Scenario                       | Return Value/Output                 |
|------------------|-----------|--------------------------------|-------------------------------------|
| Type: String     | getType() | Get a bagel type from the shop | If bagel in stock: Return true      |
| Cost: Double     |           |                                | If bagel not in stock: Return false |
|                  | getCost() | Get a bagel type and cost      | If bagel not exists: Return true    |
|                  |           |                                | If bagel exists: Return false       |

### Class Basket

| Methods | Member Variables | Scenario | Return Value/Output |
|---------|------------------|----------|---------------------|
|         |                  |          |                     |
|         |                  |          |                     |



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