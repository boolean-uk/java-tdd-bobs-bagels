```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```
| Classes | Methods                       | Member Variables              | Scenario                            | Results                |
|---------|-------------------------------|-------------------------------|-------------------------------------|------------------------|
| Basket  | addToBasket(String bagelType) | ArrayList<String> bagelBasket | Add bagel successfully              | bagelBasket changed    |
|         |                               |                               |                                     | output success message |
|         |                               |                               |                                     | return true            |
|         |                               |                               |                                     |                        |
|         |                               | (3.) int bagelSize            | (3.) Adding a bagel is unsuccessful | bagelBasket unchanged  |
|         |                               |                               |                                     | output failure message |
|         |                               |                               |                                     | return false           |


```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
| Classes | Methods                     | Member Variables              | Scenario                                 | Results                            |
|---------|-----------------------------|-------------------------------|------------------------------------------|------------------------------------|
| Basket  | removeFromBasket(bagelType) | ArrayList<String> bagelBasket | If bagel is removed from basket          | Output message basket changed      |
|         |                             |                               |                                          | return True                        |
|         |                             |                               |                                          |                                    |
|         |                             |                               | (5.) If bagel is not removed from basket | Output message basket is unchanged |
|         |                             |                               |                                          | return false                       |

```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
| Classes | Methods                | Member Variables              | Scenario                                      | Results                |
|---------|------------------------|-------------------------------|-----------------------------------------------|------------------------|
| Basket  | addToBasket(bagelType) | ArrayList<String> bagelBasket |                                               | bagelBasket unchanged  |
|         |                        | int basketSize                | Adding bagel is unsuccessful (do to capacity) | output failure message |
|         |                        |                               |                                               | return false           |

```

4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
| Classes | Methods                             | Member Variables              | Scenario                                  | Results                   |
|---------|-------------------------------------|-------------------------------|-------------------------------------------|---------------------------|
| Basket  | changeBasketSize(int newBasketSize) | ArrayList<String> bagelBasket | If basketSize is successfully changed     | output success message    |
|         |                                     |                               |                                           | update capacity variable  |
|         |                                     |                               |                                           | return true               |
|         |                                     |                               |                                           |                           |
|         |                                     | int basketSize                | If basketSize is not successfully changed | output failure message    |
|         |                                     |                               |                                           | capacity remains the same |
|         |                                     |                               |                                           | return false              |
```

5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```
| Classes | Methods                     | Member Variables              | Scenario                            | Results                            |
|---------|-----------------------------|-------------------------------|-------------------------------------|------------------------------------|
| Basket  | removeFromBasket(bagelType) | ArrayList<String> bagelBasket |                                     |                                    |
|         |                             | int basketSize                | If bagel is not removed from basket | Output message basket is unchanged |
|         |                             |                               |                                     | return false                       |  