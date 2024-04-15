import Questoes.Questao01.Fibonacci;
import Questoes.Questao02.Aluno;

import java.util.List;

public class Main {
    public static void main (String[] args) {
        // Questão 01
        Fibonacci fibonacci = new Fibonacci(30);
        fibonacci.calcularFibonacci();

        List<Integer> resultado = fibonacci.getResultado();

        System.out.println("Sequência de Fibonnaci: ");
        System.out.println(resultado);

        //Questão 02
        Aluno alunos = new Aluno(10);
        alunos.setNotas();
        alunos.getTotalNotas();
        System.out.printf("Média das notas dos alunos: %.2f\n", alunos.calcularMedia());
        alunos.calcularMedia();
        alunos.nivelMedia();
    }
}