package com.java2.day10;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Cart {
    private ArrayList<Product> cartItems;

    //no argument constructor
    public Cart(){

        this.cartItems = new ArrayList<>();
    }

    //add a product to the cart
    public void addToCart(Product product){
        cartItems.add(product);
        System.out.println(product.getProductName()+" -------product added to the cart");
    }

    //remove a product from the cart
    public void removeFromCart(String name){

        boolean removed = false;
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).equals(name)) {
                cartItems.remove(i);
                removed = true;
                break; // Exit the loop after removing the object
            }
        }

        // Print the updated list
        if (removed) {
            System.out.println("Object removed successfully.");
        } else {
            System.out.println("Object not found in the list.");
        }
    }

    //updates the quantity of a product in the cart
    public void updateQuantity(ArrayList<Product>  product, int quantity, String name){

        for (Product p : cartItems) {
            if (p.getProductName().equalsIgnoreCase(name)) {
               p.setQuantity(quantity);
                System.out.println("Quantity updated for " + p.getProductName() + ".");
                return;
            }
        }
        System.out.println("Product not found in cart.");
    }

    //display the products in the cart
    public void viewCart(){
        if (cartItems.isEmpty()){
            System.out.println("OOPS!!!! ..... Cart is Empty!!!!");
        }else{
            System.out.println("Displaying all products in the cart. Please check it.");
            for(Product p : cartItems){
                System.out.println("Product ID : "+p.getProductID() + "     " +
                        "Product Name : "+  p.getProductName()+ "      "+
                        "Product Price : "+ p.getPrice()+"     "+
                        "Product Quantity : "+ p.getQuantity());
            }
        }
    }

    //Proceeds to the checkout process
    public void checkoutCart(){
        double total = 0;
        System.out.println("Order summary:");
        for (Product product : cartItems) {
            double subtotal = product.getPrice() * product.getQuantity();
            System.out.println("- " + product.getProductName() + ": £ " + product.getPrice() + " x " + product.getQuantity() + " = £ " + subtotal);
            total += subtotal;
        }
        System.out.println("Total: £" + total);
        System.out.println("Proceeding to checkout...");

        /*
        //Clear the cart after checkout
        cartItems.clear();*/
    }

}
