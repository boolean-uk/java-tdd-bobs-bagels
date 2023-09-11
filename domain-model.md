
| Classes  | Members                  | Methods                             | Scenario                                                                            | Outputs                                  |
|----------|--------------------------|-------------------------------------|-------------------------------------------------------------------------------------|------------------------------------------|
| `Basket` | `ArrayList<String> list` | `addBagel(String type)`             | Bagel of this type is not in the basket                                             | "Added"                                  |
|          |                          |                                     | Bagel of this type is already  in the basket                                        | "This type already exists in the basket" |
|          | `ArrayList<String> list` | `removeBagel(String type)`          | Bagel of this type is not in the basket                                             | "Does not exist"                         |
|          |                          |                                     | Bagel of this type is already  in the basket                                        | "Removed"                                |
|          | `ArrayList<String> list` | `isBasketFull()`                    | Basket has reached its capacity                                                     | true                                     |
|          |                          |                                     | Basket has not reached its capacity                                                 | false                                    |
|          | `ArrayList<String> list` | `increaseCapacity(int newCapacity)` | Increases the capacity of basket                                                    | "Done"                                   |
|          |                          |                                     | Does not increases the capacity because the number is smaller than current capacity | "Enter a bigger number"                  |

For the fifth user stories I have modified the removeBagel to return different kinds of outputs to cover this case.