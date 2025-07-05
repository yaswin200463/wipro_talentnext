package Arrays;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }

    static void bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;

            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }

            if (!swapped) break; 
        }
    }
	}
	


