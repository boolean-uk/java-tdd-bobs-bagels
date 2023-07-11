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

| Class  | Fields               | Methods                              | Scenario                                                               | Output               |
|--------|----------------------|--------------------------------------|------------------------------------------------------------------------|----------------------|
| Basket | List\<String> bagels | void add(String bagel)               | If customer wants to add a specific type of bagel to his basket        |                      |
|        | List\<String> bagels | void remove(String bagel)            | If customer wants to remove a bagel from his basket.                   |                      |
|        | int capacity         | boolean isFull()                     | Called when customer adds a bagel to his basket.                       |                      |
|        |                      |                                      | If number of bagels equals basket capacity                             | true                 |
|        |                      |                                      | If number of bagels is less than basket capacity                       | false                |
|        | int capacity         | void setCapacity(int newCapacity)    | If manager would like to change the capacity of baskets.               |                      |
|        |                      |                                      | If new capacity is less than number of bagels in basket                | Output error message |
|        |                      |                                      | If new capacity is greater than or equal to number of bagels in basket | Output nothing       |
|        | List\<String> bagels | boolean doesBagelExist(String bagel) | Called when customer tries to remove a bagel from his basket           |                      |
|        |                      |                                      | If bagel exists in the basket                                          | true                 |
|        |                      |                                      | If bagel does not exist in the basket                                  | false                |

## Our extensions

```
1.
As a member of the public,
So when I lose my appetite,
I'd like to empty my basket.

2. 
As a member of the public,
So when I'm really hungry,
I'd like to know how many bagels I can buy.

3.
As a member of the public,
So I can afford a bagel,
I'd like to know how much it costs.

4.
As a Bob's Bagels manager,
So that I can make more money,
I’d like to change the price of bagels. 

5. 
As a member of the public,
So when I come to checkout,
I'd like to know how much I'll pay.

6. 
As a Bob's Bagels manager,
So I can attract more customers,
I’d like to offer a discount. 


```

| Class  | Fields                                       | Methods                             | Scenario                                             | Output                            |
|--------|----------------------------------------------|-------------------------------------|------------------------------------------------------|-----------------------------------|
| Basket | List\<String> bagels                         | void empty()                        | If customer wants to empty his basket                |                                   |
|        | List\<String> bagels <br/> int capacity      | int getAvailableCapacity()          | If customer wants to know how many bagels he can buy | The available capacity            |
|        | double bagelPrice                            | double checkPrice()                 | If customer wants to know how much a bagel costs     | The price of a single bagel       |
|        | double bagelPrice                            | void setPrice(double newBagelPrice) | If manager wants to change the price of bagels       |                                   |
|        | double bagelPrice  <br/>List\<String> bagels | double getTotalPrice()              | If customer wants to know how much he'll pay         | The price of bagels in the basket |
|        | double bagelPrice                            | double offerDiscount(int discount)  | If manager wants to offer a discount.                | The price after discount          |
