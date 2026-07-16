// Intellij:

package desafiosbeecrowd;
import java.util.Locale;
import java.util.Scanner;
public class GastoDeCombustivel {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        // Autonomia do carro 12 Km / L 12 km para 1 Litro
        final double autonomia_Automovel = 12;
        int tempo_Viagemhoras = scanner.nextInt();
        int velocidade_MediaKmhora = scanner.nextInt();
        double distancia_Total = tempo_Viagemhoras*velocidade_MediaKmhora;
        double quantidade_Litros = distancia_Total / autonomia_Automovel;
        System.out.printf ("%.3f\n", quantidade_Litros);
    }
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        // Autonomia do carro 12 Km / L 12 km para 1 Litro
        final double autonomia_Automovel = 12;
        int tempo_Viagemhoras = scanner.nextInt();
        int velocidade_MediaKmhora = scanner.nextInt();
        double distancia_Total = tempo_Viagemhoras*velocidade_MediaKmhora;
        double quantidade_Litros = distancia_Total / autonomia_Automovel;
        System.out.printf ("%.3f\n", quantidade_Litros);
    }
}