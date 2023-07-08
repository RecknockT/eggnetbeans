package ejers;

import java.util.Scanner;

/**
 * @author Alee
 */
public class Ejer2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cantidad de personas?");
        int personas = leer.nextInt();
        promedio(personas);
    }

    public static void promedio(int num) {
        Scanner leer = new Scanner(System.in);
        int edad;
        String nombre;
        String respuesta;
        for (int i = 0; i < num; i++) {
            System.out.println("Nombre de la persona " + i);
            nombre = leer.next();
            System.out.println("Ingrese la edad de la persona " + i);
            edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println(nombre + " es mayor de edad.");
            } else {
                System.out.println(nombre + " es menor de edad.");
            }

            System.out.println("Quiere seguir mostrando personas?si/no");
            respuesta = leer.next();
            if (respuesta.equalsIgnoreCase("NO")) {
                break;

            }
        }
    }
}
