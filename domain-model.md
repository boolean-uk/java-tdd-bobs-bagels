## Basket Class

| Attributes                 | Methods                            | Scenarios                                    | Outcomes                                |
|----------------------------|------------------------------------|----------------------------------------------|-----------------------------------------|
| `ArrayList<String> bagels` |                                    |                                              |                                         |
|                            | `add(String bagelType):boolean`    | 1. adds bagel to the basket                  | true                                    |
|                            |                                    | 3. basket is full                            | false                                   |
|                            | `remove(String bagelType):boolean` | 2. basket contains bagel                     | removes bagel from basket, returns true |
|                            |                                    | 5. basket does not contain bagel or is empty | returns false                           |
| `int capacity`             |                                    |                                              |                                         |
|                            | `setCapacity(int capacity):void`   | 4. Capacity larger than current capacity     | capacity changes                        |
|                            |                                    | 4. Capacity smaller than current capacity    | capacity doesn't change                 |

5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.