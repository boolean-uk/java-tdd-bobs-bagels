```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```
Basket

| method             | object variables         | context                                           | output/return         |
|--------------------|--------------------------|---------------------------------------------------|-----------------------|
| order(String name) | ArrayList<String> bagels | If there are capacity, add a bagel to the basket. | return true  if added |
|                    |                          | If basket is full, don't add bagel to basket      | return false if full  |
---
```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
Basket

| method              | object variables         | context                                                                                                     | output/return                             |
|---------------------|--------------------------|-------------------------------------------------------------------------------------------------------------|-------------------------------------------|
| delete(String name) | ArrayList<String> bagels | If input matches a bagel, delete bagel from ArrayList </br> If input does not match a bagel, change nothing | return (String) "{name} has been deleted" |
|                     |                          |                                                                                                             | return (String) "{name} was not found"    |

---
```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
Basket

| method             | object variables         | context                                          | output/return        |
|--------------------|--------------------------|--------------------------------------------------|----------------------|
| order(String name) | ArrayList<String> bagels | If there are capacity, add a bagel to the basket | return true if added |
|                    |                          | If basket is full, don't add bagel to basket     | return false         |

---
```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
Basket

| method                  | object variable          | context                                                                                                                                                                                                                          | output/return |
|-------------------------|--------------------------|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|---------------|
| expand(int newCapacity) | ArrayList<String> bagels | If newCapacity is positive, update the capacity. </br> If a holder have less bagels than the new capacity, do nothing </br>If a holder have more bagels than the new capacity, delete the newest bagels. New holder is now full. |               |
|                         | int capacity             |                                                                                                                                                                                                                                  |               |

---
```
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```
Basket

| method              | object variables         | context                                                     | output/return                             |
|---------------------|--------------------------|-------------------------------------------------------------|-------------------------------------------|
| remove(String name) | ArrayList<String> bagels | If input matches a bagel, set the bagel to ```null``` </br> | return (String) "{name} has been deleted" |
|                     |                          | If input does not match bagel, change nothing               | return (String) "{name} was not found"    |
