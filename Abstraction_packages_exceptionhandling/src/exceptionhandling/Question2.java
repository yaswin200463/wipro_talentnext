package exceptionhandling;

public class Question2 {
    public static void main(String[] args) {
        try {
            if (args.length != 5) {
                throw new ArrayIndexOutOfBoundsException("Exactly 5 integer arguments are required.");
            }

            int[] numbers = new int[5];
            int sum = 0;
            double average;

            for (int i = 0; i < 5; i++) {
                numbers[i] = Integer.parseInt(args[i]); // May throw NumberFormatException
                sum += numbers[i];
            }

            average = sum / 5.0;  // Use floating-point division

            System.out.println("Sum: " + sum);
            System.out.println("Average: " + average);
        } 
        catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Please enter valid integers.");
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Please enter exactly 5 integers.");
        } 
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e);
        }
    }
}

