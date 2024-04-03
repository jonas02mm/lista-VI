import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numAlunos = 10;
        double[] medias = new double[numAlunos];
        for (int i = 0; i < numAlunos; i++) {
            double somaNotas = 0;
            System.out.println("Digite as quatro notas do aluno " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                somaNotas += scanner.nextDouble();
            }
            medias[i] = somaNotas / 4;
        }

        scanner.close();

        int alunosAprovados = 0;
        for (double media : medias) {
            if (media >= 7.0) {
                alunosAprovados++;
            }
        }

        System.out.println("Número de alunos com média maior ou igual a 7.0: " + alunosAprovados);
    }
}
