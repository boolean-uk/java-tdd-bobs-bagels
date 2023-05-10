# Bob's Bagels

### Domain model

| Fields                   | Methods                      | Scenarios                           | Outcome                                                                                |
|--------------------------|------------------------------|-------------------------------------|----------------------------------------------------------------------------------------|
| ArrayList<string> bagels |                              |                                     |                                                                                        |
|                          | addItem(String item)         | 1.                                  | return true                                                                            |
|                          |                              | 3. adding items beyond the capacity | return false, and a message                                                            |
|                          | removeItem(String item)      | 2.                                  | return true                                                                            |
|                          |                              | 5. removing not existing items      | return false, and a message                                                            |
| int Capacity             | setCapacity(int newCapacity) | 4.                                  | return true if newCapacity is a positive number bigger than the elements in the basket |
|                          |                              |                                     | returns false otherwise                                                                |



