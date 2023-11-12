/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String descripcion;
        int cantidadRequerida;
        double precioUnitario;
        double costo;
        
        System.out.println("Ingrese la descripción del artículo");
        descripcion = entrada.nextLine();

        System.out.println("Ingrese la cantidad de artículos a comprar");
        cantidadRequerida = entrada.nextInt();

        System.out.println("Ingrese el precio unitario del artículo");
        precioUnitario = entrada.nextDouble();

        costo = cantidadRequerida * precioUnitario;

        if (cantidadRequerida > 50) {
            costo = costo * 0.85;
        }

        System.out.println("El valor total del pedido es de: $" + costo);
    }
    
}
