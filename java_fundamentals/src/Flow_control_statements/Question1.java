package Flow_control_statements;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		check(n1);
		check1(n1, n2);

	}
	static void check(int n1) {
		if(n1>0) {
			System.out.println("positive");
		}else if(n1<0) {
			System.out.println("negative");
		}else {
			System.out.println("Zero");
		}
	}
	static void check1(int n1,int n2) {
		if(n1%10 == n2%10) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}
	

}
