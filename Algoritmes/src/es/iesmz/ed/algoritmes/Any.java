package es.iesmz.ed.algoritmes;

import java.util.ArrayList;
import java.util.List;

public class Any {
    long numero;

    public Any(long numero) {
        this.numero = numero;
    }

    public int digitsDiferents(){
        List<Character> uniqueNumbers = new ArrayList<>();

        long unsignedNumero = Math.abs(numero);
        char[] numeroArray = String.valueOf(unsignedNumero).toCharArray();

        for (Character c : numeroArray) {
            if (!uniqueNumbers.contains(c)) uniqueNumbers.add(c);
        }
        return uniqueNumbers.size();
    }
}
