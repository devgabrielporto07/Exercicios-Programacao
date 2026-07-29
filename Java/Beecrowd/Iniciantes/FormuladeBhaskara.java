// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class FormuladeBhaskara {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble();
        double delta_ABC = (Math.pow(valor_B, 2)) - (4*valor_A*valor_C);
        double raiz_1 = ((-1*valor_B) + Math.sqrt(delta_ABC)) / (2*valor_A);
        double raiz_2 = ((-1*valor_B) - Math.sqrt(delta_ABC)) / (2*valor_A);
//        Se liga nas ordem dos if das condicionais e não repetir muitos if pode ser que uma entrada caia em 2 if ou uma condição seja analisada antes
        if (valor_A == 0.0 || delta_ABC < 0) {
            System.out.println ("Impossivel calcular");
        }
        else {
            System.out.printf ("R1 = %.5f\n", raiz_1);
            System.out.printf ("R2 = %.5f\n", raiz_2);
        }
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
        double delta_ABC = (Math.pow(valor_B, 2)) - (4*valor_A*valor_C);
        double raiz_1 = ((-valor_B) + Math.sqrt(delta_ABC)) / (2*valor_A);
        double raiz_2 = ((-valor_B) - Math.sqrt(delta_ABC)) / (2*valor_A);
        if (valor_A == 0.0 || delta_ABC < 0) {
            System.out.println ("Impossivel calcular");
        }
        else {
            System.out.printf ("R1 = %.5f\n", raiz_1);
            System.out.printf ("R2 = %.5f\n", raiz_2);
        }
    }
}