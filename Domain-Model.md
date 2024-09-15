1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.

| Class  | Methods                            | Scenario                | Output                              |
|--------|------------------------------------|-------------------------|-------------------------------------|
| Basket | AddBagelToBasket(Arraylist<String>,String name) | if it's in the list     | return the list                     |
|        |                                    | if it's not in the list | return the added list with the name |
|        |                                    |                         |                                     |


2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.

| Class  | Methods                               | Scenario                | Output                                |
|--------|---------------------------------------|-------------------------|---------------------------------------|
| Basket |RemoveBagelFromBasket(Arraylist<String>,String name) | if it's in the list     | return the list                       |
|        |                                       | if it's not in the list | return the removed list with the name |
|        |                                       |                         |                                       |


3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.

| Class  | Methods                                      | Scenario         | Output       |
|--------|----------------------------------------------|------------------|--------------|
| Basket | RemoveNonexistentBagelFromBasket(Arraylist<String>,Int capacity) | if it's full     | return true  |
|        |                                              | if it's not full | return false |
|        |                                              |                  |              |


4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.

| Class  | Methods                                        | Scenario                      | Output               |
|--------|------------------------------------------------|-------------------------------|----------------------|
| Basket | ChangeCapacity(Arraylist<String>,Int capacity) | change capacity of user's bag | return new arraylist |
|        |                                                |                               |                      |


5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.

| Class  | Methods                                        | Scenario                                         | Output       |
|--------|------------------------------------------------|--------------------------------------------------|--------------|
| Basket | IsItemContained(Arraylist<String>,String item) | if the item contained to the user's bag          | return true  |
|        |                                                | if the item  doesn't contained to the user's bag | return false |
