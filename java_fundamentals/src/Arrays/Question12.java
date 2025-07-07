package Arrays;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		int[] arr1 = {1,2,3};
		int[] arr2 = {2,3,4};
		System.out.println(Arrays.toString(mid(arr1, arr2)));

	}
	public static int[] mid(int[] arr1, int[] arr2) {
		int l=0;
		int r=0;
		int mid1=arr1.length/2;
		int mid2=arr2.length/2;
		int[] res = new int[2];
		res[0]=arr1[mid1];
		res[1]=arr2[mid2];
		return res;
	}

}
