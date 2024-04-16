package com.java2.day8;

import java.util.ArrayList;

public class UserRepository {
    private ArrayList<User> users;

    //stores the user data in an in-memory data structure
   public UserRepository(){

       users= new ArrayList<>();
    }

    //Adds a user to the repository
    public void addUser(User user){

       users.add(user);
    }

    //Retrieves a user from the repository by email address
    public boolean isGetUserEmailExists(String email){
       for(User user : users){
           if(user.getEmailAddress().equalsIgnoreCase(email)){
               System.out.println("This email address is already exists......");
               return true;
           }
       }
        return false;
    }

    //Retrieves all users from the repository
    public void  allUsers(){

       for (User u : users){
           System.out.println("Name: "+u.getName()+" EmailAddress: "+u.getEmailAddress()+
                   " Address: "+ u.getAddress()+" Shipping Address: "+u.getShippingAddress());

       }

    }


}
