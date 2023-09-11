```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```
| Classes | Methods                       | Member Variables                 | Scenario                | Results |
|---------|-------------------------------|----------------------------------|-------------------------|---------|
| Basket  | addToBasket(String bagelType) | ArrayList<String> bagelInventory | If bagel is in list     | true    |
|         |                               | ArrayList<String> bagelBasket    | If bagel is not in list | false   |

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
| Classes | Methods                     | Member Variables              | Scenario                                 | Results |
|---------|-----------------------------|-------------------------------|------------------------------------------|---------|
| Basket  | removeFromBasket(bagelType) | ArrayList<String> bagelBasket | If bagel is removed from bagelBasket     | true    |
|         |                             |                               | If bagel is not removed from bagelBasket | false   |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
| Classes | Methods                | Member Variables              | Scenario                                                         | Results |
|---------|------------------------|-------------------------------|------------------------------------------------------------------|---------|
| Basket  | addToBasket(bagelType) | ArrayList<String> bagelBasket | If basketSize is bigger then bagelBasketSize, basket is not full | true    |
|         |                        | int basketSize                | If basketSize is smaller then bagelBasketSize, basket is full    | false   |

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
| Classes | Methods                         | Member Variables         | Scenario                                    | Results |
|---------|---------------------------------|--------------------------|---------------------------------------------|---------|
| Basket  | changeBasketSize(int increment) | ArrayList<String> bagels | If basketSize is successfully increased     | true    |
|         |                                 | int basketSize           | If basketSize is not successfully increased | false   |
```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```
| Classes | Methods                      | Member Variables         | Scenario                                 | Results |
|---------|------------------------------|--------------------------|------------------------------------------|---------|
| Basket  | removeFromBasket(bagelType)  | ArrayList<String> bagels | If bagelBasket contains bagelType        | true    |
|         |                              | int basketSize           | If bagelBasket doesn't contain bagelType | false   |