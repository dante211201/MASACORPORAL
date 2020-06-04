/*
DANTE VAZQUEZ SILVA
2S11
 */
package MASACORPORAL;
import java.util.Scanner;
public class PERSONA {
    
String nombre;
String edad;
String sexo;

    void persona(){
    System.out.println("Ingresa los sigientes datos");
    Scanner teclado = new Scanner(System.in);
    
    System.out.println("Ingresa el nombre: ");
    nombre = teclado.nextLine();
    
    System.out.println("Ingresa la edad: ");
    edad = teclado.nextLine();
    
    System.out.println("Ingresa el sexo: ");
    sexo = teclado.nextLine();
    
    System.out.println("Tu nombre es: "+nombre);
    System.out.println("Tu edad es: "+edad);
    System.out.println("Tu sexo es: "+sexo);
    
    }
}
