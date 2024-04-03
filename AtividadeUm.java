import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tamanho = 5;
        int[] vetor = new int[tamanho];
        System.out.println("Digite os 5 números inteiros:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.nextInt();
        }
        scanner.close();
        System.out.println("Números inteiros digitados:");
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }
}
