// IntelliJ:

package desafiosbeecrowd;
import java.util.Locale;  // Importação para o ponto decimal
import java.util.Scanner;
public class AreaCirculo {
    public static void main (String []args) {
        Locale.setDefault(Locale.US); // antes do Scanner nascer temos que definir o Locale
        Scanner scanner = new Scanner(System.in);
        double valor_Pi = 3.14159;
        double raio_User = scanner.nextDouble(); // ou nextFloat();
        double area_Circulo = valor_Pi * (Math.pow(raio_User, 2)); // ou double area_Circulo = valor_Pi*(raio_User*raio_User);
        System.out.printf ("A=%.4f\n", area_Circulo); // Imprimir uma linha no final printf e formatar usando % \n pulando a linha
//       String area_CirculoFormat = String.format("%.4f", area_Circulo); //  outra forma de formatar valores em Java com casas decimais
        scanner.close();
    }
}
// Biblioteca math built in do Java
// O Math.pow serve para fazer a exponenciação

// Terminal do Beecrowd:

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);
        double valor_Pi = 3.14159;
        double raio_User = scanner.nextDouble(); 
        double area_Circulo = valor_Pi*(Math.pow(raio_User, 2)); 
        System.out.printf ("A=%.4f\n", area_Circulo);
        
    }
}