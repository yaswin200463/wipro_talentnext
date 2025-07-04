package Language_Basics;
import java.util.*;
public class Question1 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the first word:");
		String s1 = s.nextLine();
		System.out.print("Enter second word:");
		String s2 = s.nextLine();
		System.out.println(s1+" Technologies "+s2);
		s.close();
	}

}
