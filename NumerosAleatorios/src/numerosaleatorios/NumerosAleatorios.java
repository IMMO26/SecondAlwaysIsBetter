package numerosaleatorios;
public class NumerosAleatorios {
    public static void main(String[] args) {
        int valorAleatorio1 = (int) (Math.floor(Math.random()*(100+1)));
        System.out.println("El primer numero aleatorio es: "+valorAleatorio1);
        int valorAleatorio2 = (int) (Math.floor(Math.random()*(100+1)));
        System.out.println("El segundo numero aleatorio es: "+valorAleatorio2);       
        int valorAleatorio3 = (int) (Math.floor(Math.random()*(100+1)));
        System.out.println("El tercer numero aleatorio es: "+valorAleatorio3);       
        int valorAleatorio4 = (int) (Math.floor(Math.random()*(100+1)));
        System.out.println("El cuarto numero aleatorio es: "+valorAleatorio4);
        int numeroMayor=valorAleatorio2;
        System.out.println("**********EL PROMEDIO DE LOS NUMEROS ES:*************");
        int promAleatorios=(valorAleatorio1+valorAleatorio2+valorAleatorio3+valorAleatorio4)/4;
        System.out.println(promAleatorios);
        System.out.println("**********EL MAXIMO NUMERO ES:*************");
        if(valorAleatorio1>valorAleatorio2){
            numeroMayor=valorAleatorio1;
        }if(valorAleatorio3>numeroMayor){
            numeroMayor=valorAleatorio3;
        }if(valorAleatorio4>numeroMayor){
            numeroMayor=valorAleatorio4;
        }
         System.out.println(numeroMayor);
        System.out.println("**********EL MINIMO NUMERO ES:*************");
       int numeroMenor = Math.min(Math.min(valorAleatorio1, valorAleatorio2), Math.min(valorAleatorio3, valorAleatorio4));
        System.out.println(numeroMenor);
       }
    
}
