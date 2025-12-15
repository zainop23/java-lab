
import java.util.Scanner;


public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try{ 
        System.out.println("Enter numerator and denominator");
        int num = sc.nextInt();
        int den = sc.nextInt();

        if(num<0 || den<0) throw new IllegalArgumentException("Negative numbers not allowed");
        System.out.println("Result: " + num/den);
        }
        catch(ArithmeticException e){
            System.out.println("Can't divide by 0");
        }
        catch(IllegalArgumentException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
