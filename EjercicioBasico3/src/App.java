
public class App {
    public static void main(String[] args) throws Exception {
        
        
        Persona p1, p2, p3;

        p1 = new Persona("Mauro", 28);
        System.out.println("");
        System.out.println("Persona numero: " + Persona.cantidad_personas + " - " + p1.nombre + " - " + p1.edad + " años.");

        p2 = new Persona("Enzo", 13);
        System.out.println("");
        System.out.println("Persona numero: " + Persona.cantidad_personas + " - " + p2.nombre + " - " + p2.edad + " años.");

        p3 = new Persona("Gabriel", 40);
        System.out.println("");
        System.out.println("Persona numero: " + Persona.cantidad_personas + " - " + p3.nombre + " - " + p3.edad + " años.");
        

    }
}
