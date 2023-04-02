/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author ariel
 */
import java.util.Scanner;
public class ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* crea un array de numeros y otro de string con 10 posiciones, donde se incertara en 
        notas de 0 a 10 (se debe de controlar que se incerte una noa valida)las notas seran
        de caracter decimal y el array string nombres de alumnos
        
        despues crear un array de string donde se incertara el resultado de la nota con palabras:
        -1 y 4.9 "suspendido o reprobado"
        -5 y 6.9 "es bien" 
        -7 y 8.9 "notable"
        -9 y 10 "sobresaliente"
        
        muestre por pantalla, alumno, nota, resultado en palabras*/
        final int tamanio=15;
        Scanner lector=new Scanner(System.in);
        double[] notas=new double[tamanio];
        String[] alumno=new String[tamanio];
        String[] resultado=new String[notas.length];
        
        
        for(int i=0; i<notas.length; i++){
          double nota;
          System.out.println("ingrese el nombre del alumno "+(i+1));
          alumno[i]=lector.next();
         do{
            
          System.out.println("ingrese la nota del alumno "+(i+1));
          nota=lector.nextDouble();
         }while(nota<=0 || nota>10);
         notas[i]=nota;
                 
        }
        
        
        for(int i=0; i<notas.length; i++){
          if(notas[i]>=0 && notas[i]<=4.9){
            resultado[i]="reprobado";
          }else if(notas[i]>=5 && notas[i]<=6.9){
            resultado[i]="bueno";   
          }else if(notas[i]>=7 && notas[i]<=8.9){
            resultado[i]="notable";   
          }else{
            resultado[i]="sobresaliente";   
          }
        }
        
        for(int i=0; i<notas.length; i++){
           System.out.println("alumno: "+alumno[i]+ " nota: "+notas[i]+ " : "+resultado[i]);
        }
    }
    
}
