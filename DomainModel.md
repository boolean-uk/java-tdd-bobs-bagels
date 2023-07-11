Domain model:


| Classes  | Methods                | Scenario                               | Outputs  |
|----------|------------------------|----------------------------------------|----------|
| `Basket` | `addBagel()`           | basket is not full                     | True     |
|          |                        | basket is full                         | False    |
|          | `removeBagel()`        | bagel is not the basket yet            | False    |
|          |                        | bagel is in the basket                 | True     |
|          | `basketCheck()`        | basket is not full                     | int size |
|          |                        | basket is full                         | 0        |
|          | `sizeChange(int size)` | new basket size is not bigger than 100 | True     |
|          |                        | new basket is bigger than 100          | False    |
|          | `bagelCheck()`         | bagel is not the basket yet            | False    |
|          |                        | bagel is in the basket                 | True     |