package ioStreams;

import java.io.*;
import java.util.*;

public class Ques1_io {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the file name : ");
        String fileName = sc.nextLine();

        System.out.println("Enter the character to be counted");
        char targetChar = sc.nextLine().toLowerCase().charAt(0); 

        int count = 0;

        try {
            File file = new File(fileName);
            Scanner fileScanner = new Scanner(file);

            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine().toLowerCase(); 
                for (int i = 0; i < line.length(); i++) {
                    if (line.charAt(i) == targetChar) {
                        count++;
                    }
                }
            }

            System.out.println("File '" + fileName + "' has " + count + 
                               " instances of letter '" + targetChar + "'.");
            fileScanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        }

        sc.close();
    }
}
