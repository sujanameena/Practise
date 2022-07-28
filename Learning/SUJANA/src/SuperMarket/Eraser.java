package SuperMarket;

public class Eraser {
    int price;
    int stock;

    public Eraser(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public void buy(int NumberOfItems) {
        stock = stock - NumberOfItems;
    }
}
