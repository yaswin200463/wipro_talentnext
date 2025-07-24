package stringbuffer;

import java.util.Scanner;

public class Question5 {
    public static String removeFirstAndLastChar(String str) {
      
        if (str.length() <= 2) {
            return ""; 
        }

        
        return str.substring(1, str.length() - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

     
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

      
        String result = removeFirstAndLastChar(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
