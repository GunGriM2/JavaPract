package ru.mirea.practs.pract9;

import javax.swing.*;

public class StudentNotFoundExeption extends RuntimeException{
    public StudentNotFoundExeption(String errorMessage) {
        JOptionPane.showMessageDialog(null, errorMessage, "Студент не найден.",JOptionPane.ERROR_MESSAGE);
    }
}
