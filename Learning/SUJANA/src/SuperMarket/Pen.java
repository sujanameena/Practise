package SuperMarket;

public class Pen {
    int price;
    int stock;

    public Pen(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public void buy(int NumberOfItems) {
        stock = stock - NumberOfItems;
    }
}
