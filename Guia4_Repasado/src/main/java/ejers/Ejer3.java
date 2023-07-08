package ejers;

import java.util.Scanner;

/**
 * @author Alee
 */
public class Ejer3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de euros a cambiar");
        double euro = leer.nextDouble();
        convertir(euro);
    }

    public static void convertir(double euro) {

        String libra = String.valueOf(euro * 0.86);
        String dolares = String.valueOf(euro * 1.2861);
        String yenes = String.valueOf(euro * 129.852);
        System.out.println("El cambio en libras es: " + libra);
        System.out.println("El cambio en dolares es: " + dolares);
        System.out.println("El cambio en yenes es: " + yenes);

    }
}
