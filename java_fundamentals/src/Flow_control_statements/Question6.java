package Flow_control_statements;
import java.util.*;
public class Question6 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Gender:");
		String gen = s.nextLine();
		System.out.print("Enter age:");
		int age = s.nextInt();
		if(gen.equals("Female") && age>=1 || age <=58) {
			System.out.println("percentage of intrest is 8.2%.");
		}else if(gen.equals("Female") && age >=59 || age<=100) {
			System.out.println("percentage of intrest is 9.2%.");
		}else if(gen.equals("Male") && age>=1 || age<=58) {
			System.out.println("percentage of intrest is 8.4%.");
		}else {
			System.out.println("percentage of intrest is 10.5%.");
		}
	}

}
