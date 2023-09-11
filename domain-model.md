
| Classes  | Members                  | Methods                        | Scenario                                     | Outputs          |
|----------|--------------------------|--------------------------------|----------------------------------------------|------------------|
| `Basket` | `ArrayList<String> list` | `addBagel(String type)`        | Bagel of this type is not in the basket      | true             |
|          |                          |                                | Bagel of this type is already  in the basket | false            |
|          | `ArrayList<String> list` | `removeBagel(String type)`     | Bagel of this type is not in the basket      | "Does not exist" |
|          |                          |                                | Bagel of this type is already  in the basket | "Removed"        |
|          | `ArrayList<String> list` | `isBasketFull()`               | Basket has reached its capacity              | true             |
|          |                          |                                | Basket has not reached its capacity          | false            |
|          | `ArrayList<String> list` | `setCapacity(int newCapacity)` | Changes the capacity of basket               | boolean          |
|          |                          |                                |                                              |                  |

For the fifth user stories I have modified the removeBagel to return different kinds of outputs to cover this case.