/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menudeopciones;

import java.util.Scanner;

public class MenuDeOpciones {

    public static void main(String[] args) {
        int opcion, a = 0, b = 0, resultado = 0;
        Scanner MyScan = new Scanner(System.in);
        do {
            System.out.println("1-Sumar");
            System.out.println("2-Restar");
            System.out.println("3-Multiplicar");
            System.out.println("4-Dividir");
            System.out.println("5-Salir");

            do {
                System.out.println("Ingrese la opción deseada");
                opcion = MyScan.nextInt();
            } while (opcion < 1 || opcion > 5);

            if (opcion != 5) {
                System.out.println("Ingrese el numero 1");
                a = MyScan.nextInt();
                System.out.println("Ingrese el numero 2");
                b = MyScan.nextInt();

                switch (opcion) {
                    case 1:
                        resultado = a + b;
                        break;
                    case 2:
                        resultado = a - b;
                        break;
                    case 3:
                        resultado = a * b;
                        break;
                    case 4:
                        resultado = a / b;
                        break;
                }

                System.out.println("Resultado:" + resultado);
            }
        } while (opcion != 5);

    }
}
