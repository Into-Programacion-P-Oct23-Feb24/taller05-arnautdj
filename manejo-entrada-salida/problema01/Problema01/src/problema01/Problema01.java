/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double base;
        double alto;
        double area;
        
        System.out.println("Ingrese la base del triángulo:");
        base = entrada.nextDouble();
        System.out.println("Ingrese la altura del triángulo:");
        alto = entrada.nextDouble();
        
        area = (base * alto) / 2;
        
        System.out.println("El área del triángulo es igual a: " + area);
        
    }
    
}
