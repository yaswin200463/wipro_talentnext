package wrapperclasses;

class Employee implements Cloneable {
    private int id;
    private String name;
    private String department;

    // Constructor
    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    // Getters & Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }

    // Override clone()
    public Employee clone() throws CloneNotSupportedException {
        return (Employee) super.clone();
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", department=" + department + "]";
    }
}

public class Question4 {
    public static void main(String[] args) {
        try {
            // Original object
            Employee emp1 = new Employee(101, "Alice", "HR");

            // Cloned object
            Employee emp2 = emp1.clone();

            // Modify original object's properties
            emp1.setId(202);
            emp1.setName("Bob");
            emp1.setDepartment("Finance");

            // Display both objects
            System.out.println("Original Employee: " + emp1);
            System.out.println("Cloned Employee  : " + emp2);

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
