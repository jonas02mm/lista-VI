import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tamanho = 10;

        char[] vetor = new char[tamanho];

        System.out.println("Digite os 10 caracteres:");
        for (int i = 0; i < tamanho; i++) {
            vetor[i] = scanner.next().charAt(0);
        }
        scanner.close();

        int numConsoantes = 0;
        System.out.println("Consoantes digitadas:");
        for (char c : vetor) {
            if (isConsoante(c)) {
                numConsoantes++;
                System.out.println(c);
            }
        }
        System.out.println("Total de consoantes: " + numConsoantes);
    }
    public static boolean isConsoante(char c) {
        c = Character.toLowerCase(c);
        return c >= 'a' && c <= 'z' && !"aeiou".contains(String.valueOf(c));
    }
}
