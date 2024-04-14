package areadecilindros;
public class AreaDeCilindros {
    public static void main(String[] args) {
        double r1=4; //Radio del cilindro 1
        double r2=2; //Radio del segundo cilindro
        double l2=5; //Lado del segundo cilindro
        double l1=2.5; //Lado del primero cilindro
        
        double area1= calculoDelAreaCilindro(r1,l1);
        
        double area2= calculoDelAreaCilindro(r2,l2);
        
        System.out.println("El area del primer cilindro es: "+area1);
        System.out.println("El area del segundo cilindro es: "+area2);
        
    }
    
    public static double calculoDelAreaCilindro(double radio, double altura){
        double area=2* Math.PI * radio * (altura + radio); //Area superficial del cilindro
        
        return area;
    }
}
