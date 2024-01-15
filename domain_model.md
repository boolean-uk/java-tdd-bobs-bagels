# Domain Model for Bob's Bagels

## User stories

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

Basket 

| Member Variables           | Methods                         | Scenario                                                   | Output                                               |
|----------------------------|---------------------------------|------------------------------------------------------------|------------------------------------------------------|
| HashMap<Bagel, int\> items | add(Bagel bagel)                | add bagel to basket, if already in basket increase amount. | "Added <BAGEL\> to basket"                           |
| int capacity               |                                 | cannot add more bagels than capacity allows.               | "Your basket is full"                                |
| int items                  | remove(Bagel bagel)             | remove bagel from basket, receive message when trying to   | "Removed <BAGEL> from basket"                        |
| boolean manager            |                                 | remove item that's not in basket.                          | "This bagel is not in your cart"                     |
|                            | updateCapacity(int newCapacity) | Allows managers to update capacity. Needs authorization.   | "Capacity updated." \|\| "Cannot update capacity."   |
|                            | totatCost()                     | Displays the total cost of all items in basket.            | Sum of every item's price, takes account of amounts. |

Bagel

| Member Variables | Methods    |
|------------------|------------|
| String name      | getPrice() |
| double price     |            |

