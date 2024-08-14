## Exercise Requirements

- Use only the Basket class and BasketTest class provided. Later, you'll be building another version of this project using multiple classes together as we learn object-oriented programming.
- You **must** design a domain model before you begin building. Add your model as either a `.md` file or a screenshot
- You **must** use the Red Green Refactor approach to write your code. To demonstrate this, `git commit` after writing your test and commit again after writing the source code to pass it

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
## Domain model Basket

| Variables                          | Methods                                              | Scenario                       | Outputs                                                     |
|------------------------------------|------------------------------------------------------|--------------------------------|-------------------------------------------------------------|
| `ArrayList<String> bagelsInStore`  |                                                      |                                |                                                             |
| `ArrayList<String> bagelsInBasket` | `boolean removeBagel(String bagel)`                  | Removing a specific bagel      | Sysout bagel removed from basket or bagel doesnt exist      |
|                                    | `boolean addBagel(String bagel)`                     | user adds bagels to basket     | Sysout if reched max capacity or if not output baggel added | //Notes Check by array length if the length becomes longer then max capacity
| `int maxCapacity`                  | `boolean incrementCapacity(int amount, String name)` | Bob wants to grow his capacity | return true if incremented and sysout that it got higher    |


## Domain model 
