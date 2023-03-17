/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg1.encuentro.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio1Encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2, resultado;
        
        Scanner obj= new Scanner(System.in);
        
        System.out.println("ingrese primer numero");
        num1= Integer.parseInt(obj.next());
        
        System.out.println("ingrese segundo numero");
        num2= Integer.parseInt(obj.next());
        
        resultado=num1+num2;
        
        System.out.println(" el resultado de la suma de dos numeros es " +resultado );
        
        
        
        
    }
    
}
