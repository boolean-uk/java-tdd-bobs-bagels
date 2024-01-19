### class Basket

| Methods                              | Members                   | Scenario                                                                                         | Output  |
|--------------------------------------|---------------------------|--------------------------------------------------------------------------------------------------|---------|
| `add(String bagelName)`              | `ArrayList<String> items` | Adds a bagel item to basket<br>If basket is full, we tell the user it is                         | boolean |
| `remove(String bagleName)`           | `ArrayList<String> items` | Removes a bagel item from the basket and returns true<br>In case the bagel is not in the list we | boolean |
| `changeBasketCapacity(int capacity)` | `int capacity`            | Alters the basket's capacity                                                                     | void    |
