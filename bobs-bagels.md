## Bob's Bagels

### User Stories
```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
Bagel Class

| Methods                               | Member Variables          | Scenario                                                          | Return Value/Output/Result                                                 |
|---------------------------------------|---------------------------|-------------------------------------------------------------------|----------------------------------------------------------------------------|
| addBagel(String bagelType)            | ArrayList\<String> basket | Customer adds new bagel to empty basket                           | Returns true and adds bagel to the basket list.                            |
| removeBagel(String bagelType)         | int capacity              | Customer adds new bagel. Basket contains 5 bagels. Capacity is 5. | Returns false and outputs "Basket is full".                                |
| changeBasketCapacity(int newCapacity) | int bagelsInBasket        | Customer removes bagel from basket. Bagel exists in the basket.   | Returns true and bagel is removed from the basket list.                    |
|                                       |                           | Customer removes bagel from basket. Basket contains 0 bagels.     | Returns false.                                                             |
|                                       |                           | Customer tries to remove a bagel that is not in the basket.       | Returns false and outputs "That bagel is not in the basket".               |
|                                       |                           | Manager wants to change capacity to 10 from 5.                    | Returns basket size as int (10). Size of the basket list is changed to 10. |
|                                       |                           | Manager wants to change capacity to 4 from 5.                     | Returns basket size as int (4). Size of the basket list is changed to 4.   |

