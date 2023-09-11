# Domain Models
Design a domain from user stories before you begin building.

## User Stories
```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Class  | Attribute                  | Method            | Scenario                                                            | Outcome                                |
|--------|----------------------------|-------------------|---------------------------------------------------------------------|----------------------------------------|
| Basket | ArrayList<String> contents | add(String bagel) | Ignoring Capacity for now, I am trying to add a Bagel to the Basket | No Return Value, Bagel added to Basket |

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

| Class  | Attribute                  | Method               | Scenario                                                           | Outcome                                    |
|--------|----------------------------|----------------------|--------------------------------------------------------------------|--------------------------------------------|
| Basket | ArrayList<String> contents | remove(String bagel) | Supposing the Bagel exists in the Basket, I am trying to remove it | No Return Value, Bagel removed from Basket |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

| Class  | Attribute                                | Method            | Scenario                     | Outcome                          |
|--------|------------------------------------------|-------------------|------------------------------|----------------------------------|
| Basket | ArrayList<String> contents, int capacity | add(String bagel) | If Capacity is not maxed out | True, Bagel added to Basket      |
|        |                                          |                   | If Capacity is maxed out     | False, Bagel not added to Basket |

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

| Class  | Attribute      | Method                  | Scenario                                                                                                             | Outcome                                   |
|--------|----------------|-------------------------|----------------------------------------------------------------------------------------------------------------------|-------------------------------------------|
| Basket | int capacity   | expandSize(int newSize) | Supposing expanding the business means Baskets become bigger and not smaller, I want to increase the Basket Capacity | No Return Value, Capacity Value Increases |

```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Class  | Attribute                  | Method               | Scenario               | Outcome                         |
|--------|----------------------------|----------------------|------------------------|---------------------------------|
| Basket | ArrayList<String> contents | remove(String bagel) | If Bagel in Basket     | True, Bagel removed from Basket |
|        |                            |                      | If Bagel not in Basket | False, Notify User              |
