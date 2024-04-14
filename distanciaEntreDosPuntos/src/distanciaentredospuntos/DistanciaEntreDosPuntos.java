package distanciaentredospuntos;
import java.util.Scanner;
public class DistanciaEntreDosPuntos {
    public static void main(String[] args) {
    Scanner Temp=new Scanner(System.in);
    //Definiendo los puntos de la recta:
    int x1;
    int y1;
    int x2;
    int y2;
        System.out.println("Ingrese las primeras coordenadas: ");
        x1= Temp.nextInt();
        y1= Temp.nextInt();
        System.out.println("Ingrese las segundas coordenadas: ");
        x2= Temp.nextInt();
        y2= Temp.nextInt(); 
        
        int x = x2 - x1;
        int y = y2- y1;
        
        double distanciaEntreDosPuntos = Math.sqrt(x*x + y * y);
        
        System.out.println("La distancia de la recta es: "+distanciaEntreDosPuntos);
    }
    

    
}
