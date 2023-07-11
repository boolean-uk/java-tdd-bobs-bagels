# Domain model
## Bob's bagels

| Classes | Attributes                     | Methods                      | Scenario                                                     | Outputs                    |
|---------|--------------------------------|------------------------------|--------------------------------------------------------------|----------------------------|
| Basket  | ArrayList<String> bagelsBasket | add(String bagel)            | enough space for new bagel                                   | true                       |
|         | int capacity                   |                              | not enough space for new bagel                               | false(Print error message) |
|         | boolean isManager              | remove(String bagel)         | bagel properly removed                                       | true                       |
|         |                                |                              | bagel can't be removed (there's no such a bagel in a basket) | false(Print error message) |
|         |                                | changeCapacity(int capacity) | if user is a manager - changes basket capacity               | print message              |
|         |                                |                              | if user is not a manager - doesn't change basket capacity    | print message              |
|         |                                |                              |                                                              |                            |
|         |                                |                              |                                                              |                            |
|         |                                |                              |                                                              |                            |
