package model;

public class Watch {
    private int id;
    private String code;
    private String brand;
    private String model;
    private double price;
    private int stock;

    public Watch(int id, String code, String brand, String model, double price, int stock) {
        this.id = id;
        this.code = code;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
    }

    public Watch(String code, String brand, String model, double price, int stock) {
        this.code = code;
        this.brand = brand;
        this.model = model;
        this.price = price;
        this.stock = stock;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }
    public String getCode() {
        return code;
    }
    public String getBrand() {

        return brand;
    }
    public String getModel() {

        return model;
    }
    public double getPrice()
    {
        return price;
    }
    public int getStock() {
        return stock;
    }
}