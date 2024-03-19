/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller;

/**
 *
 * @author xavis
 */
public class Ejercicio5 {      

    public long segundosDHM(int dias, int horas, int minutos){
        
        long segundosDia = 24 * 60 * 60;
        long segundosHora = 60 * 60;
        long segundosMinuto = 60;
        
        long segundosDias = dias * segundosDia;
        long segundosHoras = horas * segundosHora;
        long segundosMinutos = minutos * segundosMinuto;
        
        long segundosTotal = segundosDias + segundosHoras + segundosMinutos;
        
        return segundosTotal;
    }
    
    public static void main(String[] args){
        Ejercicio5 obj = new Ejercicio5();
        int dias = 2;
        int horas = 5;
        int minutos = 30;
        
        long segundosTotales = obj.segundosDHM(dias, horas, minutos);
        System.out.println("La cantidad total de segundos es: " + segundosTotales);
    
        
        dias = 0;
        horas = 20;
        minutos = 13;
    
        segundosTotales = obj.segundosDHM(dias, horas, minutos);   
            System.out.println("La cantidad total de segundos es: " + segundosTotales);
    }
}

    
