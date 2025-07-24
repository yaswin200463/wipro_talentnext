package wrapperclasses;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer between 1 and 255: ");
        int number = scanner.nextInt();

        if (number < 1 || number > 255) {
            System.out.println("Invalid input! Number must be between 1 and 255.");
        } else {
            String binaryString = Integer.toBinaryString(number);
            String paddedBinary = String.format("%8s", binaryString).replace(' ', '0');
            System.out.println("Binary representation (8 digits): " + paddedBinary);
        }

        scanner.close();
    }
}
