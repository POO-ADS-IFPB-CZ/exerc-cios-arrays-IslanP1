import Questoes.Questao01.Fibonacci;

import java.util.List;

public class Main {
    public static void main (String[] args) {
        // Questão 01
        Fibonacci fibonacci = new Fibonacci(30);
        fibonacci.calcularFibonacci();

        List<Integer> resultado = fibonacci.getResultado();

        System.out.println("Sequência de Fibonnaci: ");
        System.out.println(resultado);
    }
}