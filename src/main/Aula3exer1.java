package main;
import java.util.Scanner;

public class Aula3exer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número:");
        int num1 = sc.nextInt(); 

        if (num1 > 0) {
            System.out.println("O número é positivo.");
        } else if (num1 < 0) {
            System.out.println("O número é negativo.");
        } else {
            System.out.println("O número é zero.");
        }
        
        sc.close();
    } 
}
