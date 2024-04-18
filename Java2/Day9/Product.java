package com.java2.day9;

//information of Product
public class Product {

    private String productId;
    private String productName;
    private String productDescription;
    private String productManufacturer;
    private int productWarrantyPeriodInMonths;

    //constructor
    //no argument constructor
    public Product(){

    }

    //Parameterised Constructor
    public Product(String productId, String productName, String productDescription, String productManufacture, int productWarrantyPeriodInMonths){
        this.productId = productId;
        this.productName = productName;
        this.productDescription = productDescription;
        this.productManufacturer = productManufacture;
        this.productWarrantyPeriodInMonths = productWarrantyPeriodInMonths;
    }


    //getter and setter methods
    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductDescription() {
        return productDescription;
    }

    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }

    public String getProductManufacturer() {
        return productManufacturer;
    }

    public void setProductManufacturer(String productManufacture) {
        this.productManufacturer = productManufacture;
    }

    public int getProductWarrantyPeriodInMonths() {
        return productWarrantyPeriodInMonths;
    }

    public void setProductWarrantyPeriodInMonths(int productWarrantyPeriodInMonths) {
        this.productWarrantyPeriodInMonths = productWarrantyPeriodInMonths;
    }
}
