# Domain model

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

All methods in the `Basket` class:

| Methods              | Scenario                                                 | Outputs |
|----------------------|----------------------------------------------------------|---------|
| add(bagelType)       | if there is space, adds bagel to basket                  | boolean |
| add(bagelType)       | returns false otherwise                                  | boolean |
| remove(bagelType)    | if bagel of given type exists, removes bagel from basket | boolean |
| remove(bagelType)    | returns false otherwise                                  | boolean |
| changeCapacity(size) | changes basket capacity to given                         | void    |
