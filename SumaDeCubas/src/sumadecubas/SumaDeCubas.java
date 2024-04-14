package sumadecubas;
import java.util.Scanner;

public class SumaDeCubas {

    public static void main(String[] args) {
        Scanner Temp= new Scanner(System.in);
        System.out.println("Ingrese el numero de terminos a sumarse: ");
        int numeroDeTerminos= Temp.nextInt();
        double suma=0;
        for(int i=1;i<=numeroDeTerminos;i++){
            double terminos=Math.pow(i,3);
            suma=suma+terminos;
        }
        System.out.println("La suma de los cubos es: "+suma);         
  
    }
    
}
