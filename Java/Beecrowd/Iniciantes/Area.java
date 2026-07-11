// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
// Importante sempre fechar o scanner uma boa prática em java scanner.clos(); => liberar recursos evitando resource leaks (vazamento)
public class Area {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble();
        final double VALOR_PI = 3.14159;
        double area_Triangulo = valor_A*valor_C / 2;
        double area_Circulo = VALOR_PI*(Math.pow(valor_C, 2));
        double area_Trapezio = (valor_A + valor_B)*valor_C / 2;
        double area_Quadrado = Math.pow(valor_B, 2); // lado vezes lado lado ao quadrado
        double area_Retangulo = valor_A*valor_B;
        System.out.printf ("TRIANGULO: %.3f\n", area_Triangulo);
        System.out.printf ("CIRCULO: %.3f\n", area_Circulo);
        System.out.printf ("TRAPEZIO: %.3f\n", area_Trapezio);
        System.out.printf ("QUADRADO: %.3f\n", area_Quadrado);
        System.out.printf ("RETANGULO: %.3f\n", area_Retangulo);
        scanner.close();
    }

}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble();
        final double VALOR_PI = 3.14159;
        double area_Triangulo = valor_A*valor_C / 2;
        double area_Circulo = VALOR_PI*(Math.pow(valor_C, 2));
        double area_Trapezio = (valor_A + valor_B)*valor_C / 2;
        double area_Quadrado = Math.pow(valor_B, 2);
        double area_Retangulo = valor_A*valor_B;
        System.out.printf ("TRIANGULO: %.3f\n", area_Triangulo);
        System.out.printf ("CIRCULO: %.3f\n", area_Circulo);
        System.out.printf ("TRAPEZIO: %.3f\n", area_Trapezio);
        System.out.printf ("QUADRADO: %.3f\n", area_Quadrado);
        System.out.printf ("RETANGULO: %.3f\n", area_Retangulo);
        scanner.close();
    }
}