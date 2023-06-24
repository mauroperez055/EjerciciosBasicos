

public class App {
    
    public static void main(String[] args) throws Exception {
        
       Triangulo t = new Triangulo(4,5,6);

       double area = t.calc_area();

       System.out.println("El area es: " + area);
    }
}
