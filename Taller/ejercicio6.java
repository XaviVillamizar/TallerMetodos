package Taller;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * Ejercicio 6: Pasar de segundos a días, horas y minutos. 
 * Escribe un metodo que reciba los segundos y el tipo, y le 
 * retorne el número de días o horas o minutos
 * 
 * @author xavis
 */
public class ejercicio6 {
    public float convertirSeg(float segundos, int caso){
        switch (caso) {
            case 1:
                int dias = (int) (segundos/86400);
                
                return dias;
            case 2:
                float horas=segundos/3600;
                
                return horas;
            case 3:
                float minutos=segundos/3600;
                
                return minutos;
            default:
                return -1;
        }
    }
    public static void main(String[] args){
        ejercicio6 obj = new ejercicio6();
        
        float segundos=824891;
        int caso=1;
        System.out.println("El numero de dias es: "+obj.convertirSeg(segundos, caso));
        
        segundos=34214422;
        caso=2;
        System.out.println("El numero de horas es: "+obj.convertirSeg(segundos, caso));
        
        segundos=7237;
        caso=3;
        System.out.println("El numero de minutos es: "+obj.convertirSeg(segundos, caso));
        
    }
}
  