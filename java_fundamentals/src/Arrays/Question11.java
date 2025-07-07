package Arrays;
import java.util.*;
public class Question11 {

	public static void main(String[] args) {
		int[] arr = {1,1,4,4};
		System.out.println(check(arr));

	}
	public static boolean check(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=1 && arr[i]!=4) {
				return false;
			}
		}
		return true;
	}

}
