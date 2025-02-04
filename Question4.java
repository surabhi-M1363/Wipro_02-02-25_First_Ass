// Abstract class
abstract class Employee {
    String name;
    int empId;

    public Employee(String name, int empId) {
        this.name = name;
        this.empId = empId;
    }

    // Abstract methods
    abstract double calculateSalary();
    abstract void displayDetails();
}

// Derived class: FullTimeEmployee
class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int empId, double monthlySalary) {
        super(name, empId);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double calculateSalary() {
        return monthlySalary;
    }

    @Override
    void displayDetails() {
        System.out.println("Full-Time Employee: " + name);
        System.out.println("ID: " + empId);
        System.out.println("Monthly Salary: $" + calculateSalary());
    }
}

// Derived class: PartTimeEmployee
class PartTimeEmployee extends Employee {
    double hourlyRate;
    int hoursWorked;

    public PartTimeEmployee(String name, int empId, double hourlyRate, int hoursWorked) {
        super(name, empId);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    double calculateSalary() {
        return hourlyRate * hoursWorked;
    }

    @Override
    void displayDetails() {
        System.out.println("Part-Time Employee: " + name);
        System.out.println("ID: " + empId);
        System.out.println("Hourly Salary: $" + calculateSalary());
    }
}

// Main class to demonstrate polymorphism
public class EmployeeManagement {
    public static void main(String[] args) {
        // Creating an array of Employee objects (Polymorphism)
        Employee[] employees = {
            new FullTimeEmployee("Alice", 101, 5000),
            new PartTimeEmployee("Bob", 102, 20, 120)
        };

        // Displaying details and salary of each employee
        for (Employee emp : employees) {
            emp.displayDetails();
            System.out.println();
        }
    }
}
