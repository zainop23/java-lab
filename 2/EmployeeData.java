import java.util.*;

class Employee{
    String name;
    int id;
    int age;
    String dept;
    String designation;
    Double salary;
}

public class EmployeeData {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee[] emp = new Employee[5];
    
        // Read 5 Employees
        for(int i=0; i<5; i++){
            emp[i] = new Employee();
            System.out.println("Enter details of Employee " + (i + 1));

            System.out.println("Name: ");
            emp[i].name = sc.next();

            System.out.println("Emp ID: ");
            emp[i].id = sc.nextInt();

            System.out.println("Department: ");
            emp[i].dept = sc.next();

            System.out.println("Age: ");
            emp[i].age = sc.nextInt();

            System.out.println("Designation: ");
            emp[i].designation = sc.next();

            System.out.println("Salary: ");
            emp[i].salary = sc.nextDouble();
            sc.nextLine();
        }

        //Display
        for(int i=0; i<5; i++){
            System.out.println(emp[i].name + " " + emp[i].id + " " +
                               emp[i].dept + " " + emp[i].age + " " +
                               emp[i].designation + " " + emp[i].salary);
        }

        //Sum of salary of sales dept
        Double salesSum=0.0;
        for (int i = 0; i < 5; i++) {
            if(emp[i].dept.equalsIgnoreCase("sales")) salesSum += emp[i].salary;   
        }
        System.out.println("Salary of Sales dept: " + salesSum);

        //
        Employee highestPaidManager = null;
        for(int i=0; i<5; i++){
            if(emp[i].dept.equalsIgnoreCase("purchase") && 
               emp[i].designation.equalsIgnoreCase("manager")){
                if(highestPaidManager==null || emp[i].salary > highestPaidManager.salary)
                    highestPaidManager = emp[i];
            }
        }
        System.out.println("Highest paid manager: " + highestPaidManager.name + " " + highestPaidManager.salary);
    }
}
