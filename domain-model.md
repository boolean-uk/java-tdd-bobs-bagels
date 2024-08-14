# Basket class


| Member variable | Data type                         |
|-----------------|-----------------------------------|
| `bagelMenu`     | `static Hashmap<String, Integer>` |
| `basket`        | `ArrayList<String>`               |
| `basketSize`    | `int`                             |
| `isManager`     | `Boolean`                         |



| Method                | Scenario                                                                                                                                  | Output                                                                                                   |
|-----------------------|-------------------------------------------------------------------------------------------------------------------------------------------|----------------------------------------------------------------------------------------------------------|
| `addBagel(String)`    | Basket not full<br/>Basket is full<br/>Bagel not on the menu                                                                              | Return "Bagel added to basket."<br/>Return "Basket is full."<br/>Return "This bagel is not on the menu." |
| `removeBagel(String)` | Bagel exists in basket<br/>Bagel does not exist in basket                                                                                 | Return "Bagel removed from basket."<br/>Return "This bagel is not in your basket."                       |
| `setBasketSize(int)`  | Basket capacity is changed to a positive integer by a manager<br/>Basket capacity value is not positive<br/>Basket capacity is changed by a non-manager | Return true<br/>Return false<br/>Return false                                                            |
