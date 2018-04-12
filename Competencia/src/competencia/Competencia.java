/*
 En una competencia deportiva cada participante acumula puntos según su desempeño. Los organizadores de dicha competencia nos solicitan un programa que permita que se ingrese el resultado final una vez concluida la misma y que ofrezca las siguientes salidas impresas:

Cantidad total de competidores.
Promedio de puntaje obtenido por los competidores.
Cantidad de competidores con puntaje menor a 10.
Nombre del competidor con mayor cantidad de puntos.


Para ello se dispone de las siguientes entradas, una por cada competidor: 

Número: número entero que identifica a cada competidor
Nombre: cadena de caracteres con el nombre del competidor
Puntaje obtenido: número entero que indica cuántos puntos obtuvo


Realice una prueba de escritorio con los siguientes datos:
Número  Nombre  Puntaje
2 Rosa 14
9 Alejandro 16
23 Julieta 5
20 Ramiro 4
15 Susana 10
6 Juan 20
0

 */
package competencia;

import java.util.Scanner;

public class Competencia {

      
    public static void main(String[] args) {
        Scanner MyScan = new Scanner(System.in);
        
        int num, ptosObten, cantTCompetidores = 0, puntosTotales = 0, puntajeMeDIEZ=0, numONE = 0, i = 0;
        float prom;
        String name, nameONE = "Nadie";
        
        do{
            System.out.println("Ingrese un número para el competidor");
            num = MyScan.nextInt();
        }while (num < 0);
                
        while (num != 0){
                      
            
            System.out.println("Ingrese nombre del competidor");
            name = MyScan.next();
            System.out.println("Ingrese puntos del competidor");
            ptosObten = MyScan.nextInt();
            
            
            cantTCompetidores += 1;
            puntosTotales += ptosObten;
            
            if (ptosObten < 10){
                puntajeMeDIEZ += 1;
            }
            
            if ( i == 0 || numONE < ptosObten){
                numONE = ptosObten;
                nameONE = name;
            }
            
            System.out.println("Ingrese un número para el competidor");
            num = MyScan.nextInt();
            
        }
        
        prom = (float)puntosTotales / cantTCompetidores; 
        
        System.out.println("ACA:"+puntosTotales);
        
        System.out.println("Cantidad total de competidores:" + cantTCompetidores);
        System.out.println("Promedio de puntaje obtenido por los competidores:" + prom);
        System.out.println("Cantidad de competidores con puntaje menor a 10:" + puntajeMeDIEZ);
        System.out.println("Nombre del competidor con mayor cantidad de puntos:" + nameONE);
    }
    /*
    
Cantidad total de competidores.
Promedio de puntaje obtenido por los competidores.
Cantidad de competidores con puntaje menor a 10.
Nombre del competidor con mayor cantidad de puntos.
    */
    
}
