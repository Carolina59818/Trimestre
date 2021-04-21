
package trimestre;

import java.util.Scanner;

public class Trimestre {

    public static void main(String[] args) {
        // Crear un metodo que lea un valor entero del 1 al 12 valide el valor 
        //y  nos diga en que trimestre del año nos encontramos (Primer trimestre, Segundo Trimestre, Tercer Trimeste, Cuarto Trimestre)
        Scanner entrada = new Scanner(System.in); 
        System.out.println("Ingrese un numero del 1 al 12 para saber en que trimestre se encuentra: ");

        int numero;
                
        numero = entrada.nextInt();
      
        switch (numero) {
            case 1,2,3:
                System.out.println( " Se encuentra en el primer trimestre");
                break;
            case 4,5,6:
                System.out.println( " Se encuentra en el segundo trimestre");
                break;
            case 7,8,9:
                System.out.println( " Se encuentra en el tercer trimestre");
            case 10, 11, 12:
                System.out.println( " Se encuentra en el cuarto trimestre");
                break;

            default:
                System.out.println("Ingrse un valor dentro del rango"); 
        }
    }
    
    
    
}
