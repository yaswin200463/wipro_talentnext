package stringbuffer;

import java.util.Scanner;

public class Question8 {
    public static String removeStarAndAdjacentChars(String str) {
        StringBuilder result = new StringBuilder();

        int n = str.length();

        for (int i = 0; i < n; i++) {
            
            if (str.charAt(i) == '*') {
                continue;
            }

           
            if (i > 0 && str.charAt(i - 1) == '*') {
                continue;
            }

           
            if (i < n - 1 && str.charAt(i + 1) == '*') {
                continue;
            }

          
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

 
        System.out.print("Enter a string (with '*'): ");
        String input = scanner.nextLine();


        String output = removeStarAndAdjacentChars(input);
        System.out.println("Result: " + output);

        scanner.close();
    }
}
