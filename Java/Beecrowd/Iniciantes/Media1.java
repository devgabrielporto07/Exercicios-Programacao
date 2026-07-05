// IntelliJ:
package desafiosbeecrowd;
import java.util.Scanner;
import java.util.Locale;
// Media Ponderada
public class Media1 {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final double peso_A = 3.5; // constante peso
        final double peso_B = 7.5; // constante peso
        double soma_Pesos = peso_A + peso_B;
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double media_ValoresAB = ((valor_A*peso_A) + (valor_B*peso_B)) / (soma_Pesos);
        System.out.printf ("MEDIA = %.5f\n", media_ValoresAB);
    }
}

// Terminal Beecrowd:
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String []args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final double peso_A = 3.5;
        final double peso_B = 7.5;
        double soma_PesoAB = peso_A + peso_B;
        double valor_A = scanner.nextDouble();
        double valor_B = scanner.nextDouble();
        double media_ValoresAB = ((valor_A*peso_A) + (valor_B*peso_B)) / (soma_PesoAB);
        System.out.printf ("MEDIA = %.5f\n", media_ValoresAB);
    }
}