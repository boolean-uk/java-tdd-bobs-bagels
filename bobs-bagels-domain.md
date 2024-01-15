#Bob's bagels model

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
I'd like to know if I try to remove an item that doesn't exist in my basket.        if the item does not exist return error message
```


| Class  | Members           | Methods                              | Scenario                | Output/Results              |
|--------|-------------------|--------------------------------------|-------------------------|-----------------------------|
| Basket | ArrayList<String> | String addBagel(String bagel)        | Adds a bagel into the   | String (bagel +" has been   |
|        | bagelBasket       |                                      | bagel basket list       | added to your basket")      |
|        |                   | String removeBagel(String bagel)     | Removes a bagel         | String (bagel+" has been    |
|        |                   |                                      | from the basket list.   | removed from your basket")  |
|        | int capacity      |                                      | Checks if the item      | If the item does not exist; |
|        |                   |                                      | removed exists          | return error message        |
|        |                   | boolean basketIsFull(String bagel)   | Checks if the basket is | Returns true if full        |
|        |                   |                                      | full                    | Returns false if not full   |
|        |                   | int changeCapacity(int newCapacity)  | Lets the manager        | Return the new bagelBasket  |
|        |                   |                                      | change basket capacity  | capacity                    |
|        |                   |                                      |                         |                             |
|        |                   | boolean isEmpty()                    | Checks if the basket    | If empty return true        |
|        |                   |                                      | is empty                | else return false           |

