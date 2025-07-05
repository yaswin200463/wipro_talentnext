package Arrays;
import java.util.*;
public class Question4 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		for(int i=0;i<n;i++) {
			char ch = (char)arr[i];
			System.out.println(ch);
		}

	}

}
