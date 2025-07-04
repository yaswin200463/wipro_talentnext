package Flow_control_statements;
import java.util.*;
public class Question7 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		char ch=s.next().charAt(0);
		if(Character.isUpperCase(ch)) {
			System.out.println(ch+" ->  "+Character.toLowerCase(ch));
		}else {
			System.out.println(ch+" ->  "+Character.toUpperCase(ch));
		}
	}

}
