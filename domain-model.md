#Bob's Bagles


| Classes  | Methods                           | Scenario                                                                                               | Outputs                                                   |
|----------|-----------------------------------|--------------------------------------------------------------------------------------------------------|-----------------------------------------------------------|
| `Basket` | `addBagle(String typeOfBagle)`    | Adds 'typeOfBagle' if it is in 'Bagles' list and if there are less than 3 objects in 'baglesInBasket'. | updated 'baglesInBasket'                                  |
| `Basket` | `addBagle(String)`                | If `capacity` == 3                                                                                     | `"Basket is full."`                                       |
|          | `removeBagle(String typeOfBagle)` | Removes `typeOfBagle` if it is in `baglesInBasket` from it.                                            |                                                           |
|          | `removeBagle(String typeOfBagle)` | Removes `typeOfBagle` if `baglesInBasket` contains `typeOfBagle`                                       |                                                           |
|          | `changeBasketSize(int newSize)`   | Changes `capacity` atribute of `Basket` object to `newSize` if `User` equals `BAGELS_MANAGER`.         | `"Capacity changed to" newSize`                           |
|          | `changeBasketSize(int newSize)`   | If `User` !equals `BAGLES_MANAGER`                                                                     | `"You don't have permission to change default capacity."` |