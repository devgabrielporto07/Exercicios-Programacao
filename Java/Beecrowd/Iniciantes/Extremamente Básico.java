// No meu IntelliJ:

package desafiosbeecrowd;
import java.util.Scanner;
// lê dados do teclado (input)
public class ExtremamenteBasico {
    public static void main (String []args) {
    Scanner scanner = new Scanner (System.in);
    int valor_1 = scanner.nextInt();
    int valor_2 = scanner.nextInt();
    int valor_X = valor_1 + valor_2;
    System.out.println("X = "+valor_X);
    scanner.close();
    }
}


// Terminal do Beecrowd:

import java.io.IOException;
import java.util.Scanner;
public class Main {
 
    public static void main(String[] args) throws IOException {
    Scanner scanner = new Scanner (System.in);
    int valor_1 = scanner.nextInt();
    int valor_2 = scanner.nextInt();
    int valor_X = valor_1 + valor_2;
    System.out.println("X = " + valor_X);
    scanner.close();
    }
 
}
