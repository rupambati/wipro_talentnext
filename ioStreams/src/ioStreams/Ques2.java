package ioStreams;

import java.io.*;
import java.util.*;

public class Ques2 {
    public static void main(String[] args) {
      
        if (args.length != 2) {
            System.out.println("Usage: java FileWordCount inputFile.txt outputFile.txt");
            return;
        }

        String inputFile = args[0];   
        String outputFile = args[1];  

        try {
           
            TreeMap<String, Integer> wordCount = new TreeMap<>();

            BufferedReader br = new BufferedReader(new FileReader(inputFile));
            String line;

            while ((line = br.readLine()) != null) {
              
                String[] words = line.split(" ");

                for (String word : words) {
                    if (!word.equals("")) {
                        if (wordCount.containsKey(word)) {
                            wordCount.put(word, wordCount.get(word) + 1);
                        } else {
                            wordCount.put(word, 1);
                        }
                    }
                }
            }

            br.close(); 
            BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile));

            for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
                bw.write(entry.getKey() + " : " + entry.getValue());
                bw.newLine();
            }

            bw.close();  

            System.out.println("Word count written to " + outputFile);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
