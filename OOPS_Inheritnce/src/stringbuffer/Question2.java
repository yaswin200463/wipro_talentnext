package stringbuffer;

import java.util.Scanner;

public class Question2 {
    public static String concatenateAndFormat(String str1, String str2) {
       
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

       
        if (str1.charAt(str1.length() - 1) == str2.charAt(0)) {
            
            str2 = str2.substring(1);
        }

        
        return str1 + str2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first string: ");
        String s1 = sc.nextLine();

        System.out.print("Enter second string: ");
        String s2 = sc.nextLine();

      
        String result = concatenateAndFormat(s1, s2);

       
        System.out.println("Concatenated result: " + result);

        sc.close();
    }
}
