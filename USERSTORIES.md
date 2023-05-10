
`Basket`

| Fields                                | Methods                                 | Scenarios                                                                    | Outputs/Outcomes                             |
|---------------------------------------|-----------------------------------------|------------------------------------------------------------------------------|----------------------------------------------|
| `HashMap<String, Integer> bagelTypes` |                                         |                                                                              |                                              |
| `int capacity`                        |                                         |                                                                              |                                              |
|                                       | `add(String bagelType, int count)`      | Basket capacity is full                                                      | Return false, inform the user                |
|                                       |                                         | Basket capacity is not full                                                  | Return true, increment bagelCount by count   |
|                                       | `remove(String bagelType, int count)`   | Remove count is greater than the number of bagelType value inside the basket | Return false, inform the user                |
|                                       |                                         | Remove count is correct                                                      | Return true                                  |
|                                       |                                         | bagelType does not exist                                                     | Return false, inform the user                |
|                                       | `updateBasketCapacity(int newCapacity)` | newCapacity is less than or equal to 0                                       | Return false, inform the manager             |
|                                       |                                         | newCapacity has a valid value                                                | Return true, set the capacity to newCapacity |
