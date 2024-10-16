import java.util.Scanner;

/**
 * Opcional 1 - Promedio de las calificaciones
 *
 * @author Silvia
 * @version 1
 */

public class Opcional1 {
    public static void main(String[] args) {

        //Variables
        int num, contador = 0;
        double sumatorio = 0;

        //Flujo de entrada
        Scanner sc = new Scanner(System.in);

        //Solicitud de datos
        System.out.println("Ingrese una calificación (o -1 para terminar): ");
        num = sc.nextInt();

        //Comprobación de fin de bucle (-1)
        while (num != -1) {

            //Entre 1 y 10, se suma y se cuenta el número de notas
            if (num < 11 && num > -1) {
                sumatorio += num;
                contador++;
            } else {
                System.out.println("Calificación inválida. Ingrese una calificación entre 0 y 10.");
            }

            //Nuevo número
            System.out.println("Ingrese una calificación (o -1 para terminar): ");
            num = sc.nextInt();

        }

        System.out.println("El promedio de las calificaciones es: " + (sumatorio / contador));

    }
}
