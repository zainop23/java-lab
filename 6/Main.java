
import java.util.Scanner;

abstract class Bank{
    String name;
    int accNo;
    double balance;

    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        name = sc.nextLine();
        System.out.print("Account No: ");
        accNo = sc.nextInt();
        System.out.print("Balance: ");
        balance = sc.nextDouble();
    }

    void display() {
        System.out.println("Name: " + name +
                           "\tAccount: " + accNo +
                           "\tBalance: " + balance);
    }

    abstract double calcInt();
}

class SBI extends Bank{
    double calcInt(){
        return balance * 0.06;
    }
}

class Canara extends Bank{
    double calcInt(){
        return balance * 0.07;
    }
}

class Citi extends Bank{
    double calcInt(){
        return balance * 0.08;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Bank[] banks = {
            new SBI(),
            new Canara(),
            new Citi()
        };

        for(Bank b : banks){
            System.out.println("Enter details:");
            b.read();
        }

        for(Bank b: banks){
            b.display();
            System.out.println("Interest Earned: " + b.calcInt());
        }
    }
}
