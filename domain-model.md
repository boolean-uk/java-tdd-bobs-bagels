# Domain model for Bob's bagels

````
User story 1
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
````
Class Basket

| Class vars     | Methods               | Scenario                        | Return/Result |
|----------------|-----------------------|---------------------------------|---------------|
| Bagel[] basket | addBagel(Bagel bagel) | if bagel is added to basket     | true          |
|                |                       | if bagel is not added to basket | false         |

Class Bagel

| Class vars       | Methods                                            | Scenario | Return/Result |
|------------------|----------------------------------------------------|----------|---------------|
| String name      | Bagel(String name, String productID, double price) |          |               |
| String productID |                                                    |          |               |
| double price     |                                                    |          |               |

````
User story 2
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
````

Class Basket

| Class vars     | Methods                  | Scenario                        | Return/Result |
|----------------|--------------------------|---------------------------------|---------------|
| Bagel[] basket | removeBagel(Bagel bagel) | if bagel is removed from basket | true          |
|                |                          | if bagel is not in basket       | false         |

Class Bagel

| Class vars       | Methods                                            | Scenario | Return/Result |
|------------------|----------------------------------------------------|----------|---------------|
| String name      | Bagel(String name, String productID, double price) |          |               |
| String productID |                                                    |          |               |
| double price     |                                                    |          |               |

````
User story 3
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
````

Class Basket

| Class vars     | Methods               | Scenario                                  | Return/Result |
|----------------|-----------------------|-------------------------------------------|---------------|
| Bagel[] basket | basketIsAlreadyFull() | if basket is full and bagel was not added | true          |
|                |                       | if basket is not full and bagel was added | false         |

Class Bagel

| Class vars       | Methods                                            | Scenario | Return/Result |
|------------------|----------------------------------------------------|----------|---------------|
| String name      | Bagel(String name, String productID, double price) |          |               |
| String productID |                                                    |          |               |
| double price     |                                                    |          |               |

````
User story 4
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
````

Class Basket

| Class vars     | Methods                                          | Scenario                                    | Return/Result |
|----------------|--------------------------------------------------|---------------------------------------------|---------------|
| Bagel[] basket | changeCapacityOfBasket(int numberOfExtraIndices) | if extra capacity is added successfully     | true          |

Class Bagel

| Class vars       | Methods                                            | Scenario | Return/Result |
|------------------|----------------------------------------------------|----------|---------------|
| String name      | Bagel(String name, String productID, double price) |          |               |
| String productID |                                                    |          |               |
| double price     |                                                    |          |               |

````
User story 5
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
````

Class Basket

| Class vars     | Methods                                       | Scenario                  | Return/Result |
|----------------|-----------------------------------------------|---------------------------|---------------|
| Bagel[] basket | removeNonExistentBagelFromBasket(Bagel bagel) | if bagel is not in basket | true          |
|                |                                               | if bagel is in basket     | false         |

Class Bagel

| Class vars       | Methods                                            | Scenario | Return/Result |
|------------------|----------------------------------------------------|----------|---------------|
| String name      | Bagel(String name, String productID, double price) |          |               |
| String productID |                                                    |          |               |
| double price     |                                                    |          |               |
