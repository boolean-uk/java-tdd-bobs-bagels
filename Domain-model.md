# Domain model
## Bob's bagels

| Classes | Attributes                     | Methods                      | Scenario                                                     | Outputs                    |
|---------|--------------------------------|------------------------------|--------------------------------------------------------------|----------------------------|
| Basket  | ArrayList<String> bagelsBasket | add(String bagel)            | enough space for new bagel & bagel in menu                   | true                       |
|         | int capacity                   |                              | not enough space for new bagel or bagel not in menu          | false(Print error message) |
|         | boolean isManager              | remove(String bagel)         | bagel properly removed                                       | true                       |
|         | ArrayList<String> menu         |                              | bagel can't be removed (there's no such a bagel in a basket) | false(Print error message) |
|         |                                | changeCapacity(int capacity) | if user is a manager - changes basket capacity               | print message              |
|         |                                |                              | if user is not a manager - doesn't change basket capacity    | print message              |
|         |                                | addToMenu(String bagel)      | if user is a manager - adds to menu                          | print message              |
|         |                                |                              | if user is not a manager - doesn't add to menu               | print message              |
|         |                                | removeFromMenu(String bagel) | if user is a manager - removes from menu                     | print message              |
|         |                                |                              | if user is not a manager - doesn't remove from menu          | print message              |