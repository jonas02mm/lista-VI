import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 20;

        int[] numeros = new int[tamanho];
        int[] pares = new int[tamanho];
        int[] impares = new int[tamanho];
        int countPares = 0;
        int countImpares = 0;
        System.out.println("Digite os 20 números inteiros:");
        for (int i = 0; i < tamanho; i++) {
            numeros[i] = scanner.nextInt();

            if (numeros[i] % 2 == 0) {
                pares[countPares++] = numeros[i];
            } else {
                impares[countImpares++] = numeros[i];
            }
        }

        scanner.close();

        System.out.println("Números digitados:");
        imprimirVetor(numeros, tamanho);
        System.out.println("Números pares:");
        imprimirVetor(pares, countPares);
        System.out.println("Números ímpares:");
        imprimirVetor(impares, countImpares);
    }

    public static void imprimirVetor(int[] vetor, int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.println(vetor[i]);
        }
    }
}
