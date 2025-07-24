package interfacenew;

@FunctionalInterface
interface Test {
    int myFunction(int a, int b, int c);
}

public class Question2 {
    public static void main(String[] args) {
        // t1 adds three integers
        Test t1 = (a, b, c) -> a + b + c;

        // t2 multiplies three integers
        Test t2 = (a, b, c) -> a * b * c;

        // Call myFunction on both and print the results
        int sumResult = t1.myFunction(2, 3, 4);       // 2 + 3 + 4 = 9
        int productResult = t2.myFunction(2, 3, 4);   // 2 * 3 * 4 = 24

        System.out.println("Sum: " + sumResult);
        System.out.println("Product: " + productResult);
    }
}
