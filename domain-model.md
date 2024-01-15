## Domain model

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Classes | Methods                      | Scenario                 | Returns                         |
|---------|------------------------------|--------------------------|---------------------------------|
| Basket  | String addBagel(String name) | Add a non-existent bagel | "name added"                    |
|         |                              | Add a existing bagel     | "name already exists in basket" |


```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

| Classes | Methods                         | Scenario                              | Returns               |
|---------|---------------------------------|---------------------------------------|-----------------------|
| Basket  | String removeBagel(String name) | Remove an existing bagel              | "name removed"        |
|         |                                 | Remove an bagel that is not in basket | "Bagel not in basket" |


```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

| Classes | Methods                      | Scenario                             | Returns       |
|---------|------------------------------|--------------------------------------|---------------|
| Basket  | String addBagel(String name) | Add bagel when basket is at capacity | "Basket full" |
|         |                              | Add bagel when not at capacity       | "name added"  |
|         |                              |                                      |               |


```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

| Classes | Methods                              | Scenario                       | Returns |
|---------|--------------------------------------|--------------------------------|---------|
| Basket  | boolean changeCapacity(int capacity) | Add a valid capacity           | true    |
|         |                                      | Add invalid capacity (e.g. -1) | false   |


```
.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Classes | Methods                         | Scenario                   | Returns                 |
|---------|---------------------------------|----------------------------|-------------------------|
| Basket  | String removeBagel(String name) | Remove a non-existing item | "Bagel not in basket"   |
|         |                                 |                            |                         |
