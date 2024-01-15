```
1.
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

| Class  | Method              | Member Variables       | Scenario               | Outputs/Results                  |
|--------|---------------------|------------------------|------------------------|----------------------------------|
| Basket | add(String bagel)   | String bagel           | adds bagel to the list | Return the list with added bagel |
|        |                     | ArrayList<String> list |                        |                                  |


```
2.
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```
| Class  | Method               | Member Variables       | Scenario              | Outputs/Results                         |
|--------|----------------------|------------------------|-----------------------|-----------------------------------------|
| Basket | remove(String bagel) | String bagel           | if bagel is in list   | Remove bagel from the list              |
|        |                      | ArrayList<String> list | if bagel not in list  | No change, notify "bagel was not found" |


```
3.
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```
| Class  | Method              | Member Variables       | Scenario                      | Outputs/Results                              |
|--------|---------------------|------------------------|-------------------------------|----------------------------------------------|
| Basket | add(String bagel)   | String bagel           | if the capacity is full       | Return "Basket is full, bagel was not added" |
|        |                     | Arraylist<String> list | if capacity is not full       | Return the list with added bagel             |

```
4.
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```
| Class  | Method                       | Member Variables       | Scenario                          | Outputs/Results               |
|--------|------------------------------|------------------------|-----------------------------------|-------------------------------|
| Basket | changeCapacity(int capacity) | int capacity           | Copy the old list into a new list | Return "Capacity has changed" |
|        |                              | Arraylist<String> list | with the new capacity             |                               |

``` 
5.
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```
| Class  | Method               | Member Variables       | Scenario             | Outputs/Results                          |
|--------|----------------------|------------------------|----------------------|------------------------------------------|
| Basket | remove(String bagel) | String bagel           | if bagel is in list  | Remove bagel from list                   |
|        |                      | ArrayList<String> list | if bagel not in list | Return "Bagel does not exist in basket"  |
