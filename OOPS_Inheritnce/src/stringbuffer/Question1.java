package stringbuffer;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

       
        String normalized = input.replaceAll("\\s+", "").toLowerCase();

       
        boolean isPalindrome = true;
        int len = normalized.length();
        for (int i = 0; i < len / 2; i++) {
            if (normalized.charAt(i) != normalized.charAt(len - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

     
        if (isPalindrome) {
            System.out.println("The string \"" + input + "\" is a palindrome.");
        } else {
            System.out.println("The string \"" + input + "\" is not a palindrome.");
        }

        scanner.close();
    }
}

