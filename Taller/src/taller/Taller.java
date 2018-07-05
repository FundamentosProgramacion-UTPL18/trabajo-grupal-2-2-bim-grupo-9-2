/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller;

/**
 *
 * @author SARANGO
 */
public class Taller {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaracion de variables.
        String[] nombre = {"José", "María", "Ana", "Paul", "David"};
        String[] apellido = {"Yaguana", "Benitez", "Gaviria", "Davila", "Andrade"};
        int[] edad = {20, 19, 20, 19, 25};
        double[] calificacion1 = {9.1, 10, 8, 7, 9.1};
        double[] calificacion2 = {6.1, 5, 10, 7.2, 4.1};
        
        Estudiante[] lista1= new Estudiante [5];
        //Damos valor a los objetos.
        for (int i = 0; i < lista1.length; i++) {
            Estudiante e= new Estudiante();
            e.nombre=nombre[i];
            e.apellido=apellido[i];
            e.edad= edad[i];
            e.calificacion1=calificacion1[i];
            e.calificacion2=calificacion2[i];
            lista1[i]=e;
            
        }
        //Precentamos el reporte.
        for (int i = 0; i < lista1.length; i++) {
             Estudiante e= lista1[i];
             e.imprimir();
        }
        
        
    }
    
    
}
