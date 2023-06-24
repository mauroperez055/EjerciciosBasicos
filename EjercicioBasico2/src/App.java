import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        int nro1 = 0, nro2 = 0;
        float num1 = 0, num2 = 0;
        int op, opcion;

        Calculadora n1 = new Calculadora(nro1, nro2);
        
        Scanner leer = new Scanner(System.in);
        
        do{
            menu();//menu de la calculadora

            op = controlOpcionMenu();//controlo la eleccion
            
            
            switch( op ){
                
                case 1:
                    
                    suma();//procedimiento que muestra el menu para sumar
                    
                    opcion = controlOpcion();//controlo lo que elije
                    

                    if (opcion==1){
                        System.out.println("Ingrese el 1er numero");
                        nro1 = leer.nextInt();
                        System.out.println("Ingrese el 2do numero");
                        nro2 = leer.nextInt();
                        
                        System.out.println("El resultado es: " + n1.sumarEntero(nro1, nro2) );
                        System.out.println("");
                        pause();

                    }
                    else{
                        System.out.println("Ingrese el 1er numero");
                        num1 = leer.nextFloat();
                        System.out.println("Ingrese el 2do numero");
                        num2 = leer.nextFloat();
                        
                        System.out.println("El resultado es: " + n1.sumarFlotante(num1, num2) );
                        System.out.println("");
                        pause();

                    }
                    break;
                case 2:
                    
                    resta();//procedimiento que muestra el menu para restar
                    
                    opcion = leer.nextInt();
                    
                    if (opcion==1){
                        System.out.println("Ingrese el 1er numero");
                        nro1 = leer.nextInt();
                        System.out.println("Ingrese el 2do numero");
                        nro2 = leer.nextInt();
                        
                        System.out.println("El resultado es: " + n1.restarEnteros(nro1, nro2) );
                        System.out.println("");
                        pause();

                    }
                    else{
                        System.out.println("Ingrese el 1er numero");
                        num1 = leer.nextFloat();
                        System.out.println("Ingrese el 2do numero");
                        num2 = leer.nextFloat();
                        
                        System.out.println("El resultado es: " + n1.restarFLotante(num1, num2) );
                        System.out.println("");
                        pause();

                    }
                    break;
                case 3:
                    
                    multiplicar();
                    
                    opcion = leer.nextInt();
                    
                    if (opcion==1){
                        System.out.println("Ingrese el 1er numero");
                        nro1 = leer.nextInt();
                        System.out.println("Ingrese el 2do numero");
                        nro2 = leer.nextInt();
                        
                        System.out.println("El resultado es: " + n1.multiEntero(nro1, nro2) );
                        System.out.println("");
                        pause();
                        
                    }
                    else {
                        System.out.println("Ingrese el 1er numero");
                        num1 = leer.nextFloat();
                        System.out.println("Ingrese el 2do numero");
                        num2 = leer.nextFloat();
                        
                        System.out.println("El resultado es: " + n1.multiFlotante(num1, num2) );
                        System.out.println("");
                        pause();
                                                
                    }
                        
                    
                    break;
                case 4:
                    
                    dividir();
                    
                    opcion = leer.nextInt();
                    
                    if (opcion==1){
                        System.out.println("Ingrese el 1er numero");
                        nro1 = leer.nextInt();
                        System.out.println("Ingrese el 2do numero");
                        nro2 = leer.nextInt();
                        
                        System.out.println("El resultado es: " + n1.dividirEntero(nro1, nro2) );
                        System.out.println("");
                        pause();

                    }
                    else{
                        System.out.println("Ingrese el 1er numero");
                        num1 = leer.nextFloat();
                        System.out.println("Ingrese el 2do numero");
                        num2 = leer.nextFloat();
                        
                        System.out.println("El resultado es: " + n1.dividirFlotante(num1, num2) );
                        System.out.println("");
                        pause();

                    }
                    break;
                case 5:
                    System.out.println("Saliendo...");
                    pause();
                    break;
                /*default:
                    System.out.println("Opcion no valida!");
                    pause();
                    break;*/
                    
            }                    
            
        }
        while(op != 5);
    }
    
    
    //MENU
    public static void menu(){
        
        System.out.println("*************************************");
        System.out.println("             CALCULADORA             ");
        System.out.println("*************************************");
        System.out.println("ELija la operacion que desea realizar");
        System.out.println("-------------------------------------");
        System.out.println("1- SUMAR");
        System.out.println("2- RESTAR");
        System.out.println("3- MULTIPLICAR");
        System.out.println("4- DIVIDIR");
        System.out.println("5- SALIR");
        System.out.println("*************************************");
        System.out.println("");
        
    }
    //procedimiento para mostrar menu SUMA
    public static void suma(){
        
        System.out.println("********SUMA********");
        System.out.println("ELija el tipo de numero que desea sumar");
        System.out.println("1- Enteros");
        System.out.println("2- Decimales");
        System.out.println("********************");
    }
    
        //procedimiento para mostrar menu RESTA
    public static void resta(){
        
        System.out.println("********RESTA********");
        System.out.println("ELija el tipo de numero que desea restar");
        System.out.println("1- Enteros");
        System.out.println("2- Decimales");
        System.out.println("********************");
    }
      
        //procedimiento para mostrar menu MULTIPLICACION
    public static void multiplicar(){
        
        System.out.println("********MULTIPLICACION********");
        System.out.println("ELija el tipo de numero que desea multiplicar");
        System.out.println("1- Enteros");
        System.out.println("2- Decimales");
        System.out.println("******************************");
    }
    
        //procedimiento para mostrar menu DIVISION
    public static void dividir(){
        
        System.out.println("********DIVISION********");
        System.out.println("ELija el tipo de numero que desea dividir");
        System.out.println("1- Enteros");
        System.out.println("2- Decimales");
        System.out.println("************************");
    }

    //procedimiento para que pida tecla
    public static void pause(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Presiones una tecla para continuar...");
        System.out.println("");
        leer.nextLine();
    }
    
    //funcion para controlar la eleccion de las opciones del menu
    public static int controlOpcionMenu(){
        
        Scanner leer = new Scanner (System.in);
        int op = 0;
        
      try{
          System.out.println("Elija una opcion del menu");
          op = leer.nextInt();
          
          while (op<1 || op>5){
              System.out.println("Opcion no valida!, vuelva a elejir");
              op = leer.nextInt();
          }
          return op;
          
      }catch(Exception e){
          System.out.println("");
          System.out.println("Ingreso una opcion no valida, vuelva a intentarlo");
          System.out.println("");
      }
        return op;
    }    

    
    //funcion para controlar la eleccion del tipo de numero
    public static int controlOpcion(){
        
        Scanner leer = new Scanner (System.in);
        int opcion = 0;
        
      try{
          System.out.println("Elija el tipo que quiere operar");
          opcion = leer.nextInt();
          
          while (opcion<1 || opcion>3){
              System.out.println("Opcion no valida!, vuelva a elejir");
              opcion = leer.nextInt();
          }
          return opcion;
          
      }catch(Exception e){
          System.out.println("");
          System.out.println("Ingreso una opcion no valida, vuelva a intentarlo");
          System.out.println("");
      }
        return opcion;
    
    }
}
