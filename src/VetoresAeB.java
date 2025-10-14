import java.util.Locale;
import java.util.Scanner;

public class VetoresAeB {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("O número máximo permitido é 10!");
            sc.close();
            return;
        }

        int[] vetor = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }

        int somaPares = 0;
        int contPares = 0;

        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                somaPares += vetor[i];
                contPares++;
            }
        }

        if (contPares == 0) {
            System.out.println("NENHUM NUMERO PAR");
        } else {
            double media = (double) somaPares / contPares;
            System.out.printf("MEDIA DOS PARES = %.1f%n", media);
        }

        sc.close();
    }
}
