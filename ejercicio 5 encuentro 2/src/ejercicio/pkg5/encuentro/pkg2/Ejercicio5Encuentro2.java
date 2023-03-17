/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg5.encuentro.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio5Encuentro2 {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static void main(String[] args) {
        
        int numero1, doble, triple;
        double numero1_convertido,raiz;
        
        // TODO code application logic here
        Scanner obj= new Scanner(System.in);
        
        System.out.println("ingrese numero");
        numero1= Integer.parseInt(obj.next());
        
        doble=numero1*numero1;
        
        triple=numero1*numero1*numero1;
        
        numero1_convertido= (double) numero1;
        
        //numero1_convertido=Double.parseDouble(obj.next());
        
        raiz=Math.sqrt(numero1_convertido);
        
        System.out.println(" operacion funcion cuadrada  " +doble );
        
        System.out.println(" operacion funcion cubica  " +triple );
        
        System.out.println(" operacion funcion raiz cuadrada  " +raiz );
        
        
        
        
        
        

        
        
    }
    
}
