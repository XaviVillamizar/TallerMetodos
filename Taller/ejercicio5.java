/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * Ejercicio 5: Pasar de días, horas y minutos a segundos. Escribe 
 * un metodo que reciba los siguientes datos: días, horas y minutos. 
 * Y retorne con la cantidad de segundos totales que son esos datos.
 * 
 * @author abrahan
 */
public class ejercicio5 {
    public double segundos (int horas, int min, int dias ){
        double seg_total = (horas*3600)+(min*60)+(dias*86400);
        return seg_total;
    }
    public static void main (String[]args){
        ejercicio5 met = new ejercicio5();
        int horas, min, dias;
        
        dias = 2;
        horas=4;
        min = 45;
        System.out.println("los segundos que hay en total son: "+met.segundos(horas, min, dias)+" segundos");
        
        dias = 10;
        horas=1;
        min = 00;
        System.out.println("los segundos que hay en total son: "+met.segundos(horas, min, dias)+" segundos");
    }
}

    
