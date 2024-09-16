| Class    | Attributes                        | Methods                                 | Scenario                              | Output                                           |  
|----------|-----------------------------------|-----------------------------------------|---------------------------------------|--------------------------------------------------|
| `Basket` | `HashMap<String, Integer> items`  | `addItem(String item, int quantity)`    | If basket is not full                 | `Added item to basket, you can add 2 items more` |
| `Basket` | `int capacity`                    |                                         | If basket is full                     | `Basket is full`                                 |
|          |                                   | `removeItem(String item, int quantity)` | If item is in basket                  | true                                             |
|          |                                   |                                         | If item is not in basket              | false                                            |
|          |                                   | `isFull()`                              | If basket is full                     | true                                             |
|          |                                   |                                         | If basket is not full                 | false                                            |
|          |                                   | `changeCapacity(int newCapacity)`       | Bob's manager want to change capacity |                                                  |
