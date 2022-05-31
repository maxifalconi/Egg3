/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CircunsferenciaApp.entidades;
import java.util.Scanner;

/**
 *
 * @author Tami
 */
public class Circun {
    Scanner leer1 = new Scanner(System.in);
    private double radio;
    
    
    public Circun(){
        
    }
    
    //a) Método constructor que inicialice el radio pasado como parámetro.
    public Circun(double radio){
        this.radio = radio;
    }
    
    //b) Métodos get y set para el atributo radio de la clase Circunferencia.
    public void setRadio(double radio){
        this.radio = radio;
    }
    public double getRadio(){
        return radio;
    }
    
    //c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del objeto.
    public void crearCircun(){
        System.out.println("Ingresar valor del Radio");
        radio = leer1.nextDouble();
    }
    
    //d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio!).
    public double area(){
        double area = Math.PI * radio;
        return area;
    }
    
    //e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
    public double perimetro(){
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
    
}
