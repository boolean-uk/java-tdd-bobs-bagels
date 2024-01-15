Basket

| Methods                         | Members                         | Scenario                                                                           | Output     |
|---------------------------------|---------------------------------|------------------------------------------------------------------------------------|------------|
| add(String bagel)               | HashMap<String, Integer> items  | Bagel doesn't exists in the basket                                                 | true       |
|                                 | int capacity                    | Bagel already exists in basket                                                     | true       |
|                                 | int noOfItems                   | The basket is at maximum capacity already                                          | false      |
| remove(String bagel)            |                                 | More than one bagel exists in basket                                               | true       |
|                                 |                                 | Exactly one bagel exists in basket                                                 | true       |
|                                 |                                 | The bagel doesn't exist in the basket                                              | false      |
| updateCapacity(int newCapacity) |                                 | Updating the capacity to a number higher or equal to the current items in basket   | true       |
|                                 |                                 | Updating the capacity to a number lower than the current number of items in basket | false      |
| getCost()                       | HashMap<String, Integer> prices |  Customer wants to get the cost for the items in their basket                                                                                   | total cost |

