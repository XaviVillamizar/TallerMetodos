/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * Ejercicio 3: Cambio de dólares a euros. Suponiendo que 1 euro = 1.33250 dólares. 
 * Escribe un metodo que reciba un número de dólares y retorne el calculo del cambio en euros
 * 
 * @author xavis
 */
public class ejercicio3 {
    public static double dolarAeuro(double dolares){
        double cambio = 1.33250;
        double euros = dolares/cambio;
            
    return euros;  
        }
        
    public static void main(String[] args) {
        double dolares = 72;
        double euros = dolarAeuro(dolares);
            System.out.println("Primer caso de prueba");
            System.out.println(dolares+ " dolares quivale a " +euros+"euros.");
    
    
        dolares = 500;
        euros = dolarAeuro(dolares);
            System.out.println("Segundo caso de prueba");
            System.out.println(dolares+ " dolares quivale a " +euros+"euros.");
    } 
}
