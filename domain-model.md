

| Classes | Methods                     | Variables                | Scenario                       | Output                          | User stories |
|---------|-----------------------------|--------------------------|--------------------------------|---------------------------------|--------------|
| Basket  |                             | int basketSize           |                                |                                 |              |
|         |                             | ArrayList<String> basket |                                |                                 |              |
|         |                             |                          |                                |                                 |              |
|         | addBagel(String bagel)      |                          | Basket is full                 | return true                     | 1 3          |
|         |                             |                          | Basket is not full             | return false                    |              |
|         | removeBagel(String bagel)   |                          | Item exists in basket          | Bagel removed from basket list  | 2 5          |
|         |                             |                          | Item doesn't exists in basket  | print no bagel in basket        |              |
|         | changeCapacity(Int newSize) |                          | newSize is valid(not negative) | change basketSize variable      | 4            |
|         |                             |                          | newSize invalid(negative num)  | print invalid size              |              |
|         | getBasketSize()             |                          | Reads current basketSize       | returns integer of maximum size |              |
