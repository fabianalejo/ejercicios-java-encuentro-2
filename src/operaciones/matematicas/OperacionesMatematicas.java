/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operaciones.matematicas;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class OperacionesMatematicas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Declaramos las variables
        int num1;
        int num2;
        
        Scanner obj= new Scanner(System.in);
        
        System.out.println("ingrese numero 1");
        num1= obj.nextInt();
        
        System.out.println("ingrese numero 2");
        num2= obj.nextInt();

 
        /*Realizamos las operaciones.
         * Tambien lo podemos guardar el resultado en variables. */
 
        System.out.println("El resultado de la suma es "+(num1+num2));
 
        System.out.println("El resultado de la resta es "+(num1-num2));
 
        System.out.println("El resultado de la multiplicación es "+(num1*num2));
 
        System.out.println("El resultado de la división es "+(num1/num2));
        
    }
    
}
