
import java.util.*;

class Employee {

    String name;
    double salary;
    String designation;
    String department;

    public Employee(String name, double salary, String designation, String department) {
        this.name = name;
        this.salary = salary;
        this.designation = designation;
        this.department = department;
    }

    void display() {
        System.out.print("Name: " + name + ", Department: " + department + ", Designation: " + designation + ", Salary: " + salary);
    }
}

public class p2 {

    // ...existing code...
    public static void main(String[] args) {
        Employee[] employees = new Employee[3];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("Enter Name: ");
            String name = sc.nextLine();
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            System.out.print("Enter Designation: ");
            String designation = sc.nextLine();
            System.out.print("Enter Salary: ");
            double salary = sc.nextDouble();
            sc.nextLine(); 

            employees[i] = new Employee(name, salary, designation, department);
        }

        //Display
        System.out.println("\n--- Employee Details ---");
        for (Employee e : employees) {
            e.display();
            System.out.println(); 
        }

        //Sales
        double salesSum = 0;
        for (Employee e : employees) {
            if (e.department.equalsIgnoreCase("Sales")) {
                salesSum += e.salary;
            }
        }
        System.out.println("\nTotal salary of Sales department employees: " + salesSum);

        //Highest paid manager in purchase
        Employee highest = null;
        for (Employee e : employees) {
            if (e.department.equalsIgnoreCase("purchase") && e.designation.equalsIgnoreCase("manager")) {
                if (highest == null || e.salary > highest.salary) {
                    highest = e;
                }
            }
        }
        if (highest != null) {
            System.out.print("Highest paid manager in purchase: ");
            highest.display();
        } else {
            System.out.println("No manager found in purchase department.");
        }
    }


}
