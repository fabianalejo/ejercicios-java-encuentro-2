/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg4.encuentro.pkg2;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio4Encuentro2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        float numero, conver_F;
        
        Scanner obj= new Scanner(System.in);
        
        System.out.println("ingrese temperatura a convertir");
        numero= Float.parseFloat(obj.next());
        
        conver_F=32+(9*numero/5);
        
        System.out.println(" La temperatura ingresada convertida a grados Farenheit ees  " +conver_F);

        // TODO code application logic here
    }
    
}
