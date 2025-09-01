import java.util.Scanner;

public class Aula2exer5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o código da peça 1:");
        int codigo1 = sc.nextInt();

        System.out.println("Digite o número de peças 1:");
        int numeroPecas1 = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 1:");
        double valorUnitario1 = sc.nextDouble();

        System.out.println("\nDigite o código da peça 2:");
        int codigo2 = sc.nextInt();

        System.out.println("Digite o número de peças 2:");
        int numeroPecas2 = sc.nextInt();

        System.out.println("Digite o valor unitário da peça 2:");
        double valorUnitario2 = sc.nextDouble();

        double totalPeca1 = numeroPecas1 * valorUnitario1;
        double totalPeca2 = numeroPecas2 * valorUnitario2;
        double valorTotal = totalPeca1 + totalPeca2;

       
        System.out.println("\n---------------------------------");
        System.out.println("Valor a ser pago: R$ " + String.format("%.2f", valorTotal));
        System.out.println("---------------------------------");

        
        sc.close();
    }
}