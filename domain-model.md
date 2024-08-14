
## User Stories

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

| Class | Variables                                | Methods                             | Scenario                                    | Outcome                                                                                                    | Notes                              |
|------|------------------------------------------|-------------------------------------|---------------------------------------------|------------------------------------------------------------------------------------------------------------|------------------------------------|
|`Basket`      | `int basketSize`                    |                                     |                                             |                                                                                                            | max size of new baskets            |
|      | `private ArrayList<String> basket       `|                                     |                                             |                                                                                                            | list containing the bagels added   |
|      |                                          | `boolean addBagel(String type)    ` | User want to add a specific bagel           | If the basket has space, then add the bagel.<br/> If the basket is full, then print a message to the user. |                                    |
|      |                                          | `boolean removeBagel(String type) ` | User removes a specific bagel               | If basket is not empty, then remove the bagel.<br/> If the basket is empty, print an error message to user. |                                    |
|      |                                          | `int getMaxSize()             `     | Manager wants to know the max size of basket | int basketSize is returned.                                                                                |                                    | 
|      |                                          | `void setMaxSize(int newSize)`      | Manager sets the max size of basket         | basketSize is changed                                                                                      |                                    |
