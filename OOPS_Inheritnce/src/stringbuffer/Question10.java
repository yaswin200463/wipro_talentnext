package stringbuffer;

import java.util.Scanner;

public class Question10 {
    public static String repeatLastNChars(String str, int n) {
        
        String lastN = str.substring(str.length() - n);

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(lastN);
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

    
        System.out.print("Enter an integer n: ");
        int n = scanner.nextInt();

      
        if (n < 0 || n > input.length()) {
            System.out.println("Invalid input: n must be between 0 and the length of the string.");
        } else {
         
            String result = repeatLastNChars(input, n);
            System.out.println("Output: " + result);
        }

        scanner.close();
    }
}

