| `Classes` | `Member`                          | `Methods`                       | `Scenario`               | `Outcome`                                       |
|-----------|-----------------------------------|---------------------------------|--------------------------|-------------------------------------------------|
| `Basket`  | `Hashmap<String, Integer> bagels` | `add(String bagel, int num)`    | Bagel-key already exists | Return true, Bagel number is incremented by num |
|           | `int capacity`                    |                                 | Bagel-key does not exist | Return true, Bagel key is created with value    |
|           |                                   |                                 | Basket is full           | Return false 
|           |                                   | `remove(String bagel, int num)` | Bagel-key exists         | Return true, Bagel value is decremented by num  |
|           |                                   |                                 | Bagel-key does not exist | Return false                                    |
|           |                                   | `checkCapacity()`               | Basket is full           | Return false                                    |
|           |                                   |                                 | Basket is not full       | Return true                                     |
|           |                                   | `incCapacity(int num)`          | Capacity value exists    | Capacity increases by num                       |

