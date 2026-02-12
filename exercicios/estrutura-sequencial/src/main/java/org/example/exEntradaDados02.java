package org.example;
import java.util.Arrays;
import java.util.Scanner;

public class exEntradaDados02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double raio;
        double pi = 3.14159;
        double area;

        System.out.print("Digite o raio: ");
        raio = scanner.nextDouble();

        area = pi*(raio*2);

        System.out.println("AREA DO CIRCULO");
        System.out.printf("ENTRADA: %.2f | SAIDA: %.4f",raio, area);

    }

}
