package Flow_control_statements;
import java.util.*;
public class Question12 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		boolean isPrime = true;
		if(n<=1) {
			isPrime = false;
		}else {
			for(int i=2;i<Math.sqrt(n);i++) {
				if(n%i==0) {
					isPrime = false;
				}
			}
		}
		if(isPrime) {
			System.out.println(n+" is prime ");
		}else {
			System.out.println(n+" is not prime ");
		}
	}

}
