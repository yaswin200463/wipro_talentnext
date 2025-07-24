package stringjoiner;

import java.util.Scanner;
import java.util.StringJoiner;

public class Question2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        StringJoiner s1 = new StringJoiner("-");
        StringJoiner s2 = new StringJoiner("-");

       
        System.out.print("Enter number of cities for s1: ");
        int n1 = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n1; i++) {
            System.out.print("Enter city " + (i + 1) + " for s1: ");
            s1.add(scanner.nextLine());
        }

     
        System.out.print("Enter number of cities for s2: ");
        int n2 = scanner.nextInt();
        scanner.nextLine(); 
        for (int i = 0; i < n2; i++) {
            System.out.print("Enter city " + (i + 1) + " for s2: ");
            s2.add(scanner.nextLine());
        }

      
        StringJoiner s1IntoS2 = new StringJoiner("-");
        s1IntoS2.merge(s2);
        s1IntoS2.merge(s1);
        System.out.println("\ni) s1 merged into s2: " + s1IntoS2);

     
        StringJoiner s2IntoS1 = new StringJoiner("-");
        s2IntoS1.merge(s1);
        s2IntoS1.merge(s2);
        System.out.println("ii) s2 merged into s1: " + s2IntoS1);

        scanner.close();
    }
}

