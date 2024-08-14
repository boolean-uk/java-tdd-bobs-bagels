

| Classes  | Method                                         | Member Variables      | Scenario                                                                                          | Output     |
|----------|------------------------------------------------|-----------------------|---------------------------------------------------------------------------------------------------|------------|
| `Basket` | `addBagel(String bagelType)`                   | `List<String> bagels` | If bagels.length; < basketLimit, add the bagel to the list.                                       | true       |
|          |                                                | `int basketLimit`     | Else: let user know it is full.                                                                   | false      |
|          |                                                |                       |                                                                                                   |            |
|          | `removeBagel(String bagelType)`                | `int managerKey`      | If bagelType in bagels, remove it from the basket and notify user with true.                      | true       |
|          |                                                |                       | Else: no bagelType found in bagel, notify user with false.                                        | false      |
|          |                                                |                       |                                                                                                   |            |
|          | `changeBasketCapacity(int newBasketCapacity)`  |                       | If user is manager, replace the basketLimit with newBasketCapacity. Success of change equals true | true/false |





