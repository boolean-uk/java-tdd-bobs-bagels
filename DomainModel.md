Domain model:


| Classes  | Methods         | Scenario                       | Outputs  |
|----------|-----------------|--------------------------------|----------|
| `Basket` | `addBagel()`    | basket is not full             | True     |
|          |                 | basket is full                 | False    |
|          | `removeBagel()` | bagel is not the basket yet    | False    |
|          |                 | bagel is in the basket         | True     |
|          | `basketCheck()` | basket is not full             | int size |
|          |                 | basket is full                 | 0        |
|          | `sizeChange()`  | new basket size is not too big | True     |
|          |                 | new basket is too big          | False    |
|          | `bagelCheck()`  | bagel is not the basket yet    | False    |
|          |                 | bagel is in the basket         | True     |