package Arrays;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,10,4,6,10,3};
		ans(arr);
		System.out.println(Arrays.toString(arr));

	}
	public static void ans(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==10) {
				arr[i]=0;
			}
		}
		int index=0;
		for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                arr[index++] = arr[i];
            }
        }
		while (index < arr.length) {
            arr[index++] = 0;
        }
	}

}
