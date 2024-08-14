| Classes                        | Variables                             | Methods                           | Scenario                                      | Outcome                           |
|--------------------------------|---------------------------------------|-----------------------------------|-----------------------------------------------|-----------------------------------|
| `Basket` | `HashMap<String, Integer> products`   | `add(String productName)`         | Item succesfully added.                       | true                              |
|                                |                                       |                                   | Basket is full. Item could not be added.      | false, Error: Basket is full                              |
|                                |                                       | `remove(String productName)`      | Item is in basket and can be removed.         | true                              |
|                                |                                       |                                   | Item is not in basket and can not be removed. | false, Error: Item does not exist |
|                                | `int maxCapacity`                     | `changeCapacity(int newCapacity)` | If newCapacity is more than 0.                | true                              |
|                                |                                       |                                   | If newCapacity is less than 1.                | false                             |
    
