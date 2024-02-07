package model;

public class Smartwatch {
    private int id;
    private String name;
    private double price;
    private double discountRate;
    private int discountMin;
    public Smartwatch(int id, String name, double price, double discountRate, int discountMin) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.discountRate = discountRate;
        this.discountMin = discountMin;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getDiscountRate() {
        return discountRate;
    }
    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }
    public int getDiscountMin() {
        return discountMin;
    }
    public void setDiscountMin(int discountMin) {
        this.discountMin = discountMin;
    }
}
