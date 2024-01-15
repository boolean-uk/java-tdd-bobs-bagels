### User Stories

# Basket Class

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

``` Notes 
Class | Member variables | Methods | Scenario | Output/Result
Basket  String type        addBagelType()   Add a specific type of bagel to basket Return true
```

Version 1

| Class  | Member variables         | Methods                                | Scenario                          | Output/Result |
|--------|--------------------------|----------------------------------------|-----------------------------------|---------------|
| Basket | ArrayList<String> bagels | addBagelTypeToBasket(String bagelType) | If bagel type added to basket     | Return true   |
|        |                          |                                        | If bagel type not added to basket | Return false  |


```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
``` Notes 
Class | Member variables | Methods | Scenario | Output/Result
Basket  String type        removeBagelType()   Remove a specific type of bagel to basket Return true
```

Version 1

| Class  | Member variables         | Methods                                     | Scenario                          | Output/Result |
|--------|--------------------------|---------------------------------------------|-----------------------------------|---------------|
| Basket | ArrayList<String> bagels | removeBagelTypeFromBasket(String bagelType) | If bagel type removed from basket | Return true   |
|        |                          |                                             | If bagel type not removed basket  | Return false  |



```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

``` Notes
Class | Member variables | Methods | Scenario | Output/Result
Basket  String type        basketIsFull()   If basket is full return true
```

Version 1

| Class  | Member variables         | Methods                    | Scenario              | Output/Result                |
|--------|--------------------------|----------------------------|-----------------------|------------------------------|
| Basket | ArrayList<String> bagels | basketIsFull(int quantity) | If basket is full     | Return "Basket is full!"     |
|        |                          |                            | If basket is not full | Return "Basket is not full." |


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