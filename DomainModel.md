# Domain Model

| Classes | Methods                         | Fields                            | Scenario                             | Output |
|---------|---------------------------------|-----------------------------------|--------------------------------------|--------|
| Basket  | add()                           | int capacity, List<String> bagels | adding a bagel                       |        |
|         | remove(String bagel)            |                                   | remove provided bagel                |        |
|         | isFull()                        |                                   | if basket is full                    | true   |
|         |                                 |                                   | if basket is not full                | false  |
|         | changeCapacity(int newCapacity) |                                   | set new capacity                     |        |
|         | checkIfExist(String bagel)      |                                   | if provided bagel is in a basket     | true   |
|         |                                 |                                   | if provided bagel is not in a basket | false  |
