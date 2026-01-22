import java.util.Scanner;
public class p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num and den: ");
        int num = sc.nextInt();
        int den = sc.nextInt();

        try {
            if(num<0 || den<0) throw new IllegalArgumentException("Negative not allowed");

            System.out.println("Result: " + num/den);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }
        catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        finally{
            sc.close();
        }
    }    
}
