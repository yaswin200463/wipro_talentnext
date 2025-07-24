package stringbuffer;

import java.util.Scanner;

public class Question9 {
    public static String mixStrings(String a, String b) {
        StringBuilder result = new StringBuilder();

        int lenA = a.length();
        int lenB = b.length();
        int maxLength = Math.max(lenA, lenB);

        
        for (int i = 0; i < maxLength; i++) {
            if (i < lenA) {
                result.append(a.charAt(i));
            }
            if (i < lenB) {
                result.append(b.charAt(i));
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String str2 = scanner.nextLine();

  
        String result = mixStrings(str1, str2);
        System.out.println("Mixed string: " + result);

        scanner.close();
    }
}

