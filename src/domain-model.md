package com.boolean;


| Clasess | Members                         | Methods                                   | Scenario                | Output             |
|---------|---------------------------------|-------------------------------------------|-------------------------|--------------------|
| Basket  | HashMap<String, Integer> bagels | add(String bagel)                         | Can add to list         | return true        |
|         |                                 |                                           |                         |                    |


| Clasess | Members                         | Methods              | Scenario         | Output       |
|---------|---------------------------------|----------------------|------------------|--------------|
| Basket  | HashMap<String, Integer> bagels | remove(String bagel) | Can add to list  | return true  |
|         |                                 |                      | Cant add to list | return false |


| Clasess | Members                         | Methods             | Scenario | Output       |
|---------|---------------------------------|---------------------|----------|--------------|
| Basket  | HashMap<String, Integer> bagels | isFull(int howMany) | Not full | return true  |
|         | int howMany                     |                     | Full     | return false |


| Clasess | Members     | Methods                     | Scenario                         | Output  |
|---------|-------------|-----------------------------|----------------------------------|---------|
| Basket  | int howMany | capacitySetter(int howMany) | Changed how many bagels capacity | changed |
|         |             |                             |                                  |         |


| Clasess | Members                         | Methods              | Scenario                  | Output       |
|---------|---------------------------------|----------------------|---------------------------|--------------|
| Basket  | HashMap<String, Integer> bagels | remove(String bagel) | Is existing can remove    | return true  |
|         |                                 |                      | Not existing can't remove<br/> | return false |