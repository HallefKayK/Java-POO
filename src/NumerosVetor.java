import java.util.Scanner;

public class NumerosVetor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros voce vai digitar? ");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("O número máximo permitido é 10!");
            sc.close();
            return;
        }

        int[] numeros = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite um numero: ");
            numeros[i] = sc.nextInt();
        }

        System.out.println("\nNUMEROS PARES:");
        int contadorPares = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] % 2 == 0) {
                System.out.print(numeros[i] + " ");
                contadorPares++;
            }
        }

        System.out.println("\n\nQUANTIDADE DE PARES = " + contadorPares);

        sc.close();
    }
}
