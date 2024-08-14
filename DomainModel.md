
| Classes  | Variables                         | Methods                | Scenario                                | Outcomes                                 |
|----------|-----------------------------------|------------------------|-----------------------------------------|------------------------------------------|
| `Basket` | `ArrayList<String> bagels`        | `order(String bagel)`  | If bagels contains bagel                | Print confirmation and return true       |
|          | `ArrayList<String> orderedBagels` |                        | If bagels does not contain bagel        | Print error and return false             |
|          | `int capacity`                    | `remove(String bagel)` | If orderedBagels contains bagel         | Print confirmation and return true       |
|          |                                   |                        | If orderedBagels does not contain bagel | Print error and return false             |
|          |                                   | `full()`               | If orderedBagels is full                | Print full message and return true       |
|          |                                   |                        | If orderedBagels is not full            | Return not full message and return false |
|          |                                   | `setCapacity(int i)`   |                                         | Capacity is changed                      |