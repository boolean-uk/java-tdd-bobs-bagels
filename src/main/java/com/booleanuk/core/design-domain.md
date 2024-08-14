| Classes  | Variables                                | Methods                              | Scenario                       | Outcome          |
|----------|------------------------------------------|--------------------------------------|--------------------------------|------------------|
| `Basket` | `ArrayList<String> products`             | `add (String)`                       | Product will be added          | true             |
|          |                                          |                                      | Product will not be added      | false            |
|          |                                          |                                      | If the basket is full          | Error            |
|          |                                          | `remove (String)`                    | Product will be removed        | true             |
|          |                                          |                                      | Product will not be removed    | false            |
|          |                                          |                                      | If a product does not exist    | Error            |
|          |                                          | `checkBasket()`                      | If basket has products         | Amount of bagels |
|          |                                          |                                      | If basket is full              | return 0         |
|          | `int maxCapBasket, int currentCapBasket` | `changeCapBasket (int newCapBasket)` | If newCapBasket is more than 0 | true             |
|          |                                          |                                      | If newCapBasket is less than 1 | false            |
|          |                                          |                                      |                                |                  |
