import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double[] notas = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Por favor, digite um número válido.");
                scanner.next();
            }
            notas[i] = scanner.nextDouble();
        }
        scanner.close();
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / 4;
        System.out.println("Notas digitadas:");
        for (double nota : notas) {
            System.out.println(nota);
        }
        System.out.println("Média: " + media);
    }
}
