import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 5;

        int[] vetor = new int[tamanho];

        System.out.println("Digite os 5 números inteiros:");
        for (int i = 0; i < tamanho; i++) {
            while (true) {
                System.out.print("Número " + (i + 1) + ": ");
                if (scanner.hasNextInt()) {
                    vetor[i] = scanner.nextInt();
                    break;
                } else {
                    System.out.println("Por favor, digite um número inteiro válido.");
                    scanner.next();
                }
            }
        }

        scanner.close();

        int soma = 0;
        int multiplicacao = 1;
        for (int num : vetor) {
            soma += num;
            multiplicacao *= num;
        }

        System.out.println("Números digitados:");
        for (int num : vetor) {
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.println("Soma: " + soma);
        System.out.println("Multiplicação: " + multiplicacao);
    }
}
