import java.util.Scanner;

public class exer4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Digite o número do funcionário: ");
        int numeroFuncionario = sc.nextInt();

        System.out.print("Digite o número de horas trabalhadas: ");
        int horasTrabalhadas = sc.nextInt();

        System.out.print("Digite o valor recebido por hora: ");
        double valorPorHora = sc.nextDouble();

        double salario = horasTrabalhadas * valorPorHora;

        System.out.printf("Número do funcionário = %d%n", numeroFuncionario);
        System.out.printf("Salário = R$ %.2f%n", salario);

        sc.close();
    }
}
