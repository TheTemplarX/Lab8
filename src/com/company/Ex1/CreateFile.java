package com.company;
import java.io.File;
import java.io.IOException;

public class CreateFile {

    public static void main(String[] args) {
        try {
            File myObj = new File("myfile.txt");
            if(myObj.createNewFile())
                System.out.println("File created: " + myObj.getName());
            else
                System.out.println("A file named '" + myObj.getName() + "' already exists");
        } catch(IOException error){
            System.out.println("An error occurred");
            error.printStackTrace();
        }
    }
}
