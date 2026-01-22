
import java.util.Scanner;

abstract class Bank{
    String name;
    double balance;
    int accNo;

    void read(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Name: ");
        this.name = sc.nextLine();
        System.out.println("Account no: ");
        this.accNo = sc.nextInt(); 
        System.out.println("Balance: ");
        this.balance = sc.nextDouble(); 
    }

    void display(){
         System.out.println("Name: " + name +
                           "\tAccount: " + accNo +
                           "\tBalance: " + balance);
    }

    abstract double calcInt();
}

class SBI extends Bank{
    double calcInt(){
        return balance*0.06;
    }
}

class Canara extends Bank{
    double calcInt(){
        return balance*0.06;
    }
}

class Citi extends Bank{
    double calcInt(){
        return balance*0.06;
    }
}

public class p6 {
    public static void main(String[] args){
   Bank[] banks = {
    new SBI(), new Canara(), new Citi()
   };

   for(Bank b: banks){
    
    b.read();
   }

   for(Bank b: banks){
    b.display(); 
    System.out.println("Interest Earned: " + b.calcInt());
   }
}
}
