package Arrays;
import java.util.*;
public class Question3 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int tar = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int res=-1;
		for(int i=0;i<n;i++) {
			if(arr[i]==tar) {
				res=i;
				break;
			}
		}
		System.out.println(res);

	}

}
