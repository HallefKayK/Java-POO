import java.util.Scanner;

public class exer2 {

    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();

        double pi = 3.14159;
        double area = pi * raio * raio;

        System.out.printf("A área do círculo de raio %.2f é: %.4f%n", raio, area);




        sc.close();
    }

}
