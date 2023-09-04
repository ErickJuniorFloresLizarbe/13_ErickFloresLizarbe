package calculadora;

import javax.swing.JOptionPane;

public class Calculadora {

    int num1;
    int num2;
    double sum, res, mul, div, resi;

    public void sumar() {
        sum = num1 + num2;
    }

    public void restar() {
        res = num1 - num2;
    }

    public void multiplicacion() {
        mul = num1 * num2;
    }

    public void division() {
        div = num1 / num2;
    }

    public void residuo() {
        resi = num1 % num2;
    }

    public void ingresarDatos() {
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:"));
    }

    public void salida() {
        JOptionPane.showMessageDialog(null, "La suma es: " + sum + "\nLa resta es: " + res + "\nLa multiplicacion es: " + mul + "\nLa division es: " + div + "\nEl residuo de la division es: " + resi);
    }

    public static void main(String[] args) {
        Calculadora c1 = new Calculadora();
        c1.ingresarDatos();
        c1.sumar();
        c1.restar();
        c1.multiplicacion();
        c1.division();
        c1.residuo();
        c1.salida();
    }

}
