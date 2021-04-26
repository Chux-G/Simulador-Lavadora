/*
 * Prueba del programa del funcionamiento logico de la lavadora
 */
package lavadora_uno;
import Libreria.LLFunciones;
import java.util.Scanner;

/**
 *
 * @author jesus
 */
public class Lavadora_Uno {
    public static void main(String[] args){
      Scanner entrada = new Scanner(System.in);
        System.out.println("La ropa es blanca o de color?");
        System.out.print("Presiona 1 - ropa blanca / 2 - ropa color ");
        int tipo_ropa = entrada.nextInt();
        
        System.out.print("Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos, tipo_ropa);
        mensajero.setRopa(2);
        System.out.println("El tipo de ropa es: "+mensajero.getRopa());
        mensajero.CicloFinalizado();
    }
}
