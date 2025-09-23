package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Conta;

public class ProgramaProva {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter account data:");
        System.out.print("Account number: ");
        int number = sc.nextInt();
        sc.nextLine(); // consumir quebra de linha
        System.out.print("Account holder: ");
        String holder = sc.nextLine();
        System.out.print("Initial balance: ");
        double initialBalance = sc.nextDouble();

        Conta conta = new Conta(number, holder, initialBalance);

        System.out.println();
        System.out.println("Account data: " + conta);

        System.out.println();
        System.out.print("Enter deposit value: ");
        double depositValue = sc.nextDouble();
        conta.deposit(depositValue);
        System.out.println("Updated data: " + conta);

        System.out.println();
        System.out.print("Enter withdraw value: ");
        double withdrawValue = sc.nextDouble();
        conta.withdraw(withdrawValue);
        System.out.println("Updated data: " + conta);

        sc.close();
    }
}
