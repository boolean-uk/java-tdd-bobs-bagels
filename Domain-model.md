# Domain model
## Bob's bagels

| Classes | Attributes                     | Methods                      | Scenario                                                     | Outputs                    |
|---------|--------------------------------|------------------------------|--------------------------------------------------------------|----------------------------|
| Basket  | ArrayList<String> bagelsBasket | add(String bagel)            | enough space for new bagel                                   | true                       |
|         |                                |                              | not enough space for new bagel                               | false(Print error message) |
|         |                                | remove(String bagel)         | bagel properly removed                                       | true                       |
|         |                                |                              | bagel can't be removed (there's no such a bagel in a basket) | false(Print error message) |
|         |                                | changeCapacity(int capacity) | changes baskets capacity                                     | print message              |
|         |                                |                              |                                                              |                            |
|         |                                |                              |                                                              |                            |
|         |                                |                              |                                                              |                            |
|         |                                |                              |                                                              |                            |
