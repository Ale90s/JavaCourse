package javacourse.Section06_OOP_Part1_ClassesConstructorsAndInheritance.Exercises.Ex34_ComplexOperations;

public class ComplexNumber {

    private double real;
    private double imaginary;

    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return this.real;
    }

    public double getImaginary() {
        return this.imaginary;
    }

    public void add(double real, double imaginary) {
        this.real += real;
        this.imaginary += imaginary;
    }

    public void add(ComplexNumber cn) {
        this.real += cn.real;
        this.imaginary += cn.imaginary;
    }

    public void subtract(double real, double imaginary) {
        this.real -= real;
        this.imaginary -= imaginary;
    }
    
    public void subtract(ComplexNumber cn) {
        this.real -= cn.real;
        this.imaginary -= cn.imaginary;
    }
}
