package Questoes.Questao01;

import java.util.ArrayList;
import java.util.List;

public class Fibonacci {

    private int totalNumerosSequencia;
    private List<Integer> resultado;

    public Fibonacci (int totalNumerosSequencia) {
        this.totalNumerosSequencia = totalNumerosSequencia;
        resultado = new ArrayList<>(totalNumerosSequencia);
    }

    public void calcularFibonacci() {
        int anterior = 0;
        int antesAnterior = 1;
        int atual;
        for (int k = 0; k < totalNumerosSequencia; k++) {
           atual = anterior + antesAnterior;
           antesAnterior = anterior;
           anterior = atual;
           resultado.add(atual);
        }
    }

    public int getTotalNumerosSequencia() {
        return totalNumerosSequencia;
    }

    public void setTotalNumerosSequencia(int totalNumerosSequencia) {
        this.totalNumerosSequencia = totalNumerosSequencia;
    }

    public List<Integer> getResultado() {
        return resultado;
    }
}
