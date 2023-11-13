/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema02;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double hijo1;
        double hijo2;
        double hijo3;
        
        System.out.println("Ingrese los gastos del primer hijo:");
        hijo1 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del segundo hijo:");
        hijo2 = entrada.nextDouble();
        System.out.println("Ingrese los gastos del tercer hijo:");
        hijo3 = entrada.nextDouble();
        
        System.out.println("El total de gastos de sus hijos es de: $" 
        + (hijo1 + hijo2 + hijo3));
        
    }
    
}
