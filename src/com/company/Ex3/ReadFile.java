package com.company.Ex3;

import java.io.*;

public class ReadFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("myfile.txt");
            BufferedReader read = new BufferedReader(new FileReader(myObj.getName()));
            if(myObj.createNewFile())
                System.out.println("File created: " + myObj.getName());
            else {
                System.out.println("A file named '" + myObj.getName() + "' already exists");
            }
            String currentLine = read.readLine();
            System.out.println(currentLine);
            read.close();
        } catch(IOException error){
            System.out.println("An error occurred");
            error.printStackTrace();
        }
    }
}
