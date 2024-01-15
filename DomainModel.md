| Method                          | Members                  | Scenario                                  | Output |
|---------------------------------|--------------------------|-------------------------------------------|--------|
| add(String bagel)               | HashMap<String, Integer> | Bagel doesn't exists in the basket        | true   |
|                                 | int capacity             | Bagel already exists in basket            | true   |
|                                 | int noOfItems            | The basket is at maximum capacity already | false  |
| remove(String bagel)            |                          | More than one bagel exists in basket      | true   |
|                                 |                          | Exactly one bagel exists in basket        | true   |
|                                 |                          | The bagel doesn't exist in the basket     | false  |
| updateCapacity(int newCapacity) |                          | Updating the capacity                     | void   |
