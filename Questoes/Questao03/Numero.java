package Questoes.Questao03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Numero {
    private List <Integer> numeros;
    public Numero() {
        numeros = new ArrayList<>();
    }

    public void setNumeros(Scanner scanner) {
        int numero = 0;
        while (numero >= 0) {
            System.out.printf("Digite um número inteiro: ");
            numero = scanner.nextInt();
            numeros.add(numero);
        }
    }

    public int getTotalNumerosDigitados() {
        return numeros.size();
    }

    public float getMediaNumeros() {
        int contador = 0;
        for (int k = 0; k < numeros.size(); k++) {
            contador += numeros.get(k);
        }
        float media = (float) contador / numeros.size();
        return media;
    }
}
