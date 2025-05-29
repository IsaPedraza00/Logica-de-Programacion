package primerosEjercicios;
import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class Ejercicio06 {
    public static void main(String[] args) {
        
        /* Haz un programa en Java que le pida al usuario el valor de su comida y le calcule la propina (10%). Luego, debe mostrar:
            -Valor de la comida
            -Valor de la propina
            -Total a pagar (comida + propina) */

            Scanner scanner  = new Scanner(System.in);

            System.out.println("Escriba el valor de la comida que compró");
            double valorComida = scanner.nextDouble();

            double propina =  valorComida * 0.10 ;
            double comidaMasPropina = propina * valorComida;

            System.out.println("El valor de su comida es de : " + valorComida);
            System.out.println("Valor de la propina es de  : " + comidaMasPropina);
            System.out.println("El total de valor a pagar (comida + propina )es de 30:  " +  comidaMasPropina);

            scanner.close();
    }
}
