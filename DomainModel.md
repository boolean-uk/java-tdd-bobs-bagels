Domain model:


| Classes  | Methods                                      | Scenario                               | Outputs  |
|----------|----------------------------------------------|----------------------------------------|----------|
| `Basket` | `addBagel(String bagel)`                     | basket is not full                     | True     |
|          |                                              | basket is full                         | False    |
|          | `removeBagel(String bagel)`                  | bagel is not the basket yet            | False    |
|          |                                              | bagel is in the basket                 | True     |
|          | `basketCheck(String[] basketArray)`          | basket is not full                     | int size |
|          |                                              | basket is full                         | 0        |
|          | `sizeChange(String[] basketArray, int size)` | new basket size is not bigger than 100 | True     |
|          |                                              | new basket is bigger than 100          | False    |
|          | `bagelCheck(String bagel)`                   | bagel is not the basket yet            | False    |
|          |                                              | bagel is in the basket                 | True     |