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
public class EjemplosClase22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // No olvidar el espacio antes de los Slash para el comentario 

        String nombre;
        String apellido;
        int edad;
        String ciudad;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Porfavor ingresar sus nombres: ");
        nombre = entrada.nextLine();

        System.out.println("Porfavor ingresar sus apellidos: ");
        apellido = entrada.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = entrada.nextInt();
        System.out.println("Ingrese su ciudad: ");
        entrada.nextLine(); // limpieza del buffer de entrada de datos
        ciudad = entrada.nextLine();

        System.out.println("Su nombre es: " + nombre + "\n\n");
        System.out.println("\t Su apellido es: " + apellido + " ,edad: " + edad);
        System.out.println("\n Ciudad: " + ciudad);

    }

}
