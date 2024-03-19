/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * Ejercicio 2: Cálculo de área y perímetro. Escribe un metodo que reciba los dos lados de un rectángulo y el tipo de
 * calculo y retorne el cálculo del perímetro (suma de los lados) o el área (base por altura).
 * 
 * @author abrahan
 */
public class ejercicio2 {
    public float area_perimetro (float base, float altura, int opcion){
        if (opcion ==1){
            float area = base*altura;
            return area;
        }else{
            float perimetro = (2*base)+(2*altura);
            return perimetro;
        }
    }
    public static void main (String[]args){
        ejercicio2 met = new ejercicio2();
        float base, altura;
        int opcion;
        
        base=8;
        altura=5;
        opcion=1;
        System.out.println("el area del rectangulo es de: "+met.area_perimetro(base, altura, opcion));
        
        base=4;
        altura=6;
        opcion=2;
        System.out.println("el perimetro del rectangulo es de: "+met.area_perimetro(base, altura, opcion));
    }
}
