package com.java2.day7;

/*Write a Java program that prompts the user to enter a sentence,
and then writes that sentence to a file named "output.txt" in the project directory.*/


import java.io.*;
import java.util.Scanner;

public class WriteFile {
    private static String sentance;

    //private static String fileName  = "fileWriter.txt";
    private static String path= "src/main/java/com/java2/day7/fileWriter.txt";
            //"C:\\Users\\jv_ra\\IdeaProjects\\Harsh_Fundamentals\\src\\main\\java\\com\\java2\\day7\\fileWrite.txt";

    //Take the input from the user
    static String  promptUser() {
        System.out.println("Enter a sentence: ");
        Scanner sc = new Scanner(System.in);
        sentance = sc.nextLine();
        System.out.println(sentance);
        //
        sc.close();
        return sentance;
    }

    static void fileWriter(String sentence, String path) {

        try{
            // There are 2 approaches to create a file

            //Approach 1
            File f = new File(path);
            if (f.exists()) {
                System.out.println("File is created successfully!!!!!");
                System.out.println("File Name : "+ f.getName());
                System.out.println("Absolute Path oa this file : "+ f.getAbsolutePath());
                System.out.println("Writable : "+ f.canWrite());
                System.out.println("Readable : "+ f.canRead());
                System.out.println("File size in bytes : "+f.length());

            }else {
                System.out.println("File does not exist....");
            }


            FileWriter fw = new FileWriter(f);
            PrintWriter pw= new PrintWriter(fw);
            pw.println(sentence);
            pw.close();

        }catch(IOException e) {
            e.printStackTrace();
            System.out.println("Error is Occured");
        }

         /*try{
        //Approach 2
        // Create a file by using BufferedWriter
        BufferedWriter createFile = new BufferedWriter(new FileWriter(path));
        createFile.write(sentence);

        createFile.close();
        System.out.println("Created a file successfully!!!!");

    }catch (IOException e) {
        System.out.println("While creating a file error is coming.....");
        e.printStackTrace();


        */


    }

    public static void main(String[] args)  {

        promptUser();
        fileWriter(sentance, path);

        }



    }





