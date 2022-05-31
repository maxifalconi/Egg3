/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package CircunsferenciaApp;

import CircunsferenciaApp.entidades.Circun;
import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class EJ2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double radio;
        Scanner leer = new Scanner(System.in);
        
        Circun c1 = new Circun();
        
        c1.crearCircun();
        c1.area();
        c1.perimetro();
        
        System.out.println("El area de la circunsferencia es " + c1.area());
        System.out.println("El perimetro de la circunsferencia es " + c1.perimetro());
    }
    
}
