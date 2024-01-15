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

| Classes | Methods                               | Member Variables         | Scenario                                                                                  | Output/Result                                                                                          |
|---------|---------------------------------------|--------------------------|-------------------------------------------------------------------------------------------|--------------------------------------------------------------------------------------------------------|
| Basket  | void Add(String bagel, int amount)    | ArrayList<String> basket | If basket size plus amount in input is greater than or equal to maxCapacity               | Print a message saying basket is full.                                                                 |
|         |                                       | int maxCapacity;         | If basket size plus amount in input is less than maxCapacity                              | Adds amount of bagel to the basket and Print whats added.                                              |
|         |                                       |                          |                                                                                           |                                                                                                        |
|         | void Remove(String bagel, int amount) |                          | If bagel not in basket                                                                    | Print a message saying "you only have this amount of that type of bagel in your basket"                |
|         |                                       |                          | If bagel in basket but amount in input is greater than amount of bagel in basket          | Print a message saying bagel is not in basket                                                          |
|         |                                       |                          | If bagel in basket and amount in input is less than or equal to amount of bagel in basket | Remove amount of bagel from basket and print how many of what bagel removed.                           |
|         |                                       |                          |                                                                                           |                                                                                                        |
|         | void SetBasketCapacity(int capacity)  |                          | If capacity is less than size of basket                                                   | Change the value of maxCapacity                                                                        |
|         |                                       |                          | If capacity is greater than size of basket                                                | Remove the latest added bagels to match the new size of the basket and Change the value of maxCapacity |
|         |                                       |                          |                                                                                           |                                                                                                        |
|         |                                       |                          |                                                                                           |                                                                                                        |
|         |                                       |                          |                                                                                           |                                                                                                        |

