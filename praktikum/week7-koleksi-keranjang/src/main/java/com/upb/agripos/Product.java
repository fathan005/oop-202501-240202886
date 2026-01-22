package main.java.com.upb.agripos;

public class Product {
    private final String code;
    private final String name;
    private final double price;

    public Product(String code, String name, double price) {

    }

    public String getCode() { return code; }
    public String getName() { return name; }
    public double getPrice() { return price; }

    public int getStock() {
    }

    public void reduceStock(Integer value) {
    }
}
