package com.codegym.model;

public class Product {
    private int id;
    private String productName;
    private String productType;
    private double price;

    public Product() {

    }

    public Product(int id, String productName, String productType, double price) {
        this.id = id;
        this.productName = productName;
        this.productType = productType;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
