package main;
import java.util.Scanner;

public class Aula2exer6 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double pi = 3.14159;
        
        System.out.println("Digite o valor de A:");
        double A = sc.nextDouble();
        
        System.out.println("Digite o valor de B:");
        double B = sc.nextDouble();
        
        System.out.println("Digite o valor de C:");
        double C = sc.nextDouble();
        
        double areaTriangulo = (A * C) / 2;
    
        double areaCirculo = pi * Math.pow(C, 2);
        
        double areaTrapezio = ((A + B) * C) / 2;
        
        double areaQuadrado = Math.pow(B, 2);
        
        double areaRetangulo = A * B;
        
        System.out.println("\n--- Resultados ---");
        System.out.println("TRIANGULO: " + String.format("%.3f", areaTriangulo));
        System.out.println("CIRCULO: " + String.format("%.3f", areaCirculo));
        System.out.println("TRAPEZIO: " + String.format("%.3f", areaTrapezio));
        System.out.println("QUADRADO: " + String.format("%.3f", areaQuadrado));
        System.out.println("RETANGULO: " + String.format("%.3f", areaRetangulo));
        
        sc.close();
    }
}