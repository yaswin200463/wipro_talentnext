package Flow_control_statements;
import java.util.*;
public class Question17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int org=n;
		int rev=0;
		while(n!=0) {
			int temp=n%10;
			rev=rev*10+temp;
			n/=10;
		}
		if(org==rev) {
			System.out.println(org+" is a palindrome");
		}else {
			System.out.println(org+" is not a palindrome");
		}

	}

}
