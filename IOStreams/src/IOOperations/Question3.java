package IOOperations;

import java.io.*;
import java.util.*;

public class Question3 {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: java FileWordCount <inputFile> <outputFile>");
            return;
        }

        String inputFile = args[0];
        String outputFile = args[1];

        // TreeMap to store words in sorted order
        Map<String, Integer> wordCountMap = new TreeMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(inputFile))) {
            String line;

            while ((line = br.readLine()) != null) {
                // Split line into words using space or punctuation
                String[] words = line.split("\\s+");

                for (String word : words) {
                    if (!word.isEmpty()) {
                        word = word.trim();
                        // Remove punctuation and normalize (optional)
                        word = word.replaceAll("[^a-zA-Z]", "");
                        if (!word.isEmpty()) {
                            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                        }
                    }
                }
            }

            // Write to output file
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(outputFile))) {
                for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
                    bw.write(entry.getKey() + " : " + entry.getValue());
                    bw.newLine();
                }
            }

            System.out.println("Word counts written to " + outputFile);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
