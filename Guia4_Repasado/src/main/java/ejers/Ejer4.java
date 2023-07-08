package ejers;

import java.util.Scanner;

/**
 * @author Alee
 */
public class Ejer4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        System.out.println(primo(num));
    }

    public static boolean primo(int num) {
        int cont = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                cont++;
            }
        }

        if (cont == 2) {
            return true;
        }
        if (num <= 1) {
            return false;
        }
        return false;
    }

}
