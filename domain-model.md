# Domain model

## User stories
### User story 1
```
As a member of the public,
So I can order a bagel before work,
I'd like to add a specific type of bagel to my basket.
```

### User story 2
```
As a member of the public,
So I can change my order,
I'd like to remove a bagel from my basket.
```

### User story 3
```
As a member of the public,
So that I can not overfill my small bagel basket
I'd like to know when my basket is full when I try adding an item beyond my basket capacity.
```

### User story 4
```
As a Bob's Bagels manager,
So that I can expand my business,
I’d like to change the capacity of baskets.
```

### User story 5
```
As a member of the public
So that I can maintain my sanity
I'd like to know if I try to remove an item that doesn't exist in my basket.
```


## Shopping Basket Class

### Variables 
| Variables                | Description                                                          |
|--------------------------|----------------------------------------------------------------------|
| List<Bagel bagel> basket | Container containing the bagels the customer has added to basket.    | 
| Integer basketSize       | Size of the basket.                                                  |

### Methods
| Methods                                               | Scenario                                                         | Outputs                                   |
|-------------------------------------------------------|------------------------------------------------------------------|-------------------------------------------|
| `String addBagel(String bagle)`                       | Customer successfully adds bagel to basket                       | `Bagel added successfully.`               |
|                                                       | Customer fails to add bagel to basket as basket is full          | `Basket is full.`                         |
| `String removeBagel(String bagle)`                    | Customer successfully removes bagel from basket                  | `Bagel successfully removed from basket.` |
|                                                       | Customer tries to remove bagel not in the basket from the basket | `This bagel is not in your basket.`       |
| `Boolean changeBasketCapacity(int newCapacity)`       | Manager successfully changes the capacity of the basket          | Return trueg                              |
|                                                       | Manager fails in changing the capacity of the basket             | Return false                              |

