| Class  |                     Members | Atribute                     |                           Scenario                           | Output |
|--------|----------------------------:|------------------------------|:------------------------------------------------------------:|--------|
| Basket |                             |                              |                                                              |        |
|        |  `ArrayList<String> basket` |                              |                                                              |        |
|        |                int capacity |                              |                                                              |        |
|        |                             | add(String bagel)            |      add the bagel to Basket if successfull return true      | true   |
|        |                             |                              |               return false if it is not added                | false  |
|        |                             | remove(String bagel)         |               remove bagel if it in the basket               | true   |
|        |                             |                              |                   if its not in the basket                   | false  |
|        |                             | getCapacity()                |              return the capacity of the basket               | int    |
|        |                             | setCapacity(int newCapacity) |                set the capacity of the basket                | true   |
|        |                             |                              | if basket new capacity smaller than the current bagels abort | false  |
|        |                             | isInBasket(String bagel)     |                      if bagel in basket                      | true   |
|        |                             |                              |                    if bagel not in basket                    | false  |
