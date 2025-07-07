package Arrays; 
import java.util.*;
public class Question14 {

    public static void main(String[] args) {
    	Scanner s = new Scanner(System.in);
       

        int[][] arr = new int[3][3];
        int k = 0;
        try {
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    arr[i][j] = s.nextInt();
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter only integer values.");
            return;
        }
        System.out.println("The given array is :");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println(); 
        }

        
        int max = arr[0][0];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }
            }
        }

        System.out.println("The biggest number in the given array is " + max);
    }
}