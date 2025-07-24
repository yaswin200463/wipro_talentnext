package optionalclass;

import java.util.Optional;

public class Question1 {
    public static void main(String[] args) {
        String[] names = new String[5]; 

      
        Optional<String> nameOpt = Optional.ofNullable(names[0]);

    
        int length = nameOpt.map(String::length).orElse(0);

        System.out.println("Length: " + length);
    }
}

