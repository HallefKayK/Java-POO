import java.util.Scanner;

public class Aula3exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor A: ");
        int a = sc.nextInt();
        System.out.print("Digite o valor B: ");
        int b = sc.nextInt();

        if (a % b == 0 || b % a == 0) {
            System.out.println("São múltiplos.");
        } else {
            System.out.println("Não são múltiplos.");
            
        }

        sc.close();
        }
    }
    
