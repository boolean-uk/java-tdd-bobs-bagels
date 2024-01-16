# Domain model Bobs Bagels

### class Basket
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

| Variables                             | Methods                                                                               | Scenario                                                                                                               | Output                                                                                                                                    |
|---------------------------------------|---------------------------------------------------------------------------------------|------------------------------------------------------------------------------------------------------------------------|-------------------------------------------------------------------------------------------------------------------------------------------|
| `HashMap<String, Double\> Basket`     | `add(String bagelType)`<br> `remove(String bagelType)` <br>`exists(String bagelType)` | if there is capacity, adds bagel to basket, else basket is full<br>  remove bagel only, if bagel exists in basket <br> | "Added <bagel\> to basket."<br> "Basket is full."<br> "<bagel\> is not in basket, can't remove. "<br> Removed <bagel\> <br> from basket." |
| `HashMap<Integer, Boolean\> Capacity` | `changeCap(int cap)` <br> `isManager(int passWord)`                                   | if managercode is correct, change capacity. <br>                                                                       | "Password correct, capacity is updated!" <br> "Password inccorect, capacity is not updated!"                                              |

