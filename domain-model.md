## User Stories

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Method           | Member variables        | Scenario                 | Output/Results |
|------------------|-------------------------|--------------------------|----------------|
| add(String item) | ArrayList<String> items | If bagel *doesn't* exist | true           |
|                  |                         | If bagel *does* exist    | false          |


```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

| Method              | Member variables        | Scenario                          | Output/Results |
|---------------------|-------------------------|-----------------------------------|----------------|
| remove(String item) | ArrayList<String> items | If item *does* exists in basket   | true           |
|                     |                         | If item *doesn't* exist in basket | false          |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

| Method   | Member variables        | Scenario                | Output/Results |
|----------|-------------------------|-------------------------|----------------|
| isFull() | ArrayList<String> items | If basket *is* full     | true           |
|          |                         | If basket *isn't* full  | false          |

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

| Member variables                 | Scenario                                                | Output/Results |
|----------------------------------|---------------------------------------------------------|----------------|
| ArrayList<String> enhancedBasket | Customers can now choose which baskets they want to use | ...            |
|                                  |                                                         |                |

```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Method              | Member variables        | Scenario                          | Output/Results |
|---------------------|-------------------------|-----------------------------------|----------------|
| remove(String item) | ArrayList<String> items | If item *does* exists in basket   | true           |
|                     |                         | If item *doesn't* exist in basket | false          |