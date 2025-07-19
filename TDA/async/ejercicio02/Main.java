package async.ejercicio02;

/**
 * Clase Main
 *  
 * @author Allan Avendaño
 * @version 1.0
 */

public class Main {
    
    /**
     * Complete las instrucciones dentro de los comentarios de la función main
     *
     * @param args[] argumentos para ejecutar la función
     * @return void
     */
    public static void main(String args[]) {

        System.out.println("\nEjercicio 02:\n");

        /* POR COMPLETAR: el tipo de dato para la variable edad */
        Persona alumno01 = new Persona("Juan", "Martínez");
        System.out.println(alumno01.toString());

        /* POR COMPLETAR: el tipo de dato y el valor de la variable edad con su información */
        int edad = 38;
        System.out.println("Tengo "+edad+" años");
        
        /* POR COMPLETAR: el tipo de dato y el valor de la variable ciudad con su información */
        String ciudad = "Durán";
        System.out.println("Vivo en "+ciudad);

    }

}
