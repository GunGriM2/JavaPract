package ru.mirea.practs.pract10;

public class Complex {

    private double real;

    private double imaginary;

    public Complex() {
        real = 0.0;
        imaginary = 0.0;
    }

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void set(Complex z) {
        this.real = z.real;
        this.imaginary = z.imaginary;
    }

    @Override
    public String toString() {
        String re = this.real + "";
        String im = "";
        if (this.imaginary < 0)
            im = this.imaginary + "i";
        else
            im = "+" + this.imaginary + "i";
        return re + im;
    }

    public double getRe() {
        return this.real;
    }

    public double getIm() {
        return this.imaginary;
    }

    public double getArg() {
        return Math.atan2(imaginary, real);
    }

    @Override
    public final boolean equals(Object z) {
        if (!(z instanceof Complex))
            return false;
        Complex a = (Complex) z;
        return (real == a.real) && (imaginary == a.imaginary);
    }
}

