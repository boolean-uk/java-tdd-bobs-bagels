# Domain Model

```java
@RequiredArgsConstructor
@Getter
public enum Bagel {
    Plain("plain", 2.5),
    WithSesame("sesame", 3.),
    WithPoppy("poppy", 3.5);

    private final String type;
    private final double price;
}
```

```java
public class Basket {
    private Bagel[] bagels;

    public Basket(int capacity) {
        bagels = new Bagel[capacity];
    }

    public void addBagel(Bagel bagel) {
        // If there is remaining space in basket - add bagel
        // If there is no remaining space in basket - throw exception
    }

    public void removeBagel(Bagel bagel) {
        // If bagel exists - remove bagel
        // If bagel does not exist - throw an exception
    }

    public void resize(int capacity) {
        // If amount of items in the basket is less than new capacity - resize
        // If amount of items in the basket is more than new capacity - throw exception
    }
}
```