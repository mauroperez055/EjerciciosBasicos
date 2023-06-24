import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        Empleado emple = new Empleado("Mauro", 150000);
        
        System.out.println("Nombre: " + emple.nombre);
        System.out.println("Salario: " + emple.salario);
        System.out.println("");
        
        emple = new Empleado("Mauro", 150000, "Ingeniero");
        
        System.out.println("Nombre: " + emple.nombre);
        System.out.println("Salario: " + emple.salario);
        System.out.println("Puesto: " + emple.puesto);
        System.out.println("");
        
        emple = new Empleado("Mauro", 150000, "Ingeniero", LocalDate.of(2010, 03, 19));
        
        System.out.println("Nombre: " + emple.nombre);
        System.out.println("Salario: " + emple.salario);
        System.out.println("Puesto: " + emple.puesto);
        System.out.println("Fecha de ingreso: " + emple.fecha_contratacion);
        System.out.println("");
        
    }
}
