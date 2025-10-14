package main;
import java.util.Scanner;

public class Aula3exer5 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Cod 1 - Cachorro Quente - R$ 4.00\nCod 2 - X-Salada - R$ 4.50\nCod 3 - X-Bacon - R$ 5.00\nCod 4 - Torrada Simples - R$ 2.00\nCod 5 - Refrigerante - 1.50\n");
        System.out.print("Digite o código do item desejado: ");
        int codigo = sc.nextInt();
        System.out.print("Digite a quantidade desejada: ");
        int quantidade = sc.nextInt();
        double total;
        switch (codigo) {
            case 1:
                total = quantidade * 4.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 2:
                total = quantidade * 4.50;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 3:
                total = quantidade * 5.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 4:
                total = quantidade * 2.00;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 5:
                total = quantidade * 1.50;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            default:
                System.out.println("Código inválido.");
                break;
        }
                sc.close();

    }
}