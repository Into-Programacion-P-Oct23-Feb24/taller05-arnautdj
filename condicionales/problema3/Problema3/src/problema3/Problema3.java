/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema3;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author santy
 */
public class Problema3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        entrada.useLocale(Locale.US);

        String marca;
        String origen;
        double costo;
        double impuesto;
        double precioVenta;

        System.out.println("Ingrese la marca del automóvil");
        marca = entrada.nextLine();
        System.out.println("Ingrese el origen del automóvil");
        origen = entrada.nextLine();
        System.out.println("Ingrese el costo del automóvil");
        costo = entrada.nextDouble();

        if (origen.equals("Alemania"))   {
            impuesto = costo * 0.2;
        } else {
            if (origen.equals("Japón")) {
                impuesto = costo * 0.3;
            } else {
                if (origen.equals("Italia"))   {
                    impuesto = costo * 0.15;
                } else {
                    if (origen.equals("USA")) {
                        impuesto = costo * 0.08;
                    } else {
                        impuesto = 0;
                        System.out.println("Origen inválido");
                    }
                }
            }
        }
        precioVenta = costo + impuesto;

        System.out.printf("Impuesto por pagar: %.2f\nPrecio de venta: %.2f",
                impuesto, precioVenta);
    }

}
