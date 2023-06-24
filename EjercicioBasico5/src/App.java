import java.time.LocalDate;
import java.time.Period;

public class App {
    public static void main(String[] args) throws Exception {
        
        LocalDate fechaNac;
        fechaNac = LocalDate.of(1995, 02, 23);
                
        calculaEdad(fechaNac);
    }

    public static void calculaEdad(LocalDate fechaNac){

        LocalDate fechaHoy;
        Period periodo;
        int edad;

        fechaHoy = LocalDate.now();
        periodo = Period.between(fechaNac, fechaHoy);
        edad = periodo.getYears();
        System.out.println("La edad es: " + edad + " años.");
    }
}
