/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete01;
import java.util.Locale;
import java.util.Scanner;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        System.out.println("Ingrese el nombre del hospital 1: ");
        String nombre = entrada.nextLine();
        
        System.out.println("Ingrese el número de camas del hospital 1: ");
        int camasHospital = entrada.nextInt();
        
        System.out.println("Ingrese el presupuesto del hospital 1: ");
        double presupuesto = entrada.nextDouble();
        
        entrada.nextLine();
        Hospital h1 = new Hospital();
        h1.establecerNombre(nombre);
        h1.establecerNumeroCamas(camasHospital);
        h1.establecerPresupuesto(presupuesto);
        
        System.out.println("Ingrese el nombre del hospital 2: ");
        String nombre2 = entrada.nextLine();
        
        Hospital h2 = new Hospital();
        System.out.println("Ingrese el número de camas del hospital 2: ");
        int camasHospital2 = entrada.nextInt();
        
        System.out.println("Ingrese el presupuesto del hospital 2: ");
        double presupuesto2 = entrada.nextDouble();
        
        h2.establecerNombre(nombre2);
        h2.establecerNumeroCamas(camasHospital2);
        h2.establecerPresupuesto(presupuesto2);
        
                        
        System.out.printf("%s \n", "Hola desde el main");
        
        System.out.printf("%s  - %d  -  %.2f\n", h1.obtenerNombre(),
                h1.obtenerNumeroCamas(), h1.obtenerPresupuesto());
        
        System.out.printf("%s  - %d  -  %.2f\n", h2.obtenerNombre(),
                h2.obtenerNumeroCamas(), h2.obtenerPresupuesto());
    }
}
