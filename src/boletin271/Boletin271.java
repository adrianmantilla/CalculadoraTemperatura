package boletin271;
import java.util.Scanner;
/**
 *
 * @author amantillapousa
 Boletin 2.8
 * Facer un programa que calcule graos Fahrenheit e graos Kelvin
 */
public class Boletin271 {

  
    public static void main(String[] args) {
        
        int centigrados;
        int resultado;
        double fahr;
        fahr = 33.8;
        double kelv;
        kelv = 274.15;
        
        Scanner numero=new Scanner(System.in);
        
        System.out.print("Ingrese el valor de ºC: ");
        centigrados = numero.nextInt();
        
        System.out.print(System.getProperty("line.separator"));
        
        System.out.print ("resultado ºF: "+(centigrados+fahr));
        
        System.out.print(System.getProperty("line.separator"));
        
        System.out.print ("resultado ºK: "+(centigrados+kelv)+"\n");
        
        
    }
    
}
