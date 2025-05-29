import java.util.Scanner;

public class EjercicioCinco {

    public static void main(String[] args) {

        /*
         * Escribe un programa que calcule el total de una factura a partir de la base
         * imponible (precio sin IVA). La base imponible estará almacenada en una
         * variable.
         */

        Scanner scanner = new Scanner(System.in);

        int cantidadProductos = 3;
        double[] productos = new double[cantidadProductos];

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese el valor del producto " + (i + 1) + ": ");
            productos[i] = scanner.nextDouble();
        }

        // Mostrar todos los productos
        System.out.println("\nLista de productos ingresados:");
        for (int i = 0; i < cantidadProductos; i++) {
            System.out.println("Producto " + (i + 1) + ": " + productos[i]);
        }

        double valorProductosSinIva = productos /  cantidadProductos;
        System.out.println("Valor del producto sin iva es :" + valorProductosSinIva);

        scanner.close();
    }

}
