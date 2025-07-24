package packages;

//Simulate testpackage.Foundation class
class Foundation {
 private int var1 = 1;         
 int var2 = 2;                 // default access modifier
 protected int var3 = 3;       // protected access modifier
 public int var4 = 4;          // public access modifier
}

//Main class trying to access members
public class AccessTest extends Foundation {
 public static void main(String[] args) {
     Foundation obj = new Foundation();

     
     System.out.println("Public var4: " + obj.var4); 

     // Accessing protected via inheritance
     AccessTest child = new AccessTest();
     System.out.println("Protected var3 via inheritance: " + child.var3);
}
