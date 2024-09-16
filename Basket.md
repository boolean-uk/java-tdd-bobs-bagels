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

## Domain Model

| Class    | Method                       | Description                                                     | Output   |
|----------|------------------------------|-----------------------------------------------------------------|----------|
| `Basket` | `basket ()  `                | constructor: initialises the BagelList Arraylist                | void     |
|          | `add (String type)`          | Adds the bagel type, if it doesn't exist in the Arraylist       | true     |
|          |                              | Doesn't add the bagel, if it already exist in the Arraylist     | false    |
|          | `remove (String type)`       | Removes the bagel type from the Arraylist, if it already exists | true     |
|          |                              | Has no effect on the Arraylist, if the bagel type doesn't exist | false    |
|          | `checkIfFull (int capacity)` | If basket size is greater than the given capacity               | true     |
|          |                              | If basket size is less than the given capacity                  | false    |
|          | `setCapacity (int capacity)` | Sets the basket's capacity if an integer is passed              | true     |
|          |                              | If another type is passed                                       | false    |
