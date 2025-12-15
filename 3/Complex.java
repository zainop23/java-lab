
public class Complex {
    double real;
    double imag;
    Complex(double real, double imag){
        this.real=real;
        this.imag=imag;
    }

    Complex add(Complex c){
        return new Complex(real+c.real, imag+c.imag);
    }

    Complex sub(Complex c){
        return new Complex(real-c.real, imag-c.imag);
    }

    boolean comp(Complex c){
        return (real==c.real && imag==c.imag);

    }
    public static void main(String[] args) {
        Complex n1 = new Complex(2,3);
        Complex n2 = new Complex(1,1);

        Complex sum = n1.add(n2);
        Complex diff = n1.sub(n2);

        System.out.println("Sum: " + sum.real + "+" + sum.imag + "i");
        System.out.println("Difference: " + diff.real + "+" + diff.imag + "i");
        System.out.println("Equal or not: "+n1.comp(n2));

    }
}
