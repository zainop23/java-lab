
class Complex{
    double real;
    double imag;

    public Complex(double real, double imag) {
        this.real=real;
        this.imag=imag;
    }

    Complex add(Complex other){
        return new Complex(this.real+other.real, this.imag+other.imag);
    }

    Complex sub(Complex other){
        return new Complex(this.real-other.real, this.imag-other.imag);
    }

    boolean comp(Complex other){
        return this.real==other.real && this.imag==other.imag;
    }

}
public class p3 {
    public static void main(String[] args) {
        Complex n1 = new Complex(1,1);
        Complex n2 = new Complex(1,1);

        Complex sum = n1.add(n2);
        Complex diff = n1.sub(n2);

        System.out.println("Sum: " + sum.real + "+" + sum.imag + "i");
        System.out.println("Difference: " + diff.real + "+" + diff.imag + "i");
        System.out.println("Equal or not: " + n1.comp(n2));
    }
    
}
