/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema03;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costoMin;
        int mins;
        double total;
        
        System.out.println("Ingrese el costo por minuto de llamada:");
        costoMin = entrada.nextDouble();
        System.out.println("Ingrese el número de minutos consumidos en el mes");
        mins = entrada.nextInt();
        
        total = costoMin * mins;
        
        System.out.println("El valor de la planilla de teléfono es de: $" 
        + total);
    }
    
}
