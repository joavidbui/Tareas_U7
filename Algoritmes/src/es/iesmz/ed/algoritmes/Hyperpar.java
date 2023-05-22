package es.iesmz.ed.algoritmes;

public class Hyperpar {

    private final long numero;

    public Hyperpar(long numero) {
        this.numero = numero;
    }

    public boolean esHyperPar() {
        String hyperPar = String.valueOf(Math.abs(this.numero));
        boolean esHyperPar = true;
        for (int i = 0; i < hyperPar.length(); i++) {
            int currentDigit = Character.getNumericValue(hyperPar.charAt(i));
            if (currentDigit % 2 != 0) {
                esHyperPar = false;
                break;
            }
        }
        return esHyperPar;
    }
}
