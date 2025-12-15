
import java.util.Scanner;

public class Add{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(args[0]);

        int [][] a = new int[n][n];
        int [][] b = new int[n][n];
        int [][] c = new int[n][n];

        System.out.println("Enter the matrix A: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]= sc.nextInt();
            }
        }

        System.out.println("Enter the matrix B: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j]= sc.nextInt();
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                c[i][j]= a[i][j] + b[i][j];
            }
        }

        System.out.println("The resultant matrix: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}