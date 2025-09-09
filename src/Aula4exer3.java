import java.util.Scanner;

public class Aula4exer3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;

        while (true) {
            System.out.print("Digite o código do combustível (1-Álcool, 2-Gasolina, 3-Diesel, 4-Fim): ");
            int codigo = sc.nextInt();

            if (codigo == 4) {
                break; // encerra
            } else if (codigo == 1) {
                alcool++;
            } else if (codigo == 2) {
                gasolina++;
            } else if (codigo == 3) {
                diesel++;
            } else {
                // ignora códigos inválidos
                System.out.println("Código inválido! Digite novamente.");
            }
        }

        System.out.println("MUITO OBRIGADO");
        System.out.println("Alcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);

        sc.close();
    }
}
