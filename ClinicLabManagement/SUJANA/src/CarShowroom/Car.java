package CarShowroom;

public class Car {
    String colour;
    String name;
    int price;
    int stock;

    public Car(String colour, String name, int price) {
        this.colour = colour;
        this.name = name;
        this.price = price;
        this.stock = 4;
    }

    public void buy(int NumberOfItems) {
        stock = stock - NumberOfItems;
    }
}
