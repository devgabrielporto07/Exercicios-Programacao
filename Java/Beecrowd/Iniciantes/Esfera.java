// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class Esfera {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final double PI = 3.14159;
        double raio_Esfera = scanner.nextDouble();
        double volume_Esfera = ((double) 4/3)*(PI)*(Math.pow(raio_Esfera, 3)); // dois numeros integer resulta em um integer java
//      Sem o (double): O Java faz uma divisão inteira \(4 \div 3 = 1\).Com o (double): O Java converte o valor para \(4.0 \div 3 = 1.333...\).
        System.out.printf ("VOLUME = %.3f\n", volume_Esfera);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        final double PI = 3.14159;
        double raio_Esfera = scanner.nextDouble();
        double volume_Esfera = ((double) 4/3)*(PI)*(Math.pow(raio_Esfera, 3));
        System.out.printf ("VOLUME = %.3f\n", volume_Esfera);
    }
}
