package circulo;
import java.util.Scanner;
/**
*
* @author monse
*/
public class Circulo {
 /**
 * @param args the command line arguments
 */
 public static void main(String[] args) {
 // TODO code application logic here
 final double PI=3.1416;
 // TODO Apéndice de método generado automáticamente
Scanner s=new Scanner(System.in);
System.out.println("Introduce el radio:");
double r=s.nextDouble();
double area=(PI*r*r);
System.out.printf("El valor del área es %f\n", area);
double longitud=(2*PI*r);
System.out.printf("La longitud del circulo es %f\n", longitud);
System.out.printf("Cambio");
 }
}
