# Domain Model for Bobs Bagels Shop :-)
``
I will copy paste the domain-model-tables under each user story
if they received modifications from previous user stories
``
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


## User Story (2)
```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
### Keywords
```
1) Change my order
2) Remove bagel from basket
```
### Class Basket

| Member Variables   | Methods       | Scenario                                | Return Value/Output                        |
|--------------------|---------------|-----------------------------------------|--------------------------------------------|
| items: List<Bagel> | getItems()    | I want to get an overview of the bagels | If empty: Return 0                         |
|                    |               | currently in my basket                  | Else: Retrieve the bagels                  |
|                    | addBagel()    | I want to add/buy a bagel to my basket  | If basket not full: Add, return true       |
|                    |               |                                         | If basket full: Return false               |
|                    | removeBagel() | If I change my mind or                  | If bagel is in basket: Remove, return true |
|                    |               | do not have enough money to pay         | If bagel not in basket: Return false;      |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
### Keywords
```
1) Overfill
2) Full basket
```

### Class Basket

| Member Variables   | Methods         | Scenario                                | Return Value/Output                        |
|--------------------|-----------------|-----------------------------------------|--------------------------------------------|
| items: List<Bagel> | getItems()      | I want to get an overview of the bagels | If empty: Return 0                         |
|                    |                 | currently in my basket                  | Else: Retrieve the bagels                  |
|                    | addBagel()      | I want to add/buy a bagel to my basket  | If basket not full: Add, return true       |
|                    |                 |                                         | If basket full: Return false               |
|                    | removeBagel()   | If I change my mind or                  | If bagel is in basket: Remove, return true |
|                    |                 | do not have enough money to pay         | If bagel not in basket: Return false       |
|                    | checkCapacity() | If I try to buy more bagels             | If basket is full: Return false            |
|                    |                 | than I can hold                         | If basket is not full: Add, return true    |
```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
### Keywords
```
1) Change capacity
```

### Class Basket

| Member Variables   | Methods         | Scenario                                | Return Value/Output                        |
|--------------------|-----------------|-----------------------------------------|--------------------------------------------|
| items: List<Bagel> | getItems()      | I want to get an overview of the bagels | If empty: Return 0                         |
|                    |                 | currently in my basket                  | Else: Retrieve the bagels                  |
|                    | addBagel()      | I want to add/buy a bagel to my basket  | If basket not full: Add, return true       |
|                    |                 |                                         | If basket full: Return false               |
|                    | removeBagel()   | If I change my mind or                  | If bagel is in basket: Remove, return true |
|                    |                 | do not have enough money to pay         | If bagel not in basket: Return false;      |
|                    | checkCapacity() | If I try to buy more bagels             | If basket is full: Return false            |
|                    |                 | than I can hold                         | If basket is not full: Add, return true    |
|                    | setCapacity()   | I want to expand and allow more sales   | If basket changed capacity: Return true    |

```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

### Keywords
```
1) Maintain sanity aka. don't learn C++
2) Remove null value issues
```

### Class Basket

| Member Variables   | Methods         | Scenario                                | Return Value/Output                           |
|--------------------|-----------------|-----------------------------------------|-----------------------------------------------|
| items: List<Bagel> | getItems()      | I want to get an overview of the bagels | If empty: Return 0                            |
|                    |                 | currently in my basket                  | Else: Retrieve the bagels                     |
|                    | addBagel()      | I want to add/buy a bagel to my basket  | If basket not full: Add, return true          |
|                    |                 |                                         | If basket full: Return false                  |
|                    | removeBagel()   | If I change my mind or                  | If bagel is in basket: Remove, return true    |
|                    |                 | do not have enough money to pay         | If bagel not in basket: Return false;         |
|                    | checkCapacity() | If I try to buy more bagels             | If basket is full: Return false               |
|                    |                 | than I can hold                         | If basket is not full: Add, return true       |
|                    | setCapacity()   | I want to expand and allow more sales   | If basket changed capacity: Return true       |
|                    | checkExists()   | I want to make sure I don't remove      | If removing bagel not in basket: Return false |
|                    |                 | a bagel that I don't have in basket     | If removing bagel in basket: Return true      |
