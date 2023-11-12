/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema1;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double costoHora;
        double kvConsumidos;
        int edad;
        double total;
        
        System.out.println("Ingrese el valor del costo de Kilovatio por hora");
        costoHora = entrada.nextDouble();
        System.out.println("Ingrese el numero de Kilovatios consumidos en el mes");
        kvConsumidos = entrada.nextDouble();
        System.out.println("Ingrese su edad");
        edad = entrada.nextInt();
        
        total = costoHora * kvConsumidos;
        
        if (edad >= 65) {
            System.out.println("El valor mensual a pagar es de: $" + total*0.9);
        } else {
            System.out.println("El valor mensual a pagar es de: $" + total);
        }
        
    }
    
}
