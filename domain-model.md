

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```
| Methods            | Member variables    | Scenario           | Outputs/Results     |
|--------------------|---------------------|--------------------|---------------------|
| boolean addBagel() | String[] bagelTypes | If bagelType exist | Add bagel to basket |
|                    | String[] basket     |                    |                     |


```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
| Methods                           | Member variables    | Scenario                  | Outputs/Results        |
|-----------------------------------|---------------------|---------------------------|------------------------|
| boolean removeBagel(String bagel) | String[] bagelTypes | If bagelType exist        | Remove bagel to basket |
|                                   | String[] basket     | && bagelType is in basket |                        |
|                                   |                     |                           |                        |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
| Methods                | Member variables   | Scenario           | Outputs/Results |
|------------------------|--------------------|--------------------|-----------------|
| boolean isBasketFull() | int basketItems    | If basket is full  | Print message   |
|                        | int basketCapacity | If basket not full | Print message   |
|                        |                    |                    |                 |

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
| Methods                                          | Member variables   | Scenario                        | Outputs/Results     |
|--------------------------------------------------|--------------------|---------------------------------|---------------------|
| int changeBasketCapacity(int increaseOrDecrease) | int basketCapacity | Increase basket capacity by two | basketCapacity += 2 |
|                                                  |                    | Decrease basket capacity by one | basketCapacity--    |
|                                                  |                    |                                 |                     |

```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```
| Methods                        | Member variables    | Scenario                  | Outputs/Results        |
|--------------------------------|---------------------|---------------------------|------------------------|
| void removeBagel(String bagel) | String[] bagelTypes | If bagelType exist        | Remove bagel to basket |
|                                |                     | If bageltype do not exist | Print message          |
|                                |                     |                           |                        |
