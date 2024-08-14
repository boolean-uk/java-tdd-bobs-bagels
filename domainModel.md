### Leo Wahlandt Domain Model


```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Classes | Member Variable          | Method                             | Scenario                                | Outcome |
|---------|--------------------------|------------------------------------|-----------------------------------------|---------|
| Basket  | ArrayList<String> basket | add(String bagelType)              | Add existing bagel into basket          | true    |
|         |                          |                                    | Try to add non-existing bagel to basket | false   |
|         |                          |                                    |                                         |         |

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
| Classes | Member Variable          | Method                            | Scenario                                   | Outcome |
|---------|--------------------------|-----------------------------------|--------------------------------------------|---------|
| Basket  | ArrayList<String> basket | remove(String bagel)              | Remove existing bagel from basket          | true    |
|         |                          |                                   | Try to remove non-existing bagel to basket | false   |
|         |                          |                                   |                                            |         |




```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
| Classes | Member Variable            | Method                  | Scenario                      | Outcome |
|---------|----------------------------|-------------------------|-------------------------------|---------|
| Basket  | ArrayList<String> basket   | checkBasketSize()       | if basket size is not reached | True    |
|         |                            |                         | If basket size is reached     | false   |
|         |                            |                         |                               |         |



```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.

Manager has role number 0 for Admin
```
| Classes | Member Variable            | Method                                      | Scenario                             | Outcome |
|---------|----------------------------|---------------------------------------------|--------------------------------------|---------|
| Basket  | ArrayList<String> basket   | changeBasketSize(int memberId, int newSize) | Owner change basket size             | true    |
|         |                            |                                             | If someone else tries to change size | false   |
|         |                            |                                             |                                      |         |


```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Classes | Member Variable           | Method                | Scenario                                    | Outcome                            |
|---------|---------------------------|-----------------------|---------------------------------------------|------------------------------------|
| Basket  | ArrayList<String> basket  | remove(String bagel)  | Try to remove non-existing bagel to basket  | "Cannot remove non-existing bagel" |
|         |                           |                       |                                             |                                    |
|         |                           |                       |                                             |                                    |
