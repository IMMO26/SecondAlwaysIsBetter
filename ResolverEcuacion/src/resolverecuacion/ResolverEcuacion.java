/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package resolverecuacion;

import java.util.Scanner;

public class ResolverEcuacion {

    public static void main(String[] args) {
    Scanner Temp=new Scanner(System.in);
        System.out.print("Ingrese el valor de su variable: ");
    int x=Temp.nextInt();
    double xCuadrado= Math.pow(x,2);
    double xCubica=Math.pow(x,3);
    double xCubicaInv=Math.pow(x,-3);
    double numerador=2*xCubicaInv +5*xCuadrado-8*x; 
    double denominador=Math.sqrt(9*xCubica-2*xCuadrado+x);
    double resultado=numerador/denominador;
    if(resultado>-1 && resultado<1){
        System.out.println("El resultado es: "+resultado);
    }else{
        System.out.println("El resultado no esta dentro del rango permitido");
    }
    }
    
}
