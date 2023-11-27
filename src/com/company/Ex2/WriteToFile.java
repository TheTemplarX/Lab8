package com.company.Ex2;

import java.io.*;
import java.lang.String;


public class WriteToFile {
    public static void main(String[] args) {
        try {
            File myObj = new File("myfile.txt");
            String str = "Propozitia mea este aceasta";
            BufferedWriter write = new BufferedWriter(new FileWriter(myObj.getName(), true));
            BufferedReader read = new BufferedReader(new FileReader(myObj.getName()));
            if(myObj.createNewFile())
                System.out.println("File created: " + myObj.getName());
            else {
                System.out.println("A file named '" + myObj.getName() + "' already exists");
            }
            write.append(' ');
            write.append(str);
            write.close();
        } catch(IOException error){
            System.out.println("An error occurred");
            error.printStackTrace();
        }
    }
}