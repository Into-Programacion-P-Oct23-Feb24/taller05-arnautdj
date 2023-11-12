/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema4;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);
        
        int numDias;
        double precioDiario;
        double subtotal;
        double descuento = 0;
        double total;
        
        System.out.println("Ingrese el número de días a hospedarse");
        numDias = entrada.nextInt();
        System.out.println("Ingrese el precio diario por habitación");
        precioDiario = entrada.nextDouble();
        
        subtotal = numDias * precioDiario;
        
        if (numDias > 5 && numDias <=10) {
            descuento = subtotal * 0.1;
        } else {
            if (numDias  > 10 && numDias <= 15) {
                descuento = subtotal * 0.15;
            } else {
                if (numDias > 15) {
                    descuento = subtotal * 0.2;
                }
            }
        }
        
        total = subtotal - descuento;
        
        System.out.printf("Subtotal: $%.2f\nDescuento: $%.2f\n"
                + "Total por pagar: $%.2f", subtotal, descuento, total);
        
    }
    
}
