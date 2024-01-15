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

| Member Variables   | Methods   | Scenario                                 | Return Value/Output                      |
|--------------------|-----------|------------------------------------------|------------------------------------------|
| type: String       | getType() | Get a bagel type from the shop           | If bagel in stock: Return true           |
| cost: Integer      |           |                                          | If bagel not in stock: Return false      |
| productID: Integer | getCost() | Get a bagel type and cost                | If bagel not exists: Return true         |
|                    |           |                                          | If bagel exists: Return false            |
|                    | getID()   | Get a unique ID for each bagel available | If bagel ID already exists: Return false |

### Class Basket

| Member Variables   | Methods    | Scenario                                | Return Value/Output                     |
|--------------------|------------|-----------------------------------------|-----------------------------------------|
| items: List<Bagel> | getItems() | I want to get an overview of the bagels | If empty: Return 0                      |
|                    |            | currently in my basket                  | Else: Retrieve the bagels               |
|                    | addBagel() | I want to add/buy a bagel to my basket  | If basket not full: return true and add |
|                    |            |                                         | If basket full: return false            |



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