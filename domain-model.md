# Bob's bagels
### Dorota Wlazło, Miłosz Sobczyk

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
```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```
```
6.
As a member of the public
So that I can easily calculate cost of bagels
I'd like to know the total cost of bagels in my basket
```
```
7.
As a Bob's bagels manager
So that I can expand my business
I'd like to add new type of bagel
```
```
8.
As a Bob's bagels manager
So that I can adjust prices to economic situation
I'd like to change the price of available bagels
```

| Class  | Field                                    | Method                                                  | Condition                                                                              | Output                         |
|--------|------------------------------------------|---------------------------------------------------------|----------------------------------------------------------------------------------------|--------------------------------|
| Basket | Hashmap<String, Integer> bagelsCount     | boolean add(String bagelType, int amount)               | if there are less bagels in total than capacity                                        | true                           |
|        | int capacity                             |                                                         | if there are more bagels in total than capacity or the bagelType is N/A or amount <= 0 | false                          |
|        | int currentAmount                        | boolean remove(String bagelType, int amount)            | if the amount of bagels of bagelType in basket is >= amount                            | true                           |
|        | Hashmap<String, Integer> availableBagels |                                                         | if the amount of bagels of bagelType in basket is < amount or amount <= 0              | false                          |
|        |                                          | boolean changeCapacity(int newCapacity)                 | if newCapacity >= currentAmount                                                        | true                           |
|        |                                          |                                                         | if newCapacity < currentAmount                                                         | false                          |
|        |                                          | int totalCost()                                         | always                                                                                 | total cost of bagels in basket |
|        |                                          | boolean addBagelType(String bagelType, int cost)        | if bagelType is N/A                                                                    | true                           |
|        |                                          |                                                         | if bagelType is available or cost <= 0                                                 | false                          |
|        |                                          | boolean changeBagelPrice(String bagelType, int newCost) | if bagelType is available                                                              | true                           |
|        |                                          |                                                         | if bagelType is N/A or newCost <= 0                                                    | false                          |


