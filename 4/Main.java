import java.util.*;

class Person{
    String name, gender;
    int age;
    Person(String name, String gender, int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    
    void display(){
        System.out.println("Name: " + name);
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person{
    String company;
    double salary;
    Employee(String name, String gender, int age, String company, double salary){
        super(name, gender, age);
        this.company=company;
        this.salary=salary;
    }

    void display(){
        super.display();
        System.out.println("Company: " + company);
        System.out.println("Salary: " + salary);
    }
}

class Student extends Person{
    String school;
    double grade;
    Student(String name, String gender, int age, String school, double grade){
        super(name, gender, age);
        this.school=school;
        this.grade=grade;
    }

    void display(){
        super.display();
        System.out.println("School: " + school);
        System.out.println("Grade: " + grade);
    }
}

public class Main {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    Employee[] emp = new Employee[2];
    Student[] stu = new Student[2];

    System.out.println("Enter Employee Details:");
    for(int i=0; i<2; i++){
        System.out.print("Name Gender Age Company Salary: ");
        emp[i] = new Employee(
            sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble()
        );
    }
    System.out.println("Enter Student Details:");
    for(int i=0; i<2; i++){
        System.out.print("Name Gender Age School Grade: ");
        stu[i] = new Student(
            sc.next(), sc.next(), sc.nextInt(), sc.next(), sc.nextDouble()
        );
    }
     System.out.println("\nEmployee Details:");
        for (Employee e : emp) {
            e.display();
            System.out.println();
        }

        System.out.println("Student Details:");
        for (Student s : stu) {
            s.display();
            System.out.println();
        }

        sc.close();

    }
}
