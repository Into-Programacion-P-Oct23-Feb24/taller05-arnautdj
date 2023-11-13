/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema04;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double cpu;
        double keyboard;
        double screen;
        double mouse;
        
        System.out.println("Ingrese el costo del CPU:");
        cpu = entrada.nextDouble();
        System.out.println("Ingrese el costo del Teclado:");
        keyboard = entrada.nextDouble();
        System.out.println("Ingrese el costo de la Pantalla:");
        screen = entrada.nextDouble();
        System.out.println("Ingrese el costo del Ratón:");
        mouse = entrada.nextDouble();
        
        System.out.println("El precio total de la computadora es de: $" 
        + (cpu + keyboard + screen + mouse));
    }
    
}
