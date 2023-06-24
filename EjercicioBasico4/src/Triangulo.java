public class Triangulo {
    
   private double l1, l2, l3;

  public Triangulo(double l1, double l2, double l3) {
    this.l1 = l1;
    this.l2 = l2;
    this.l3 = l3;
  }

  public double calc_area(){

    double p = (l1+l2+l3)/2;
    double a = p*(p-l1)*(p-l2)*(p-l3);
    double area = Math.sqrt(a);
    return area;
    
  }



}
