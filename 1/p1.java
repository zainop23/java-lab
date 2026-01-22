import java.util.*;

public class p1{
    public static void main(String[] args) {
        //Roots of Quadratic Equation
        // x^2-3x+2
        double a=1,b=-3,c=2;
        double d = b*b - 4*a*c;
        if(d>0) System.out.println("Roots : " + (-b + Math.sqrt(d))/2 + ", " + (-b - Math.sqrt(d))/2);
        else if(d==0) System.out.println("Roots are: " + (-b)/(2*a)); 
        else {
            double real = -b/(2*a);
            double imag = (Math.sqrt(-d))/(2*a);
            System.out.println(real+ "+" + imag + "i" + " and " + real+ "-" + imag + "i");
        }
            
        //Multiply two arrays
        int[] x={1,2,3}, y={2,3,4}, z=new int[3];
        for(int i=0; i<3; i++){
            z[i]=x[i]*y[i];
        }
        System.out.println("Product : " + Arrays.toString(z));

        //Bubble Sort
        int[] arr1 = {6,3,9,4,1};
        int n = arr1.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr1[j] > arr1[j+1]){
                    int temp = arr1[j];
                    arr1[j]=arr1[j+1];
                    arr1[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Ascending Order : "+ Arrays.toString(arr1));

        int[] arr2 = {6,3,9,4,1};
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(arr2[j] < arr2[j+1]){
                    int temp = arr2[j];
                    arr2[j]=arr2[j+1];
                    arr2[j+1]=temp;
                }
            }
        }
        System.out.println("Sorted Descending Order : "+ Arrays.toString(arr2));
    }
}