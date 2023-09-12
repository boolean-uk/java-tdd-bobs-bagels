# Basket

<!---
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
----------------------------------------------------------------------------------------------
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
----------------------------------------------------------------------------------------------
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
----------------------------------------------------------------------------------------------
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
----------------------------------------------------------------------------------------------
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
-->

| Classes | Methods                               | Scenario                              | Outputs |
|---------|---------------------------------------|---------------------------------------|---------|
| Basket  | add(String bagelname)                 | if the bagel has been added           | true    |
|         |                                       | if the bagel has not been found       | false   |
|         |                                       |                                       |         |
|         | remove(String name)                   | if the bagel is still in the list     | false   |
|         |                                       | if the bagel has been removed         | true    |
|         |                                       |                                       |         |
|         | capacityCheck()                       | if max capacity has been exceeded     | false   |
|         |                                       | if max capacity hasn't been exceeded  | true    |
|         |                                       |                                       |         |
|         | changeMaxCapacity(int newMaxCapValue) | if max capacity has been changed      | true    |
|         |                                       | if max capacity hasn't been changed   | false   |
|         |                                       |                                       |         |
|         | remove(String name)                   | If the item exists in the item list   | true    |
|         |                                       | If the item doesn't exist in the list | false   |

