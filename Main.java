import Questoes.Questao01.Fibonacci;
import Questoes.Questao02.Aluno;
import Questoes.Questao03.Numero;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Questão 01
        Fibonacci fibonacci = new Fibonacci(30);
        fibonacci.calcularFibonacci();

        List<Integer> resultado = fibonacci.getResultado();

        System.out.println("Sequência de Fibonnaci: ");
        System.out.println(resultado);

        // Questão 02
        Aluno alunos = new Aluno(10);
        alunos.setNotas(scanner);
        System.out.printf("Média das notas dos alunos: %.2f\n", alunos.calcularMedia());
        alunos.calcularMedia();
        alunos.nivelMedia();

        // Questão 03
        Numero numero = new Numero();
        numero.setNumeros(scanner);
        System.out.printf("O total de números digitados foi: %d\n", numero.getTotalNumerosDigitados());
        System.out.printf("A média dos números digitados é: %.2f", numero.getMediaNumeros());

        scanner.close();
    }
}