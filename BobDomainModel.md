## Basket Class

| Members                  | Methods                                       | Scenario                                                        | Outcome/Output                                                                     | User story |
|--------------------------|-----------------------------------------------|-----------------------------------------------------------------|------------------------------------------------------------------------------------|------------|
| ArrayList<String> bagels |                                               |                                                                 |                                                                                    |            |
| int basketCapacity       |                                               |                                                                 |                                                                                    |            |
|                          | boolean addBagel(String bagelType)            | Bagels are successfully added to the basket                     | Return true                                                                        | 1          |
|                          |                                               | Bagels not added because basketCapacity has been reached        | Print message stating basket is full and return false                              | 1 + 3      |
|                          | boolean removeBagel(String bagelType)         | Bagel removed successfully from the basket                      | Return true                                                                        | 2          |
|                          |                                               | Bagel not removed because it does not exist in the basket       | Print message stating that the bagel does not exist in the basket and return false | 2 + 5      |
|                          | boolean updateBasketCapacity(int newCapacity) | Basket capacity successfully updated                            | Return true                                                                        | 4          |
|                          |                                               | Basket capacity cannot be updated to 0 or negative number       | Print error message + return false                                                 | 4          |
|                          |                                               | Basket capacity cannot be made smaller than current basket size | Print error message + return false                                                 | 4          |

