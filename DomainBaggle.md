| Classes | Members             | Methods                             | Fields | Scenario                | Output                           |
|---------|---------------------|-------------------------------------|--------|-------------------------|----------------------------------|
| Basket  | int Capacity        | addToBasket(String bagle)           |        | if Basket if full       | error                            |
|         | List<String> bagles |                                     |        | if not                  | space left in basket is capacity |
|         |                     | removeFromBasket(String bagle)      |        | if item not exist       | error                            |
|         |                     |                                     |        | if item exist           |                                  |
|         |                     | changeCapacityOfBasket(int newSize) |        | if newSize<=0           | error                            |
|         |                     |                                     |        | if i>0                  | int                              |
|         |                     |                                     |        | if newSize< bagles.size | error message                    |
|         |                     | getAllBagles                        |        |                         | List<String>                     |
|         |                     | getCapacity                         |        |                         | int                              |

