import java.util.Scanner;

public class Ejercicio05 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Producto 1:");
        double productoUno = scanner.nextDouble();

        System.out.println("Producto 2:");
        double productoDos = scanner.nextDouble();

        double valorSinImpuesto = productoUno + productoDos;
        double valorConIva = valorSinImpuesto * 1.19; // Aplica IVA del 19%

        System.out.println("El valor de su compra sin IVA es: " + valorSinImpuesto);
        System.out.println("El valor de su compra total con IVA es: " + valorConIva);

        scanner.close();
    }
}
