/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentas;

import java.util.Scanner;

public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        
        String Titular;
        float cant;
        
        System.out.println("Ingrese Nombre y Apellido del titular de la Cuenta 1");
        Titular = myScan.next();
        
        System.out.println("Ingrese Cantidad de la Cuenta 1");
        cant = myScan.nextFloat();
        
        Cuenta cont1 = new Cuenta(Titular,cant);
        
        System.out.println("Ingrese Nombre y Apellido del titular de la Cuenta 2");
        Titular = myScan.next();
        
        System.out.println("Ingrese Cantidad de la Cuenta 2");
        cant = myScan.nextFloat();
        
        Cuenta cont2 = new Cuenta(Titular,cant);
        
        System.out.println(cont1.toString());
        System.out.println(cont2.toString());
        
        if (cont1.getCantidad() >= 100) {
            cont1.Retirar(100);
        }        
        else{
            System.out.println("Saldo insuficiente para hacer la extracción en Cuenta 1");
        }
        
        if (cont2.getCantidad() >= 100){
            cont2.Retirar(100);
        }
        else {
            System.out.println("Saldo insuficiente para hacer la extracción en Cuenta 2");    
        }
        
        System.out.println(cont1.toString());
        System.out.println(cont2.toString());
        
        System.out.println("Ingrese 'Si' si desea Agregar dinero a su cuenta, cualquier otra cosa para salir");    
        String agregoDinero = myScan.next();
        
        if ("Si".equals(agregoDinero)) {
            System.out.println("Ingrese nombre de cuenta");
            
            if (cont1.getTitular().equals(myScan.next())) {
                System.out.println("Ingrese Cantidad a depositar");
                cont1.Ingresar(myScan.nextFloat());
            }
            else if (cont2.getTitular().equals(myScan.next())){
                System.out.println("Ingrese Cantidad a depositar");
                cont2.Ingresar(myScan.nextFloat());
            }
        }
        
        System.out.println(cont1.toString());
        System.out.println(cont2.toString());
        
    }
    
}
