package Arrays;
import java.util.*;
public class Question10 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6};
		rearr(arr);
		System.out.println(Arrays.toString(arr));
	}
	public static void rearr(int[] arr) {
        int[] temp = new int[arr.length];
        int index = 0;

        // First add even numbers
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                temp[index++] = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

}
