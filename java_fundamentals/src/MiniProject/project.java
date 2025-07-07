package MiniProject;
import java.util.*;
public class project {
    public static void main(String[] args) {
        int[] empId = {1001, 1002, 1003, 1004, 1005, 1006, 1007};
        String[] empName = {"Ashish", "Sushma", "Rahul", "Chahat", "Ranjan", "Suman", "Tanmay"};
        String[] joinDate = {"01/04/2009", "23/08/2012", "12/11/2008", "29/01/2013", "16/07/2005", "1/1/2000", "12/06/2006"};
        char[] desigCode = {'e', 'c', 'k', 'r', 'm', 'e', 'c'};
        String[] department = {"R&D", "PM", "Acct", "Front Desk", "Engg", "Manufacturing", "PM"};
        int[] basic = {20000, 30000, 10000, 12000, 50000, 23000, 29000};
        int[] hra = {8000, 12000, 8000, 6000, 20000, 9000, 12000};
        int[] it = {3000, 9000, 1000, 2000, 20000, 4400, 10000};
        char[] code = {'e', 'c', 'k', 'r', 'm'};
        String[] designation = {"Engineer", "Consultant", "Clerk", "Receptionist", "Manager"};
        int[] da = {20000, 32000, 12000, 15000, 40000};
        Scanner s = new Scanner(System.in);
        

        int id = s.nextInt();
        boolean found = false;

        for (int i = 0; i < empId.length; i++) {
            if (empId[i] == id) {
                found = true;
                int daAmount = 0;
                String desig = "";
                switch (desigCode[i]) {
                    case 'e':
                        daAmount = 20000;
                        desig = "Engineer";
                        break;
                    case 'c':
                        daAmount = 32000;
                        desig = "Consultant";
                        break;
                    case 'k':
                        daAmount = 12000;
                        desig = "Clerk";
                        break;
                    case 'r':
                        daAmount = 15000;
                        desig = "Receptionist";
                        break;
                    case 'm':
                        daAmount = 40000;
                        desig = "Manager";
                        break;
                }

                int salar = basic[i] + hra[i] + daAmount - it[i];
                System.out.println("Emp No.\tEmp Name\tDepartment\tDesignation\tSalary");
                System.out.println(empId[i] + "\t" + empName[i] + "\t\t" + department[i] + "\t\t" + desig + "\t" + salar);
                break;
            }
        }

        if (!found) {
            System.out.println("There is no employee with empid : " + id);
        }
    }
}
