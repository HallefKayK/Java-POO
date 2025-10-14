package main;
import java.util.Scanner;

public class Aula3exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o horário de início do jogo: ");
        int inicio = sc.nextInt();
        System.out.print("Digite o horário de término do jogo: ");
        int termino = sc.nextInt();

        if (termino > inicio) {
            System.out.println("O jogo durou " + (termino - inicio) + " horas.");
        } else {
            System.out.println("O jogo durou " + (24 - inicio + termino) + " horas.");
            
        }
        sc.close();
    }
}
    

