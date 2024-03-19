/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * Cálculo de perímetro de circunferencia, área del círculo, y volumen de la esfera. Suponiendo que pi = 3.1416. 
 * Escribe un metodo que reciba el radio y el tipo de calculo, y retorne el cálculo del perímetro de la circunferencia (
 * 2*pi*r) o el área del círculo (pi*r2 ) o el volumen de la esfera (V = 4*pi*r3 /3).
 * 
 * @author abrahan
 */
public class ejercicio4 {
    
    public double calculo_perimetro(float radio, int opcion){
         
        if (opcion ==1){
             double perimetro = 2*3.1416*radio;
            return perimetro;
        }else{
            if (opcion ==2){
                double area = 3.1416*Math.pow(radio, 2);
                return area;
            }else {
                if (opcion==3){
                    double volumen = 4*3.1416*(Math.pow(radio,3)/3);
                    return volumen;
                }else {
                    return 0.0;
                }
            }
        }
    }
    
    public static void main (String[]args){
        ejercicio4 met = new ejercicio4();
        
        float radio = 4;
        int opcion = 1;
        System.out.println("el perimetro de la circuferencia es de: "+met.calculo_perimetro(radio, opcion));
        
        radio = 6;
        opcion=3;
        System.out.println("el volumen de la esfera es de: "+met.calculo_perimetro(radio, opcion));
        
        radio =5;
        opcion =2;
        System.out.println("el area del circulo es de: "+met.calculo_perimetro(radio, opcion));
    }
}

