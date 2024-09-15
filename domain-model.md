# Domain model Bobs Bagels

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Class  | Method            | Variables                   | Scenario                                                      | Return value |
|--------|-------------------|-----------------------------|---------------------------------------------------------------|--------------|
| Basket | add(String bagel) | HashMap<String, int> basket | Empty string input                                            | Return false |
|        |                   |                             | Valid string input, bagel string put into basket with value 1 | Return True  |

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
| Class  | Method               | Variables                   | Scenario                                                    | Return value |
|--------|----------------------|-----------------------------|-------------------------------------------------------------|--------------|
| Basket | remove(String bagel) | HashMap<String, int> basket | Empty string input                                          | Return false |
|        |                      |                             | String that matches bagel in basket input, bagel is removed | Return true  |
```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
| Class  | Method            | Variables                   | Scenario                                                  | Return value |
|--------|-------------------|-----------------------------|-----------------------------------------------------------|--------------|
| Basket | add(String bagel) | int basketCapacity          | Bagel is added to none full basket                        | Return true  |
|        |                   | HashMap<String, int> basket | Bagel is added to full basket, the operation is cancelled | Return false |
```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
| Class  | Method                          | Variables          | Scenario                                                                                                                     | Return value |
|--------|---------------------------------|--------------------|------------------------------------------------------------------------------------------------------------------------------|--------------|
| Basket | setBasketCapacity(int capacity) | int basketCapacity | Capacity for basket is changed to higher or lower, so that add might be now able to or not able to be completed successfully | void         |
|        |                                 |                    | (Is this worth to consider?: Basket capacity lower than the amount in basket?)                                               |              |
```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```
| Class  | Method               | Variables                   | Scenario                                                                | Return value |
|--------|----------------------|-----------------------------|-------------------------------------------------------------------------|--------------|
| Basket | remove(String bagel) | HashMap<String, int> basket | Try to remove bagel not contained in the basket, operation is cancelled | Return false |
|        |                      |                             | Bagel is contained in basket, remove is successfull                     | Return true  |
```
6.
As a member of the public
So that I can satiate my peculiar tastes
I'd like to be able to order multiple of my favorite Onion bagel.

(Already laid up for this by using a HashMap)
```
| Class  | Method                        | Variables                   | Scenario                                                              | Return value |
|--------|-------------------------------|-----------------------------|-----------------------------------------------------------------------|--------------|
| Basket | add(String bagel, int num)    | HashMap<String, int> basket | Try to add beyond capacity                                            | Return false |
|        |                               | int basketCapacity          | Add bagel successfully                                                | Return true  |
| Basket | remove(String bagel, int num) | HashMap<String, int> basket | Try to remove more than what is contained in basket, cancel operation | Return false |
|        |                               |                             | Remove a number of bagels successfully                                | Return true  |
```
7.
As a member of the public
So that I can know what i have in my basket
I'd like to be able to display what is contained in my basket.
```
| Class  | Method          | Variables                   | Scenario                                                                             | Return value                      |
|--------|-----------------|-----------------------------|--------------------------------------------------------------------------------------|-----------------------------------|
| Basket | displayBasket() | HashMap<String, int> basket | Basket is empty                                                                      | Return empty string               |
|        |                 |                             | Basket has items, the bagel name with their number is turned into a multiline string | Return multiline string of basket |






