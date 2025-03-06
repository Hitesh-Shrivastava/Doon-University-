class Complex {
    double real, imag;

    Complex(double r, double i) {
        this.real = r;
        this.imag = i;
    }

    Complex add(Complex c) {
        return new Complex(this.real + c.real, this.imag + c.imag);
    }

    void display() {
        System.out.println(real + " + " + imag + "i");
    }
}

public class ComplexAddition {
    public static void main(String[] args) {
        Complex c1 = new Complex(5.5, 4.2);
        Complex c2 = new Complex(2.3, 3.1);
        Complex sum = c1.add(c2);
        System.out.print("Sum: ");
        sum.display();
    }
}
