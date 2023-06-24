public class Alumno {
    
    private String nombre;
    private String apellido;
    private final double[] notas = new double[3];

    public Alumno(String nombre, String apellido, double not1, double not2, double not3) {
        this.nombre = nombre;
        this.apellido = apellido;
        notas[0] = not1;
        notas[1] = not2;
        notas[2] = not3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public double getPromedio(){
        double total = 0;

        for (double nota : notas){
            total+=nota;
        }
        return total/notas.length;
    }

    
    

    


}
