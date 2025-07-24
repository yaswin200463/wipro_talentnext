package Inheritence;

public class TestEmployee {
 public static void main(String[] args) {
     
     Employee emp = new Employee("Alice Johnson", 75000.0, 2015, "NI123456X");

     
     System.out.println("=== Employee Details ===");
     System.out.println(emp);

   
     emp.setAnnualSalary(80000.0);
     emp.setYearStarted(2014);
     emp.setNationalInsuranceNumber("NI654321Y");

    
     System.out.println("\n=== Updated Employee Details ===");
     System.out.println(emp);
 }
}

