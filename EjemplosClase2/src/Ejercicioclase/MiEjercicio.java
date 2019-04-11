/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicioclase;

import static java.time.Clock.system;
import java.util.Scanner;

/**
 *
 * @author rober
 */
public class MiEjercicio {
    public static void main(String[] args) {
    Scanner entrada= new Scanner(System.in);
    String nombre;
    String apellido;
    String ciudad;
    String pais;
    int edad;
    int nota1;
    int nota2;
    double promedio;
    //entrada de datos
    System.out.println("Ingrese sus nombres: ");
        nombre = entrada.nextLine();
    System.out.println("Ingrese sus apellidos: ");
        apellido = entrada.nextLine();
    System.out.println("Ingrese su edad: ");    
        edad = entrada.nextInt();
    System.out.println("Ingrese su ciudad: ");
    entrada.nextLine(); // limpieza del buffer de entrada de datos
        ciudad = entrada.nextLine();
    System.out.println("Ingrese su pais: ");
        pais = entrada.nextLine();
    System.out.println("ingrese sus notas: ");
        nota1= entrada.nextInt();
        nota2 = entrada.nextInt();
    promedio= ((nota1 + nota2)/2);
    //salida de datos
        System.out.printf("Su nombre y apellidos:%s %s \nEdad: %s\nCiudad: %s\n"
                + "Pais: %s\nNotas: %s , %s\nPromedio: %s ", nombre, apellido, edad, ciudad, pais, nota1, nota2, promedio);
              
   
            
    
    
    
    
    }
}
