package exceptionhandling;

import java.util.Scanner;

public class Question3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        final int studentCount = 2;
        final int subjectCount = 3;

        for (int i = 1; i <= studentCount; i++) {
            try {
                System.out.println("Enter name of Student " + i + ":");
                String name = scanner.nextLine();

                int[] marks = new int[subjectCount];
                int sum = 0;

                for (int j = 0; j < subjectCount; j++) {
                    System.out.println("Enter mark " + (j + 1) + " for " + name + ":");
                    String input = scanner.nextLine();

                    int mark = Integer.parseInt(input);  // May throw NumberFormatException

                    if (mark < 0) {
                        throw new NegativeValueException("Marks cannot be negative.");
                    }
                    if (mark > 100) {
                        throw new OutOfRangeException("Marks should be between 0 and 100.");
                    }

                    marks[j] = mark;
                    sum += mark;
                }

                double average = sum / (double) subjectCount;
                System.out.println("Average marks for " + name + ": " + average);

            } catch (NumberFormatException e) {
                System.out.println("NumberFormatException: Please enter valid integer marks.");
                i--; // Retry current student
            } catch (NegativeValueException | OutOfRangeException e) {
                System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
                i--; // Retry current student
            } catch (Exception e) {
                System.out.println("Unexpected Error: " + e);
                i--; // Retry current student
            }
        }

        scanner.close();
    }
}

