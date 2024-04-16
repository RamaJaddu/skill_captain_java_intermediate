package com.java2.day8;
/*
Assignments:

Create a Java program that simulates user registration for an e-commerce application.
The program should allow users to enter their name, email address, password and shipping address.
The program should store the user data in an in-memory data structure, such as an ArrayList or HashMap.
The program should also validate user input to ensure that all required fields are entered and
that the email address is in a valid format.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class USerRegistration {

    public static void main(String[] args) {

        UserRepository r= new UserRepository();

        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the e-commerce application!");
            System.out.println("Please enter your details to register:");


            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            System.out.print("Enter Email Address: ");
            String email = sc.nextLine();

            System.out.print("Enter Password : ");
            String password = sc.nextLine();

            System.out.print("Enter Address: ");
            String address = sc.nextLine();

            System.out.print("Enter Shipping Address: ");
            String shippingAddress = sc.nextLine();

            // Validate user input values
            if (name.isEmpty() || email.isEmpty() || password.isEmpty() || address.isEmpty()) {
                System.out.println("All fields are required. Please try again.");


            } else if (r.isGetUserEmailExists(email)) {
                System.out.println("Email address is already registered. Please try again with a different email.");

            } else if (!isValidEmail(email)) {
                System.out.println("Invalid email address format. Please try again.");

            } else {
                // Create a User object and register it in the UserRepository

                User user = new User(name, email, password, address, shippingAddress);

                //adding all users
                r.addUser(user);

                System.out.println("User registration successful!");

                System.out.print("Do you want to register another user? (yes/no): ");
                String choice = sc.nextLine().toLowerCase();
                if (!choice.equals("yes")) {
                    break;
                }

            }

        }
            sc.close();
        System.out.println("Registered Users:");
        //retrieve all users
        r.allUsers();


        }



        // isValidEmail() method to validate email address
        private static boolean isValidEmail (String email){
            String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
            Pattern pattern = Pattern.compile(emailRegex);
            Matcher matcher = pattern.matcher(email);
            return matcher.matches();
        }



}
