public class Division {
    
   public double division(int num1, int num2){

    double resultado;

    try {
        resultado = num1/num2;
        System.out.println("===========================");
        System.out.println("El resultado es: " + resultado);
        System.out.println("===========================");
    } catch (ArithmeticException e) {
        System.out.println("==================================");
        System.out.println("No es posible la division por cero");
        System.out.println("==================================");
        resultado = 0;
    }
    return resultado;
   }
}
