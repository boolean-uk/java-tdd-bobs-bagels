# Basket Manager

Domain model



| Classes | Methods                                | Scenarios                              | Outputs                       |   
|---------|----------------------------------------|----------------------------------------|-------------------------------|
| Basket  | add(ArrayList<String> item)            | If item is in list                     | false                         |
|         |                                        | If item is not in list                 | true                          |
|         | remove(ArrayList<String> item)         | If item is in list                     | remove the item               |
|         |                                        | If item is not in list                 | message "your basket is empty" |
|         | isFull(int capacity)                   | If list is full                        | true                          |
|         |                                        | If list is not full                    | false                         |
|         | changeCapacity(int capacity )          | If basket is full, update the capacity | int                           |
|         | isItemInBasket(ArrayList<String> item) | If item is in the basket               | true                          |
|         |                                        | If item is not in the basket           | false                         |