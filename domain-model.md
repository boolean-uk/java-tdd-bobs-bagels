# Basket model

## Basket class

class name: Basket

| Attributes | Methods | Scenario | Outcome(s) |
|------------|---------|----------|------------|
|            |         |          |            |
|            |         |          |            |
|            |         |          |            |
|            |         |          |            |

## User story 1
``1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.``

For this user story, the basket must be updated and now looks like this:
class name: Basket

| Attributes      | Methods                   | Scenario                      | Outcome(s)                                  |
|-----------------|---------------------------|-------------------------------|---------------------------------------------|
| String[] bagels | boolean add(String bagel) | The basket can hold the bagel | return true and add the bagel to the basket |
|                 |                           |                               |                                             |
|                 |                           |                               |                                             |
|                 |                           |                               |                                             |


## User story 2 and 4
``2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.``

``5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.``

I'd like to know if I try to remove an item that doesn't exist in my basket.
For this user story, the basket must be updated and now looks like this:
class name: Basket

| Attributes      | Methods                      | Scenario                                        | Outcome(s)                                  |
|-----------------|------------------------------|-------------------------------------------------|---------------------------------------------|
| String[] bagels | boolean add(String bagel)    | The basket can hold the bagel                   | return true and add the bagel to the basket |
|                 |                              |                                                 |                                             |
|                 | boolean remove(String bagel) | The basket contains the specified bagel         | return true and delete the bagel            |
|                 |                              | The basket does not contain the specified bagel | return false and print an error message     |


## User story 3
``3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.``

For this user story, the basket must be updated and now looks like this:
class name: Basket

| Attributes      | Methods                          | Scenario                                         | Outcome(s)                                  |
|-----------------|----------------------------------|--------------------------------------------------|---------------------------------------------|
| String[] bagels | boolean add(String bagel)        | The basket has space and the bagel can be added  | return true and add the bagel to the basket |
| int capacity    |                                  | The basket is full and the bagel cannot be added | return false and print an error message     |
|                 | boolean remove(String bagel)     | The basket contains the specified bagel          | return true and delete the bagel            |
|                 |                                  | The basket does not contain the specified bagel  | return false and print an error message     | 

## User story 4
``4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.``

For this user story, the basket must be updated and now looks like this:
class name: Basket 


| Attributes      | Methods                             | Scenario                                                                            | Outcome(s)                                        |
|-----------------|-------------------------------------|-------------------------------------------------------------------------------------|---------------------------------------------------|
| String[] bagels | boolean add(String bagel)           | The basket has space and the bagel can be added                                     | return true and add the bagel to the basket       |
| int capacity    |                                     | The basket is full and the bagel cannot be added                                    | return false and print an error message           |
|                 | boolean remove(String bagel)        | The basket contains the specified bagel                                             | return true and delete the bagel                  |
|                 |                                     | The basket does not contain the specified bagel                                     | return false and print an error message           |
|                 | boolean changeCapacity(int newSize) | The new size is smaller or equal to zero                                            | return false and print an error message           |
|                 |                                     | The new size is smaller than the current number of items in the basket              | return false and print an error message           |
|                 |                                     | The new size is greater than or equal to the current number of bagels in the basket | return true and update the capacity of the basket |
