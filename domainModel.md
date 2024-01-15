# Basket Manager

Domain model



| Classes | Methods                           | Scenarios                    | Outputs                    |   
|---------|-----------------------------------|------------------------------|----------------------------|
| Basket  | add(List<String> item)            | If item is in list           | false                      |
|         |                                   | If item is not in list       | true                       |
|         | remove(List<String> item)         | If item is in list           | true                       |
|         |                                   | If item is not in list       | false                      |
|         | isFull(List<String> item)         | If list is full              | true                       |
|         |                                   | If list is not full          | false                      |
|         | changeCapacity(int capacity )     | If basket is full            | return new capacity        |
|         |                                   | If basket is not full        | keep the original capacity |
|         | isItemInBasket(List<String> item) | If item is in the basket     | true                       |
|         |                                   | If item is not in the basket | false                      |