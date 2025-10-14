import java.util.Locale;
import java.util.Scanner;

public class InteiroVetorN {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos valores vai ter cada vetor? ");
        int n = sc.nextInt();

        if (n > 10) {
            System.out.println("O número máximo permitido é 10!");
            sc.close();
            return;
        }

        double[] a = new double[n];
        double[] b = new double[n];
        double[] c = new double[n];

        System.out.println("Digite os valores do vetor A:");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextDouble();
        }

        System.out.println("Digite os valores do vetor B:");
        for (int i = 0; i < n; i++) {
            b[i] = sc.nextDouble();
        }
       
        for (int i = 0; i < n; i++) {
            if (a[i] > b[i]) {
                c[i] = a[i];
            } else {
                c[i] = b[i];
            }
        }

        System.out.println("VETOR RESULTANTE:");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.1f%n", c[i]);
        }

        sc.close();
    }
}
