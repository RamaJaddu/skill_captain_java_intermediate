package com.java2.day9;

import java.util.Scanner;

public class ValidationOnRegistration {
    public static void main(String[] args) {
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
                System.out.print("Invalid input. Please enter a number.");
                scanner.next(); // Clear invalid input
            }
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    system.registerProducts();
                    break;
                case 2:
                    system.displayAllProducts();
                    break;
                case 3:
                    System.out.print("Enter product ID:");
                    String productId = scanner.nextLine();
                    system.searchProductByID(productId);
                    break;
                case 4:
                    system.totalProductsRegisteredByWarrantyStatus();
                    break;
                case 0:
                    System.out.print("Exiting...");
                    break;
                default:
                    System.out.print("Invalid choice. Please enter a valid option.");
            }
        } while (choice != 0);

        scanner.close();
    }

    }

