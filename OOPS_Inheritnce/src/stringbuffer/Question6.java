package stringbuffer;

import java.util.Scanner;

public class Question6 {
    public static String combineShortLongShort(String a, String b) {
        
        if (a.length() < b.length()) {
            return a + b + a;
        } else {
            return b + a + b;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

      
        String result = combineShortLongShort(str1, str2);
        System.out.println("Result: " + result);

        scanner.close();
    }
}

