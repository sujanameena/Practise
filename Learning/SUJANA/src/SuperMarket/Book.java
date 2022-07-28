package SuperMarket;

public class Book {
    int price;
    int stock;

    public Book(int price, int stock) {
        this.price = price;
        this.stock = stock;
    }

    public void buy(int NumberOfItems) {
        stock = stock - NumberOfItems;
    }
}