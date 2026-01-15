package labsession4;

class Complex {
    private double real;
    private double imag;

    Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    // Getters
    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    // Setters
    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    Complex add(Complex other) {
        return new Complex(this.real + other.real, this.imag + other.imag);
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}

class OverloadDemo {
    void test() {
        System.out.println("No parameters");
    }

    void test(int a) {
        System.out.println("int: " + a);
    }

    void test(double a) {
        System.out.println("double: " + a);
    }

    void test(int a, int b) {
        System.out.println("int int: " + a + " " + b);
    }

    void test(Complex c1, Complex c2) {
        Complex sum = c1.add(c2);
        System.out.println("Sum of complex numbers: " + sum);
    }

    public static void main(String[] args) {
        OverloadDemo demo = new OverloadDemo();

        demo.test();
        demo.test(5);
        demo.test(3.14);
        demo.test(1, 2);

        Complex c1 = new Complex(2.0, 3.0);
        Complex c2 = new Complex(1.5, -2.5);
        demo.test(c1, c2);
    }
}