import java.util.Scanner;

/**
 * Ejercicio 1 - Números positivos y negativos
 *
 * @author Silvia
 * @version 1
 */

public class Ejercicio1 {
    public static void main(String[] args) {

        //Variables
        int num, positivo = 0, negativo = 0;

        //Flujo de entrada
        Scanner sc = new Scanner(System.in);

        //Bucle
        do {
            //Solicitud de número
            System.out.println("Introduce un número: ");
            num = sc.nextInt();

            //Contadores de positivos y negativos
            if (num > 0) {
                positivo++;
            } else if (num < 0) {
                negativo++;
            }

        //Salida al ser 0
        } while (num != 0);

        System.out.println("Ha introducido " + positivo + " números positivos y " + negativo + " números negativos.");
    }
}
