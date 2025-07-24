package stringbuffer;

import java.util.Scanner;

public class Question4 {
    public static String getFirstHalf(String str) {
        
        if (str.length() % 2 == 0) {
            return str.substring(0, str.length() / 2);
        } else {
            return null;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

    
        String result = getFirstHalf(input);
        if (result != null) {
            System.out.println("First half: " + result);
        } else {
            System.out.println("Output: null");
        }

        scanner.close();
    }
}

