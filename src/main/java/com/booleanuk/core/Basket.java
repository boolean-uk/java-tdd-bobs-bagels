package com.booleanuk.core;

public class Basket {

}

/*

| Class  | Members           | Methods                            | Scenario               | Output/Results             |
|--------|-------------------|------------------------------------|------------------------|----------------------------|
| Basket | ArrayList<String> | String addBagel(String bagel)      | Adds a bagel into the  | String (bagel +" has been  |
|        | bagelBasket       |                                    | bagel basket list      | added to you basket")      |
|        |                   | String removeBagel(String bagel)   | Removes a bagel        | String (bagel+" has been   |
|        |                   |                                    | from the basket list   | removed from your basket") |
|        |                   | boolean basketIsFull(String bagel) | Tries to add a bagel   | if full return true        |
|        |                   |                                    | but the basket is full | else return false          |
|        |                   |                                    |                        |                            |
|        |                   | ArrayList<String> changeCapacity() | Lets the manager       | return the new bagelBasket |
|        |                   |                                    | change basket capacity | capacity                   |
|        |                   | boolean itemDoesntExist(String     | Checks if the item     | if exist return true       |
|        |                   | bagel)                             | removed exists         | else return false          |

 */