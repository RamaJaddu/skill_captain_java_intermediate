package com.java2.day10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Product productItem = new Product();
        ArrayList<Product> productItem = new ArrayList<>();
        Cart cartItem = new Cart();

        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nEnter products into cart menu:");
            System.out.println("1. Add products to the cart");
            System.out.println("2. Remove a product from the cart");
            System.out.println("3. Update the quantity of a product in the cart");
            System.out.println("4. Display the products in the cart");
            System.out.println("5. Proceeds to the checkout process");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.print("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.println("Adding products to the cart:");
                    addProductsToCart(cartItem, scanner);
                    break;

                case 2:
                    System.out.print("Enter product name :");
                    String removeName = scanner.nextLine();

                    cartItem.removeFromCart(removeName);
                    break;

                case 3:
                    System.out.print("Enter product name :");
                    String productName = scanner.nextLine();

                    System.out.print("Enter new quantity: ");
                    int newQuantity = scanner.nextInt();

                   cartItem.updateQuantity(productItem, newQuantity, productName);
                    break;

                case 4:
                    cartItem.viewCart();
                    break;

                case 5:
                    cartItem.checkoutCart();

                case 0:
                    System.out.print("Exiting...");
                    break;
                default:
                    System.out.print("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();

    }
    private static void addProductsToCart(Cart cart, Scanner scanner){
        String addAnother;
        do {
            System.out.print("Enter product ID: ");
            String productId = scanner.nextLine();

            System.out.print("Enter product name: ");
            String productName = scanner.nextLine();

            System.out.print("Enter product price: ");
            double price = scanner.nextDouble();

            System.out.print("Enter product quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            Product product = new Product(productId, productName, price, quantity);
            cart.addToCart(product);

            System.out.print("Add another product? (yes/no): ");
            addAnother = scanner.nextLine().toLowerCase();
        } while (addAnother.equals("yes"));

    }


}
