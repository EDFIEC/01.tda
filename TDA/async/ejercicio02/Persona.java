package async.ejercicio02;

/**
 * La clase {@code Persona} representa a una persona con un nombre y un apellido.
 * Proporciona métodos para acceder y modificar dichos atributos.
 * 
 * <p>Ejemplo de uso:
 * <pre>
 *     Persona p = new Persona("Ana", "García");
 *     System.out.println(p); // Imprime: Hola, soy Ana García
 * </pre>
 * </p>
 * 
 * @author Allan Avendaño
 * @version 1.0
 */
public class Persona {
    
    /** El nombre de la persona. */
    private String nombre;

    /** El apellido de la persona. */
    private String apellido;

    /**
     * Crea una nueva instancia de {@code Persona} con el nombre y apellido dados.
     *
     * @param nombre el nombre de la persona
     * @param apellido el apellido de la persona
     */
    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    /**
     * Establece el nombre de la persona.
     *
     * @param nombre el nuevo nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Establece el apellido de la persona.
     *
     * @param apellido el nuevo apellido
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Devuelve el nombre de la persona.
     *
     * @return el nombre
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Devuelve el apellido de la persona.
     *
     * @return el apellido
     */
    public String getApellido() {
        return this.apellido;
    }

    /**
     * Devuelve una representación textual de la persona.
     *
     * @return una cadena en el formato "Hola, soy [nombre] [apellido]"
     */
    @Override
    public String toString() {
        return "Hola, soy " + this.getNombre() + " " + this.getApellido();
    }
}
