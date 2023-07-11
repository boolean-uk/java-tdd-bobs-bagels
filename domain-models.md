# Task creator

## Core Requirements
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

```
Additional
As a member of the public
So that I can check the content of my basket
I'd like to see all bagels in my basket.
```

| Classes  | Methods                         | Scenario                                                                                         | Outputs                                     |
|----------|---------------------------------|--------------------------------------------------------------------------------------------------|---------------------------------------------|
| `Basket` | `capacity (integer)`            | The maximum number of items that the basket can hold                                             | The maximum number of items                 |
|          | `items (list)`                  | The list of bagels in the basket                                                                 | The list of bagels                          |
|          | `add_item(item)`                | Adds a bagel item to the basket. Raises an exception if the basket is already full               | Adds a bagel item                           |
|          | `remove_item(item)`             | Removes a bagel item from the basket. Raises an exception if the item is not found in the basket | Removes a bagel item                        |
|          | `get_item_count()`              | Returns the number of items currently in the basket                                              | The number of items currently in the basket |
|          | `is_full()`                     | Returns True if the basket is full, False otherwise                                              | True / False                                |
|          | `change_capacity(new_capacity)` | Changes the capacity of the basket to the specified value                                        | Changed capacity of the basket              |
|          | `containsItem(String)`          |                                                                                                  |                                             |

```



