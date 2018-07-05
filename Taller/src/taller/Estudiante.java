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
//Declaracion variables
public class Estudiante {

    String nombre;
    String apellido;
    int edad;
    double calificacion1;
    double calificacion2;
//Calcula el promedio
    public double promedio() {
        double suma;
        suma = calificacion1 + calificacion2;
        double promedio = suma / 2;
        return promedio;
    }

    public void imprimir() {
        System.out.printf("%s%s\n%d\n%.1f%.1f\nEl promedio es:%.1f\n", nombre, apellido, edad, calificacion1, calificacion2, promedio());
    }
}
