## Mikołaj Szkaradek, Bartłomiej Walczak



Basket class fields: int capacity, List\<String\> contents



| Class  | Methods                               | Scenario                            | Outcome                              |
| ------ | ------------------------------------- | ----------------------------------- | ------------------------------------ |
| Basket | addToBasket(String bagelType)         | Bagel type exists                   | bagel is added to basket             |
|        |                                       | Bagel type does not exist           | exception is thrown                  |
|        | removeFromBasket(String bagelType)    | Bagel type is in the basket         | bagel is removed from the basket     |
|        |                                       | Bagel type is not in the basket     | Print info that bagel is not present |
|        | isBasketFull()                        | Basket is full                      | return true                          |
|        |                                       | Basket is not full yet              | return false                         |
|        | changeBasketCapacity(int newCapacity) | new capacity is < current capacity  | exception is thrown                  |
|        |                                       | new capacity is >= current capacity | capacity is set to newCapacity       |
|        |                                       |                                     |                                      |