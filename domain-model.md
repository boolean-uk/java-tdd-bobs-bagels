# User Stories

## Class Basket
```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Members                     | Methods                | Scenario                   | Return             |
|-----------------------------|------------------------|----------------------------|--------------------|
| ArrayList<String> bagelList | addBagel(String bagel) | Bagel is not in basket     | String Information |
|                             |                        | Bagel is already in basket | String Information |

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.

5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Members                     | Methods                   | Scenario                     | Return             |
|-----------------------------|---------------------------|------------------------------|--------------------|
| ArrayList<String> bagelList | removeBagel(String bagel) | Bagel is not in basket       | String Information |
|                             |                           | Bagel is removed from basket | String Information |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

| Members                     | Methods           | Scenario           | Return             |
|-----------------------------|-------------------|--------------------|--------------------|
| ArrayList<String> bagelList | checkBasketSize() | Basket is full     | String Information |
|                             |                   | Basket is not full | String Information |

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

| Members                     | Methods            | Scenario       | Return             |
|-----------------------------|--------------------|----------------|--------------------|
| ArrayList<String> bagelList | changeBasketSize() | Size changed   | String Information |
|                             |                    | Size Unchanged | String Information |
