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
public class Pregunta01 {
  
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese la coordenada x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Ingrese la coordenada y2: ");
        double y2 = scanner.nextDouble();
         double distanciaX = x2 - x1;
        double distanciaY = y2 - y1;
          double distanciaCuadrada = distanciaX * distanciaX + distanciaY * distanciaY;
        double distancia = Math.sqrt(distanciaCuadrada);
        System.out.println("La distancia entre los dos puntos es: " + distancia);
       double fin=Math.sqrt((x2-x1)*(x2-x1)+(y2-y1)*(y2-y1));
        System.out.println("fin"+fin);
    }
}

  
