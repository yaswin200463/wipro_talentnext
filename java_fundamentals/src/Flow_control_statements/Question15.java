package Flow_control_statements;
import java.util.*;

public class Question15 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        String input = s.nextLine().trim();

        if (input.isEmpty()) {
            System.out.println("Please enter the integer number");
            return;
        }

        int num;
        try {
            num = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Please enter the integer number");
            return;
        }

        int i = 1; // row number

        while (i <= num) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            i++;
        }

        s.close();
    }
}
