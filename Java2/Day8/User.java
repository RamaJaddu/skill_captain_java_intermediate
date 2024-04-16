package com.java2.day8;

public class User {
private String name;
private String emailAddress;
private String password;
private String address;
private String shippingAddress;

    //Constructor

    public User(){}
    public User(String name, String email, String password, String address, String shippingAddress){
        this.name = name;
        this.emailAddress = email;
        this.password = password;
        this.address = address;
        this.shippingAddress = shippingAddress;
    }

    //getter and setter methods
    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmailAddress() {

        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {

        this.emailAddress = emailAddress;
    }

    public String getPassword() {

        return password;
    }

    public void setPassword(String password) {

        this.password = password;
    }

    public String getAddress() {

        return address;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public String getShippingAddress() {

        return shippingAddress;
    }

    public void setShippingAddress(String shippingAddress) {

        this.shippingAddress = shippingAddress;
    }

    public void display(){
        System.out.println(this.getName());
        System.out.println(this.getEmailAddress());
        System.out.println(this.getAddress());
        System.out.println(this.getShippingAddress());
    }
}




