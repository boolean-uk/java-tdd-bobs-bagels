## Bobs bagels

| ClassName | Fields              | Methods                              | Scenario                                        | Output                               |
|-----------|---------------------|--------------------------------------|-------------------------------------------------|--------------------------------------|
| Basket    | List<String> bagels |                                      |                                                 |                                      |
|           |                     | boolean addBagel(String type)        | capacity of the basket exceeded                 | return false                         |
|           |                     |                                      | enough capacity for bagel                       | return true                          |
|           |                     | boolean removeBagel(String type)     | Bagel exists in the basket                      | removes bagel from list, return true |
|           |                     |                                      | Bagel doesnt exist in the basket                | return false                         |
|           | int capacity        |                                      |                                                 |                                      |
|           |                     | boolean changeCapacity(int capacity) | negative number or zero                         | return false                         |
|           |                     |                                      | capacity smaller than amount of items in basket | return false                         |
|           |                     |                                      | capacity than amount of items in basket         | change capacity, return true         |
|           |                     |                                      |                                                 |                                      |
