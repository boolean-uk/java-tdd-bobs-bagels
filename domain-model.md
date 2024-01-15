# Domain model bagel shop

´´´
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.

´´´
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.

´´´
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.

´´´
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.

´´´
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.

´´´

| Classes | Methods                                          | Member Variables                                                         | Scenario                                                                                | Output/Result                                                                                                            |
|---------|--------------------------------------------------|--------------------------------------------------------------------------|-----------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------------------------|
| Basket  | String Add(String bagel, int amount)             | HashMap<String, Integer> items (String is bagel, int is amount of bagel) | If total amount of bagels amount in input is greater than or equal to maxCapacity       | Return a message saying items is full.                                                                                   |
|         |                                                  | int maxCapacity;                                                         | If total amount of bagels plus amount in input is less than maxCapacity                 | Adds amount of bagel to the items and Print whats added.                                                                 |
|         |                                                  |                                                                          |                                                                                         |                                                                                                                          |
|         | String Remove(String bagel, int amount)          |                                                                          | If bagel not in items                                                                   | Return a message saying bagel is not in items                                                                            |
|         |                                                  |                                                                          | If bagel in items but amount in input is greater than amount of bagel in items          | Return a message saying "you only have this amount of that type of bagel in your items"                                  |
|         |                                                  |                                                                          | If bagel in items and amount in input is less than or equal to amount of bagel in items | Remove amount of bagel from items and print how many of what bagel removed.                                              |
|         |                                                  |                                                                          |                                                                                         |                                                                                                                          |
|         | String SetBasketCapacity(int capacity)           |                                                                          | If capacity is less than total amount of bagels                                         | Change the value of maxCapacity and return a message with the new maxCapacity                                            |
|         |                                                  |                                                                          | If capacity is greater than total amount of bagels                                      | Empty basket and Change the value of maxCapacity and return a message that the basket is emptied and the new maxCapacity |
|         |                                                  |                                                                          |                                                                                         |                                                                                                                          |
|         | int GetTotalAmount() get total amounts of bagels |                                                                          |                                                                                         | return sum of values in items;                                                                                           |
|         |                                                  |                                                                          |                                                                                         |                                                                                                                          |

