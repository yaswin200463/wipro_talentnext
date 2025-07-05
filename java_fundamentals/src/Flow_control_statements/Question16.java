package Flow_control_statements;
import java.util.*;

public class Question16 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = s.nextInt();
        int rev = 0;

        while (n != 0) {
            int temp = n % 10;      // get last digit
            rev = rev * 10 + temp;  // build reversed number
            n /= 10;                // remove last digit
        }

        System.out.println("Reversed number: " + rev);

        s.close();
    }
}
