import java.util.Locale;
import java.util.Scanner;

public class NomeIdade {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantas pessoas serao digitadas? ");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("O número máximo permitido é 10!");
            sc.close();
            return;
        }

        String[] nomes = new String[n];
        int[] idades = new int[n];
        double[] alturas = new double[n];

        for (int i = 0; i < n; i++) {
            System.out.printf("Dados da %da pessoa:%n", i + 1);
            System.out.print("Nome: ");
            sc.nextLine(); // limpar o buffer
            nomes[i] = sc.nextLine();
            System.out.print("Idade: ");
            idades[i] = sc.nextInt();
            System.out.print("Altura: ");
            alturas[i] = sc.nextDouble();
        }

        double somaAlturas = 0.0;
        for (int i = 0; i < n; i++) {
            somaAlturas += alturas[i];
        }
        double mediaAltura = somaAlturas / n;

        int menores = 0;
        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                menores++;
            }
        }
        double percentualMenores = ((double) menores / n) * 100.0;

        System.out.printf("%nAltura média: %.2f%n", mediaAltura);
        System.out.printf("Pessoas com menos de 16 anos: %.1f%%%n", percentualMenores);

        for (int i = 0; i < n; i++) {
            if (idades[i] < 16) {
                System.out.println(nomes[i]);
            }
        }

        sc.close();
    }
}
