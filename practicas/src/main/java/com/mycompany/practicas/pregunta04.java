/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practicas;

import java.util.Scanner;

/**
 *
 * @author Murillo
 */
public class pregunta04 {
     
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("practica01");
        int pract1= scanner.nextInt();
        System.out.println("practica02");
        int pract2= scanner.nextInt();
        System.out.println("practica03");
        int pract3= scanner.nextInt();
        double practica= (pract1+pract2+pract3)/3;
        System.out.println("promedio"+practica);
        System.out.print("Ingrese la calificación del segundo parcial: ");
        double calificacionParcial2 = scanner.nextDouble();
        System.out.print("Ingrese la calificación del tercer parcial: ");
        double calificacionParcial3 = scanner.nextDouble();
        double calificacionFinal = ((practica *55)/100) + ((calificacionParcial2 *30)/100) + ((calificacionParcial3 *15)/100);
       double fin= calificacionFinal/3;
        System.out.println("La calificación final en el curso es: " + calificacionFinal);
    }
}

        
