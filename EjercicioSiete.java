import java.util.Scanner;

public class EjercicioSiete {
    public static void main(String[] args) {

         /*CALCULADORA DE DESCUENTOS EN UNA TIENDA
         * 
         * programa en Java que le pida al usuario:
            -El nombre del producto
            -El precio original
            -El porcentaje de descuento

        Luego debe calcular y mostrar:
            -El nombre del producto
            -El precio original
            -El valor del descuento
            -El precio final con el descuento aplicado
         */

        
        Scanner ejercicioSiete = new Scanner (System.in);

        System.out.println("Escriba el nombre del producto");
        String nombreProducto =  ejercicioSiete.nextLine();

        System.out.println("Escriba el precio original del producto");
        double precioOriginal = ejercicioSiete.nextDouble();

        System.out.println("¿cuánto fue el % de descuento por el producto?");
        int descuentoProducto = ejercicioSiete.nextInt();

        double descuento = (precioOriginal * descuentoProducto) / 100;
        double precioFinal = precioOriginal - descuento;

        System.out.println("Nombre del producto seleccionado : " + nombreProducto);
        System.out.println("Precio del producto :" + precioOriginal);
        System.out.println("Valor de " + nombreProducto +  "Con el descuento aplicado:" + descuento + "es de : ");
        System.out.println("El valor del precio final es de :" + precioFinal);




        ejercicioSiete.close();
    }
    
}
