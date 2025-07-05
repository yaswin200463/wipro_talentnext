package Flow_control_statements;
import java.util.*;
public class Question14 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int sum=0;
		while(n>0) {
			int temp=n%10;
			sum+=temp;
			n=n/10;
		}
		System.out.print(sum);
	}

}

/*
 * import java.util.Scanner;
 * 
 * public class SumOfDigits { public static void main(String[] args) { Scanner
 * sc = new Scanner(System.in); System.out.print("Enter a number: "); int num =
 * sc.nextInt(); sc.close();
 * 
 * int sum = 0;
 * 
 * for (; num != 0; num /= 10) { sum += num % 10; // extract last digit and add
 * to sum }
 * 
 * System.out.println("Sum of digits = " + sum); } }
 */
