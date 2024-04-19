package com.java2.day10;

//Requirements: 1. Create a `Product` class with attributes: `productId`, `productName`, `price`, and `quantity`.
public class Product {
    private String productID;
    private String productName;
    private double price;
    private int quantity;

    //no argument constructor
    public Product(){

    }
    public Product(int quantity){
        this.quantity=quantity;
    }
    //parameterised constructor
    public Product(String productId, String productName, double price, int quantity) {
        this.productID = productId;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }




    //generate setter and getter methods
    public String getProductID() {

        return productID;
    }

    public void setProductID(String productID) {

        this.productID = productID;
    }

    public String getProductName() {

        return productName;
    }

    public void setProductName(String productName) {

        this.productName = productName;
    }

    public double getPrice() {

        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {

        return quantity;
    }

    public void setQuantity(int quantity) {

        this.quantity = quantity;
    }



}
