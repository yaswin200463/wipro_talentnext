import java.util.Optional;

// Custom Exception
class InvalidEmployeeException extends RuntimeException {
    public InvalidEmployeeException(String message) {
        super(message);
    }
}

// Employee class
class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Main class
public class Question3 {
    public static void main(String[] args) {
        // Try changing null to a valid Employee like: new Employee("John");
        Employee emp = null;

        // Use Optional to check for null and throw custom exception
        Employee validEmployee = Optional.ofNullable(emp)
            .orElseThrow(() -> new InvalidEmployeeException("Employee object is null!"));

        // Print employee name if not null
        System.out.println("Employee Name: " + validEmployee.getName());
    }
}
