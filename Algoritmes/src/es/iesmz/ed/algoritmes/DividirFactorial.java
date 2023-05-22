package es.iesmz.ed.algoritmes;

public class DividirFactorial {
    int numerador;
    int denominador;

    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    public int calcula() {
        System.out.println(numerador + " " + denominador);
        int res = 1;
        for (int i = numerador; i > denominador ; i--) {
            res *= i;
        }
        return res;
    }
}
