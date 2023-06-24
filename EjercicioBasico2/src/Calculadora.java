public class Calculadora {
    
    public int e1, e2;
    public float f1, f2;

    
    //constuctor con enteros
    public Calculadora(int e1, int e2) {
        this.e1 = e1;
        this.e2 = e2;
    }
    
    //constructor con flotantes
    public Calculadora(float f1, float f2){
        this.f1 = f1;
        this.f2 = f2;
    }
    
    //metodo sumar enteros
    public int sumarEntero(int s1, int s2){
        return s1+s2;    
    }
    
    //metodo sumar flotantes
    public float sumarFlotante(float f1, float f2){
        return f1+f2;
    }
    
    //metodo restar enteros
    public int restarEnteros(int nro1, int nro2){
        return nro1-nro2;
    }
    
    //metodo restar flotantes
    public float restarFLotante(float f1, float f2){
        return f1-f2;
    }
    
    //metodo multiplicar enteros
    public int multiEntero(int s1, int s2){
        return s1*s2;    
    }
    
    //metodo multiplicar flotantes
    public float multiFlotante(float f1, float f2){
        return f1*f2;
    }
    
    //metodo dividir enteros
    public float dividirEntero(int s1, int s2){
        return (float) s1/s2;    
    }
    
    //metodo dividir flotantes
    public float dividirFlotante(float f1, float f2){
        return f1/f2;
    }  

}
