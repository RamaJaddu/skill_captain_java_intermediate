package com.java2.day6;

/*
Assignments:

        **Problem Statement: Word Count**

You are given a text file named "input.txt" that contains a collection of sentences.
Your task is to write a program in Java that reads the contents of the file and counts
the number of occurrences of the word "Java". The program should then print the total count to the console.

**Example Input (input.txt):**


Java is a popular programming language used for developing a wide range of applications.
It is known for its simplicity and versatility. Many developers enjoy working with Java. However,
learning Java requires practice and dedication. With enough effort, anyone can become proficient in Java.

*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {

    private static String filePath="C:\\Users\\jv_ra\\IdeaProjects\\Harsh_Fundamentals\\Input.txt";

    static int totalCount;

    public static void searchWord(String filePath,String specialWord) {

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String content;

            while ((content = reader.readLine()) != null) {

                String[] words= content.split("\\s" );
                for (String word : words){
                    if(word.equalsIgnoreCase(specialWord)){
                        totalCount++;
                    }
                }

            }
        } catch (IOException e) {
           //e.printStackTrace();
            System.out.println("Error reading the file : " + e.getMessage());
        }
        System.out.println("Total occurancies of searching word --- "+specialWord+ " ---- "+ " is " + totalCount + " in the file. " );
    }

    public static void main(String[] args) {
        searchWord(filePath,"Java");
    }


}
