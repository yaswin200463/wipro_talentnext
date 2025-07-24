package exceptionhandling;

public class Question4 {
    
    // Method to register user
    public void registerUser(String username, String userCountry) throws InvalidCountryException {
        if (!userCountry.equalsIgnoreCase("India")) {
            throw new InvalidCountryException("User Outside India cannot be registered");
        } else {
            System.out.println("User registration done successfully");
        }
    }

    // Main method to test the logic
    public static void main(String[] args) {
        UserRegistration userReg = new UserRegistration();

        // Test Case 1
        try {
            userReg.registerUser("Mickey", "US");
        } catch (InvalidCountryException e) {
            System.out.println(e);
        }

        // Test Case 2
        try {
            userReg.registerUser("Mini", "India");
        } catch (InvalidCountryException e) {
            System.out.println(e);
        }
    }
}
