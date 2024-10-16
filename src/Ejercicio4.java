import java.util.Scanner;

/**
 * Ejercicio 4 - Número válidos y fallidos
 *
 * @author Silvia
 * @version 1
 */

public class Ejercicio4 {
    public static void main(String[] args) {

        //Variables
        int num, ultimo, validos = 0, fallidos = 0;

        //Flujo de entrada
        Scanner sc = new Scanner(System.in);

        //Solicitud de número
        System.out.println("Introduce un número: ");
        num = sc.nextInt();
        //Si el último es más pequeño que el primer número, el primer número será siempre válido
        ultimo = num - 1;

        //Si es 0 terminará
        while (num != 0) {

            //Sí es menor que el último, fallido; si no, se convierte en el último número
            if (num <= ultimo) {
                System.out.println("Número no válido");
                fallidos++;
            } else {
                ultimo = num;
                validos++;
            }

            //Nuevo número
            System.out.println("Introduce un número: ");
            num = sc.nextInt();

        }
        System.out.println("Total de números introducidos (excluyendo el 0): " + (validos+fallidos));
        System.out.println("Total de números fallados: " + fallidos);

    }
}
