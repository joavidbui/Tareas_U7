package es.iesmz.ed.algoritmes;

/**
 * Clase que contiene dos atributos, numerador y denominador; y una función para calcular el resultado de la división
 * de sus factoriales.
 */
public class DividirFactorial {
    int numerador;
    int denominador;

    public DividirFactorial(int numerador, int denominador) {
        this.numerador = numerador;
        this.denominador = denominador;
    }

    /**
     * Calcula el resultado de dividir el factorial del numerador por el factorial del denominador.
     * @return int
     */
    public int calcula() {
        System.out.println(numerador + " " + denominador);
        int res = 1;
        for (int i = numerador; i > denominador ; i--) {
            res *= i;
        }
        return res;
    }
}
