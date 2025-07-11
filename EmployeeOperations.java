class Employee {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: ₹" + String.format("%.2f", salary));
    }
}

public class EmployeeOperations {

    public void displayAllEmployees(Employee[] employees) {
        System.out.println("--- Employee Details ---");
        for (Employee employee : employees) {
            employee.displayDetails();
        }
        System.out.println("------------------------");
    }

    public void findHighestSalaryEmployee(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            System.out.println("No employees to find.");
            return;
        }

        Employee highestSalaryEmployee = employees[0];
        for (int i = 1; i < employees.length; i++) {
            if (employees[i].salary > highestSalaryEmployee.salary) {
                highestSalaryEmployee = employees[i];
            }
        }
        System.out.println("\n--- Employee with Highest Salary ---");
        highestSalaryEmployee.displayDetails();
        System.out.println("----------------------------------");
    }

    public void calculateAverageSalary(Employee[] employees) {
        if (employees == null || employees.length == 0) {
            System.out.println("No employees to calculate average salary.");
            return;
        }

        double totalSalary = 0;
        for (Employee employee : employees) {
            totalSalary += employee.salary;
        }
        double averageSalary = totalSalary / employees.length;
        System.out.println("\n--- Average Salary ---");
        System.out.println("Average Salary: ₹" + String.format("%.2f", averageSalary));
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(101, "Alice", 60000.00);
        employees[1] = new Employee(102, "Bob", 75000.50);
        employees[2] = new Employee(103, "Charlie", 52000.75);
        employees[3] = new Employee(104, "David", 90000.20);
        employees[4] = new Employee(105, "Eve", 68000.90);

        EmployeeOperations operations = new EmployeeOperations();
        operations.displayAllEmployees(employees);
        operations.findHighestSalaryEmployee(employees);
        operations.calculateAverageSalary(employees);
    }
}
