package Arrays;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int sum=0;
		int avg=0;
		for(int i=0;i<n;i++) {
			sum+=arr[i];
			avg=sum/n;
		}
		System.out.println(sum);
		System.out.println(avg);
	}

}
