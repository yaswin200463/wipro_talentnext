package Flow_control_statements;
import java.util.*;

public class Question13 {

    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean prime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}
