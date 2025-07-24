package stringjoiner;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringJoiner;

public class Question1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

       
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = scanner.nextLine();
            names.add(name);
        }

       
        StringJoiner joiner = new StringJoiner(",", "{", "}");

        for (String name : names) {
            joiner.add(name);
        }

   
        System.out.println("Joined names: " + joiner.toString());

        scanner.close();
    }
}

