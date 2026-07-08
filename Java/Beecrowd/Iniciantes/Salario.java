// IntelliJ:
package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Salario {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int number_Employee = scanner.nextInt();
        int horas_Trabalhadas = scanner.nextInt();
        double value_Perhour = scanner.nextDouble();
        final double salario_Employee = horas_Trabalhadas*value_Perhour;
        System.out.println ("NUMBER = " + number_Employee);
        System.out.printf ("SALARY = U$ %.2f\n", salario_Employee);
    }
}

// Terminal Beecrowd:
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        int number_Employee = scanner.nextInt();
        int horas_Trabalhadas = scanner.nextInt();
        double value_Perhour = scanner.nextDouble();
        final double salario_Employee = horas_Trabalhadas*value_Perhour;
        System.out.println ("NUMBER = " + number_Employee);
        System.out.printf ("SALARY = U$ %.2f\n", salario_Employee);
    }
}