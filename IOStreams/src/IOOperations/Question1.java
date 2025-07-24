package IOOperations;

import java.io.*;
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get file name from user
        System.out.print("Enter the file name: ");
        String fileName = scanner.nextLine();

        // Get character to be counted
        System.out.print("Enter the character to be counted: ");
        char targetChar = scanner.nextLine().toLowerCase().charAt(0);

        int count = 0;

        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            int ch;
            while ((ch = br.read()) != -1) {
                // Convert to lowercase and check
                if (Character.toLowerCase((char) ch) == targetChar) {
                    count++;
                }
            }

            System.out.println("File '" + fileName + "' has " + count +
                               " instances of letter '" + targetChar + "'.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + fileName);
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}
