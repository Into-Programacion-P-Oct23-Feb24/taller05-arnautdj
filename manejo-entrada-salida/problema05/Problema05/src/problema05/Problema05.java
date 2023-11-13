/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema05;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        double netflix;
        double yt;
        double dropbox;
        double spotify;
        int edad;
        double total;
        
        System.out.println("Ingrese el valor mensual de Netflix:");
        netflix = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de Youtube Premium:");
        yt = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de Dropbox:");
        dropbox = entrada.nextDouble();
        System.out.println("Ingrese el valor mensual de Spotify:");
        spotify = entrada.nextDouble();
        System.out.println("Ingrese su edad en años:");
        edad = entrada.nextInt();
        
        total = netflix + yt + dropbox + spotify;
        
        if (edad < 30) {
            total = total * 0.8;
        }
        
        System.out.println("El valor mensual total a pagar por sus servicios " 
                + "digitales es de: $" + total); 
       
    }
    
}
