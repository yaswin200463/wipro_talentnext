package stringbuffer;

import java.util.Scanner;

public class Question7 {
    public static String removeXAtEdges(String str) {
        int len = str.length();

        
        if (len == 0) return str;
        if (len == 1 && str.equals("x")) return "";

        
        if (str.startsWith("x")) {
            str = str.substring(1);
        }

       
        if (str.endsWith("x")) {
            str = str.substring(0, str.length() - 1);
        }

        return str;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

      
        String result = removeXAtEdges(input);
        System.out.println("Result: " + result);

        scanner.close();
    }
}
