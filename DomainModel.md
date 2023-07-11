Domain model:


| Classes  | Methods                                           | Scenario                                                                              | Outputs    |
|----------|---------------------------------------------------|---------------------------------------------------------------------------------------|------------|
| `Basket` | `addBagel(String[] basketArray, String bagel)`    | bagel has been added to the basket                                                    | True       |
|          |                                                   | basket is full                                                                        | False      |
|          | `removeBagel(String[] basketArray, String bagel)` | bagel hasn't been removed the basket yet                                              | False      |
|          |                                                   | bagel has been removed from the basket                                                | True       |
|          | `basketCheck(String[] basketArray)`               | basket is not full                                                                    | True       |
|          |                                                   | basket is full                                                                        | False      |
|          | `sizeChange(String[] basketArray, int size)`      | new basket size is not bigger than 100 and size is bigger than previous basket's size | New basket |
|          |                                                   | new basket is bigger than 100                                                         | null       |
|          | `bagelCheck(String[] basketArray, String bagel)`  | bagel is not the basket yet                                                           | False      |
|          |                                                   | bagel is in the basket                                                                | True       |