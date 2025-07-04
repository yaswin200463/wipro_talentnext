package Flow_control_statements;
import java.util.*;
public class Qustion5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char ch = s.next().charAt(0);
		if((ch >= 'A' && ch <='Z') || (ch >= 'a' && ch <= 'z')) { 
			System.out.println("Alphabet");
		}else if(ch >= 0 && ch <= 9) {
			System.out.println("Digit");
		}else {
			System.out.println("Special character");
		}
	}

}
