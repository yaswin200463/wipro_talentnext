package Arrays;
import java.util.*;
public class Question13 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		
        int[][] arr = new int[2][2];

        // Fill the 2x2 array from command-line arguments
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                arr[i][j] = s.nextInt();
            }
        }

        System.out.println("The given array is :");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("The reverse of the array is :");
        for (int i = 1; i >= 0; i--) {
            for (int j = 1; j >= 0; j--) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
	}

}
