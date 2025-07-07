package Arrays;
import java.util.*;
public class Question8 {

	public static void main(String[] args) {
		 int[] arr = {10, 3, 6, 1, 2, 7, 9};
		 System.out.println(getSum(arr));
	}
	public static int getSum(int[] arr) {
        int sum = 0;
        boolean skip = false;

        for (int num : arr) {
            if (num == 6) {
                skip = true;
            } else if (skip && num == 7) {
                skip = false;
            } else if (!skip) {
                sum += num;
            }
        }

        return sum;
    }

}
