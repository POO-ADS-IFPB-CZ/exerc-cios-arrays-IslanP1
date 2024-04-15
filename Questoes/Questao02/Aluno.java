package Questoes.Questao02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private List<Float> notas;
    private int totalNotas;

    public Aluno(int totalNotas) {
        this.totalNotas = totalNotas;
        notas = new ArrayList<>(totalNotas);
    }

    public int getTotalNotas() {
        return totalNotas;
    }

    public void setTotalNotas(int totalNotas) {
        this.totalNotas = totalNotas;
    }

    public List<Float> getNotas() {
        return notas;
    }

    public void setNotas() {
        Scanner scanner = new Scanner(System.in);
        for (int k = 0; k < totalNotas; k++) {
            System.out.printf("Digite a nota %d: ", k);
            notas.add(scanner.nextFloat());
        }
        scanner.close();
    }

    public float calcularMedia() {
        float media;
        float contador = 0;

        for (int k = 0; k < totalNotas; k++) {
            contador+= notas.get(k);
        }
        media = contador / (float) totalNotas;
        return media;
    }

    public void nivelMedia() {
        float media = calcularMedia();
        int acimaMedia = 0;
        int abaixoMedia = 0;

        for (int k = 0; k < totalNotas; k++) {
            if (notas.get(k) > media) {
                acimaMedia++;
            }
            if (notas.get(k) < media) {
                abaixoMedia++;
            }
        }

        System.out.printf("Notas acimas da média: %d\n", acimaMedia);
        System.out.printf("Notas abaixo da média: %d\n", abaixoMedia);
    }
}