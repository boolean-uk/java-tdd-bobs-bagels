| class  | method                                       | scenario                                                                                                                                                        | output      |
|--------|----------------------------------------------|:----------------------------------------------------------------------------------------------------------------------------------------------------------------|-------------|
| Basket | addBagel( String bagelName, int quantity)    | add bagelName and Quantity. If basketTotal + quantity isnt not larger than basket limit then If it already exists put += to existing key else create key value. |             |
| Basket | remove bagel(String bagelName, int quantity) | if exists in basket then remove else alert("This bagel doesn't exist in basket")                                                                                |             |
| Basket | setBasketLimit(int  basketLimit)             | Increase/Reduce basket limit                                                                                                                                    |             |

| Variables                         |   |
|-----------------------------------|---|
| Map<String, Integer> basketItems; |   |
| int basketLimit                   |   |
| int basketTotal                   |   |

