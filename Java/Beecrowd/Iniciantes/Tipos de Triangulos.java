// IntelliJ ou Eclipse:

package desafiosbeecrowdpratica;
import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class TiposTriangulos {
	public static void main (String [] args) {
		Locale.setDefault (Locale.US);
		Scanner scanner = new Scanner (System.in);
		double valor_A = scanner.nextDouble(); // MAIOR
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble(); // MENOR
        double [] valoresABC = {valor_A, valor_B, valor_C};
        Arrays.sort(valoresABC);
        // System.out.println (valoresABC); // Referência para o hardware e software não legível para a forma humana
        // System.out.println (Arrays.toString(valoresABC));  // Referência para Legibilidade Humana    
        // Conditions:
        if (valoresABC [2] >= valoresABC[1] + valoresABC[0]) {
        	System.out.println ("NAO FORMA TRIANGULO");
        }
        else {
        	if (valoresABC[2]*valoresABC[2] == valoresABC [1]*valoresABC [1] + valoresABC[0]*valoresABC[0]) {
        		System.out.println("TRIANGULO RETANGULO");
        	}
        	if (valoresABC[2]*valoresABC[2] > valoresABC[0]*valoresABC[0] + valoresABC[1]*valoresABC[1]) {
        		System.out.println ("TRIANGULO OBTUSANGULO");
        	}
        	if (valoresABC[2]*valoresABC[2] < valoresABC[0]*valoresABC[0] + valoresABC[1]*valoresABC[1]) {
        		System.out.println ("TRIANGULO ACUTANGULO");
        	}
        	if (valoresABC[2] == valoresABC [1] && valoresABC [2] == valoresABC[0] && valoresABC[1] == valoresABC[0]) {
        		System.out.println ("TRIANGULO EQUILATERO");
        	}
        	if (valoresABC[2] == valoresABC[1] && valoresABC[2] != valoresABC[0] || valoresABC[0] == valoresABC[1] && valoresABC[0] != valoresABC[2]) {
        		System.out.println ("TRIANGULO ISOSCELES");
        	}
       }
        scanner.close ();
	}
}

// Terminal Beecrowd:

import java.util.Locale;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main (String [] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner (System.in);
        double valor_A = scanner.nextDouble(); 
        double valor_B = scanner.nextDouble();
        double valor_C = scanner.nextDouble(); 
        double [] valoresABC = {valor_A, valor_B, valor_C};
        Arrays.sort(valoresABC);
        if (valoresABC [2] >= valoresABC[1] + valoresABC[0]) {
        	System.out.println ("NAO FORMA TRIANGULO");
        }
        else {
        	if (valoresABC[2]*valoresABC[2] == valoresABC [1]*valoresABC [1] + valoresABC[0]*valoresABC[0]) {
        	System.out.println("TRIANGULO RETANGULO");
        	}
        	if (valoresABC[2]*valoresABC[2] > valoresABC[0]*valoresABC[0] + valoresABC[1]*valoresABC[1]) {
        	System.out.println ("TRIANGULO OBTUSANGULO");
        	}
        	if (valoresABC[2]*valoresABC[2] < valoresABC[0]*valoresABC[0] + valoresABC[1]*valoresABC[1]) {
        	System.out.println ("TRIANGULO ACUTANGULO");
        	}
        	if (valoresABC[2] == valoresABC [1] && valoresABC [2] == valoresABC[0] && valoresABC[1] == valoresABC[0]) {
        	System.out.println ("TRIANGULO EQUILATERO");
        	}
        	if (valoresABC[2] == valoresABC[1] && valoresABC[2] != valoresABC[0] || valoresABC[0] == valoresABC[1] && valoresABC[0] != valoresABC[2]) {
        	System.out.println ("TRIANGULO ISOSCELES");
        	}
       }
        scanner.close();
    }
}
