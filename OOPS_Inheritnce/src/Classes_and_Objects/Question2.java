package Classes_and_Objects;
import java.util.*;
public class Question2 {

	public static void main(String[] args) {
		System.out.println(Calculator.powerInt(2,2));
		System.out.println(Calculator.powerDouble(2.5, 2));

	}
	
}
 class Calculator{
	public static int powerInt(int num1, int num2) {
		return (int)Math.pow(num1, num2);
	}
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}
}
