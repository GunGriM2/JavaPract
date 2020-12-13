package ru.mirea.practs.pract10;
import java.util.Objects;

public interface ComplexAbstractFactory {
    public Complex createComplex();
    public Complex CreateComplex(int real, int image);
}
