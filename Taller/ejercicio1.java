/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * Ejercicio 1: Cálculo de precios con descuento Escribe un metodo que reciba el precio de un producto y el tanto por ciento de 
 * descuento, y te diga el precio con descuento. Por ejemplo, si el precio es 300 y el descuento 20, el metodo retorna que el 
 * precio final con descuento es de 240
 * 
 * @author xavis
 */
public class ejercicio1 {
    public double pdescuento(float precio, float descuento){
        float preciofinal = precio*descuento/100;
        float total = precio-preciofinal;
        
    return total;
    }
    
    public static void main(String[] args){
        ejercicio1 obj = new ejercicio1();
        
    float precio = 727;
    double descuento = 27;
        System.out.println("Primer caso de prueba");
        System.out.println("el precio final es: "+obj.pdescuento(precio, (float) descuento));

    precio = 1023;
    descuento = 40;
        System.out.println("Segundo caso de prueba");
        System.out.println("el precio final es: "+obj.pdescuento(precio, (float) descuento));      
    }
}

