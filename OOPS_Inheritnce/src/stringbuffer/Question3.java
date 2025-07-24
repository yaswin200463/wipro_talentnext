package stringbuffer;

import java.util.Scanner;

public class Question3 {
    public static String generateRepeatedString(String str) {
        int n = str.length();
        
        
        String firstTwo = str.length() >= 2 ? str.substring(0, 2) : str;

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(firstTwo);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

     
        String output = generateRepeatedString(input);
        System.out.println("Output: " + output);

        scanner.close();
    }
}

