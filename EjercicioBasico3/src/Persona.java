public class Persona {
    
    String nombre;
    int edad;
    static int cantidad_personas;


    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidad_personas++;
    }

    public static int getCantidad(){
        return cantidad_personas;
    }
   

}
