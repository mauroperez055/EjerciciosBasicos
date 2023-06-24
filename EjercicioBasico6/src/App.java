public class App {
    public static void main(String[] args) throws Exception {
        
        Alumno alu;

        alu = new Alumno("Mauro", "Perez", 7, 8, 10);

        System.out.println("Nombre: " + alu.getNombre());
        System.out.println("Apellido: " + alu.getApellido());
        System.out.println("Promedio: " + alu.getPromedio());
    }
}
