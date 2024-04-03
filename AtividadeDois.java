import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 10;
        double[] vetor = new double[tamanho];
        System.out.println("digite os 10 números reais:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextDouble();
        }
        scanner.close();
        System.out.println("numeros reais digitados em ordem inversa:");
        for (int i = tamanho - 1; i >= 0; i--) {
            System.out.printf("o numero é:", vetor[i]);
        }
    }
}
