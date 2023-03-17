/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.encuentro.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio3Encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String cadena,primer_transf, segunda_transf;
        
                
        Scanner obj= new Scanner(System.in);
        
        System.out.println("frase");
        cadena= obj.nextLine();
        
        primer_transf=cadena.toUpperCase();
        
        segunda_transf= cadena.toLowerCase();
        
        System.out.println(" TEXTO INGRESADO EN MAYUSCULAS  " +primer_transf );
        
        
        System.out.println(" texto ingresado en minusculas  " +segunda_transf );
        
        
    }
    
}
