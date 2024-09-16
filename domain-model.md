## Domain model

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Classes | Methods                      | Scenario             | Returns                 |
|---------|------------------------------|----------------------|-------------------------|
| Basket  | String addBagel(String name) | Add a new bagel      | "bagel name added"      |
|         |                              | Add a existing bagel | "bagel already exists"  |


```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

| Classes | Methods                         | Scenario                             | Returns               |
|---------|---------------------------------|--------------------------------------|-----------------------|
| Basket  | String removeBagel(String name) | Remove a bagel in basket             | "bagel removed"       |
|         |                                 | Remove a bagel that is not in basket | "Bagel not in basket" |


```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

| Classes | Methods                      | Scenario                       | Returns       |
|---------|------------------------------|--------------------------------|---------------|
| Basket  | String addBagel(String name) | Add bagel when basket not full | "bagel added" |
|         |                              | Add bagel when basket full     | "basket full" |
|         |                              |                                |               |


```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

| Classes | Methods                              | Scenario             | Returns |
|---------|--------------------------------------|----------------------|---------|
| Basket  | boolean changeCapacity(int capacity) | Add a valid capacity | true    |
|         |                                      | Add invalid capacity | false   |


```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Classes | Methods                         | Scenario                    | Returns                 |
|---------|---------------------------------|-----------------------------|-------------------------|
| Basket  | String removeBagel(String name) | Remove a non-existing bagel | "Bagel not in basket"   |
|         |                                 |                             |                         |