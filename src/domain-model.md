| Clasess | Members                  | Methods                                   | Scenario                | Output             |
|---------|--------------------------|-------------------------------------------|-------------------------|--------------------|
| Basket  | ArrayList<String> bagels | add(String bagel)                         | Can add to list         | updated list       |
|         |                          |                                           | Can't add to list       | list full          |
|         |                          | remove(String bagel)                      | Remove item             | updated list       |
|         |                          |                                           | List empty              | empty list         |
|         |                          | isFull()                                  | List is full            | true               |
|         |                          |                                           | List is not full        | false              |
|         |                          | expandListCapacity()                      | Add size to list        | new size list      |
|         |                          | tryRemoveNonExistingElement(String bagel) | List don't contain item | can't find in list |
|         |                          |                                           |                         |                    |
|         |                          |                                           |                         |                    |
