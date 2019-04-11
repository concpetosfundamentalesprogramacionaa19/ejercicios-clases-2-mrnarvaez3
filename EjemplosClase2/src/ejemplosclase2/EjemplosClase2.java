/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplosclase2;

import java.util.Scanner;

/**
 *
 * @author rober
 */
public class EjemplosClase2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // No olvidar el espacio antes de los Slash para el comentario 
        
        String nombre;
        String apellido;
        Scanner entrada = new Scanner(System.in);
         
        System.out.println("Porfavor ingresar sus nombres: ");
        nombre = entrada.next();
        System.out.println("Porfavor Ingresar sus apelldios: ");
        apellido = entrada.next();
        
        nombre = "Roberto";
        apellido = "Narvaez";
        
        System.out.println("Su nombre es: "+nombre+"\n\n");
        System.out.println("\t Su apellido es: "+apellido);
        
    }
    
}
