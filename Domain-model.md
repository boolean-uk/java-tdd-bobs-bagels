## Domain model for Bobs Bagels

```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```
Basket class

| Methods                   | Member variables              | Scenario                         | Output/result    |
|---------------------------|-------------------------------|----------------------------------|------------------|
| addToBasket(String bagel) | String bagelName              | User adds bagels into the basket | return basketArr |
|                           | double price                  |                                  |                  |
|                           | HashMap<String,double> bagels |                                  |                  |
|                           | String[] basketArr            |                                  |                  |

```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

| Methods                        | Member variables              | Scenario                             | Output/result    |
|--------------------------------|-------------------------------|--------------------------------------|------------------|
| removeFromBasket(String bagel) | String bagelName              | User removes a bagel from the basket | return basketArr |
|                                | double price                  |                                      |                  |
|                                | HashMap<String,double> bagels |                                      |                  |
|                                | String[] basketArr            |                                      |                  |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an
item beyond my basket capacity.
```

| Methods                   | Member variables              | Scenario                         | Output/result |
|---------------------------|-------------------------------|----------------------------------|---------------|
| addToBasket(String bagel) | String bagelName              | User adds bagels into the basket |               |
|                           | double price                  | if the basket is not full:       | return true   |
|                           | HashMap<String,double> bagels | if the basket is full            | return false  |
|                           | String[] basketArr            |                                  |               |

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

| Methods                           | Member variables              | Scenario                                | Output/result       |
|-----------------------------------|-------------------------------|-----------------------------------------|---------------------|
| changeBasketCapacity(int newSize) | String bagelName              | Make a new basket with the              |                     |
|                                   | double price                  | new size, copy from the old basket into |                     |
|                                   | HashMap<String,double> bagels | the new in a for loop                   | return confirmation |
|                                   | String[] basketArr            |                                         |                     |

```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```

| Methods                        | Member variables              | Scenario                                     | Output/result |
|--------------------------------|-------------------------------|----------------------------------------------|---------------|
| removeFromBasket(String bagel) | String bagelName              | User tries to remove a bagel from the basket |               |
|                                | double price                  | if the basket does not contain it:           | return false  |
|                                | HashMap<String,double> bagels | if the basket does contain the bagel         | return basket |
|                                | String[] basketArr            |                                              |               |
