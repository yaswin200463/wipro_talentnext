package IOOperations;

import java.io.*;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input file name
        System.out.print("Enter the input file name ");
        String inputFileName = scanner.nextLine().trim();

        // Output file name
        System.out.print("Enter the output file name ");
        String outputFileName = scanner.nextLine().trim();

        // Copy operation
        try (
            FileReader fr = new FileReader(inputFileName);
            FileWriter fw = new FileWriter(outputFileName)
        ) {
            int ch;
            while ((ch = fr.read()) != -1) {
                fw.write(ch);
            }

            System.out.println("File is copied.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + inputFileName);
        } catch (IOException e) {
            System.out.println("An error occurred during file copy.");
        }
    }
}
