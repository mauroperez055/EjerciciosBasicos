import java.time.LocalDate;

public class Empleado {
    
    String nombre;
    float salario;
    String puesto;
    LocalDate fecha_contratacion;

    public Empleado(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(String nombre, float salario, String puesto) {
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
    }

    public Empleado(String nombre, float salario, String puesto, LocalDate fecha_contratacion) {
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
        this.fecha_contratacion = fecha_contratacion;
    }  
    
}
