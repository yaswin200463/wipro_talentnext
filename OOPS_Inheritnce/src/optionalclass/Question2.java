package optionalclass;

import java.util.Optional;

public class Question2{
    public static void main(String[] args) {
        // You can change this to test with a non-null value
        String address = null;

        // Use Optional to handle null and set default
        String result = Optional.ofNullable(address).orElse("India");

        System.out.println("Address: " + result);
    }
}

