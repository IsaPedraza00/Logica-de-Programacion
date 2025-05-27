import java.util.Scanner;

public class EjercicioCuatro {
    public static void main(String[] args) {

        /*
         * Realiza un conversor de pesos colombianos a euros. La cantidad en pesos que
         * se quiere convertir deberá estar almacenada en una variable
         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("Escriba el valor de pesos colombianos que desea convertir a Euros");
        double pesoIngresado = scanner.nextDouble();

        double tasaCambio = 4700; 
        double resultado = pesoIngresado / tasaCambio;

        System.out.println("Equivalente en euros: " + resultado);

        scanner.close();
    }

}
