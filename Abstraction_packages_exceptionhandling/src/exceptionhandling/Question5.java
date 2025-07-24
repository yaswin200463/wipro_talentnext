package exceptionhandling;

//Custom exception class
class InvalidAgeException extends Exception {
 public InvalidAgeException(String message) {
     super(message);
 }
}

//Main class
public class PersonValidation {
 public static void main(String[] args) {
     try {
         // Check if exactly 2 arguments are passed
         if (args.length != 2) {
             System.out.println("Error: Please enter both name and age as arguments.");
             return; // Exit gracefully
         }

         String name = args[0];
         int age = Integer.parseInt(args[1]); // May throw NumberFormatException

         // Validate age
         if (age < 18 || age >= 60) {
             throw new InvalidAgeException("Age must be >= 18 and < 60.");
         }

         // Success
         System.out.println("Name: " + name);
         System.out.println("Age: " + age);
         System.out.println("Registration successful.");

     } catch (NumberFormatException e) {
         System.out.println("Error: Age must be a valid integer.");
     } catch (InvalidAgeException e) {
         System.out.println("InvalidAgeException: " + e.getMessage());
     } catch (Exception e) {
         System.out.println("Unexpected Error: " + e);
     }
 }
}

