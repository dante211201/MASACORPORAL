/*
DANTE VAZQUEZ SILVA
2S11

 */
package MASACORPORAL;
import java.util.Scanner;

public class OPERACION {
Scanner teclado=new Scanner(System.in);
double peso,altura,imc;
 
        public void operaciones(){
        System.out.println("Ingresa tu peso:");
        peso= teclado.nextDouble();
        System.out.println("Ingresa tu estatura en mts:");
        altura= teclado.nextDouble();
        imc= peso/(altura*altura);
        System.out.println("TU IMC ES: "+imc);
         
        if (imc<18.5){
        System.out.println("TU PESO ES BAJO, CUIDADO!!");
        } 
        
        else if (imc>=18.5 && imc<=24.9) {
        System.out.println("TU PESO ES NORMAL, TODO BIEN");
        } 
        
        else if (imc>=25 && imc<=29.9) {
        System.out.println("TIENES SOBREPESO, CUIDATE");
        } 
        
        else {
        System.out.println("TIENES OBESIDAD, ACUDE CON UN DOCTOR");
        }
      }
    }
