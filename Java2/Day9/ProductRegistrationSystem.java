package com.java2.day9;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class ProductRegistrationSystem {

    private HashMap<String, Product> products;

    //constructor
    public ProductRegistrationSystem(){

        this.products= new HashMap<>();
    }

   /* public static void main(String[] args) {
        ProductRegistrationSystem system = new ProductRegistrationSystem();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nProduct Registration System Menu:");
            System.out.println("1. Register a product");
            System.out.println("2. Display all products");
            System.out.println("3. Search for a product by ID");
            System.out.println("4. Generate report");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            while (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    system.registerProduct();
                    break;
                case 2:
                    system.displayAllProducts();
                    break;
                case 3:
                    System.out.println("Enter product ID:");
                    String productId = scanner.nextLine();
                    system.searchProductById(productId);
                    break;
                case 4:
                    system.generateReport();
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }
    }
    */


    //register product or products
    public void registerProducts(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter product ID:");
        String productId = scanner.nextLine();

        // Validate if productId already exists
        if (products.containsKey(productId)) {
            System.out.println("Product ID already exists. Please choose a different one.");
            return;
        }

        Product product = new Product();
        product.setProductId(productId);

        System.out.print("Enter product name:");
        product.setProductName(scanner.nextLine());

        System.out.print("Enter description:");
        product.setProductDescription(scanner.nextLine());

        System.out.print("Enter manufacturer:");
        product.setProductManufacturer(scanner.nextLine());

        System.out.print("Enter warranty period (in months):");
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter a valid integer for warranty period.");
            scanner.next(); // Clear invalid input
        }
        product.setProductWarrantyPeriodInMonths(scanner.nextInt());

        products.put(productId, product);
        System.out.println("Product registered successfully.");
    }

    //display all products
    public void displayAllProducts(){
        if (products.isEmpty()) {
            System.out.println("No products registered yet.");
        } else {
            System.out.println("List of registered products:");
            for (Product product : products.values()) {
                System.out.println(product.getProductId() + ": " + product.getProductName());
            }
        }

    }

    //search the product by id
    public void searchProductByID(String productId){
        if (products.containsKey(productId)) {
            Product product = products.get(productId);
            System.out.println("Product details:");
            System.out.println("ID: " + product.getProductId());
            System.out.println("Name: " + product.getProductName());
            System.out.println("Description: " + product.getProductDescription());
            System.out.println("Manufacturer: " + product.getProductManufacturer());
            System.out.println("Warranty Period: " + product.getProductWarrantyPeriodInMonths() + " months");
        } else {
            System.out.println("Product with ID " + productId + " not found.");
        }

    }

    //generate a report showing the count of products registered and their warranty status (expired or active)
    public void totalProductsRegisteredByWarrantyStatus(){
        int totalCount = products.size();
        int expiredCount = 0;

        for (Product product : products.values()) {
            if (product.getProductWarrantyPeriodInMonths() <= 0) {
                expiredCount++;
            }
        }

        int activeCount = totalCount - expiredCount;

        System.out.println("Total registered products: " + totalCount);
        System.out.println("Active warranty products: " + activeCount);
        System.out.println("Expired warranty products: " + expiredCount);

    }
}
