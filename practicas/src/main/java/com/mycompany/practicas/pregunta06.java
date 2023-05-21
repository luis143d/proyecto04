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
public class pregunta06 {
       public static void main(String[] args) {
   Scanner lui=new Scanner(System.in);
           System.out.println("ingrese el valor de la precion:");
           double pre= lui.nextDouble();
              System.out.println("ingrese el valor de la volumen:");
           double vol= lui.nextDouble();
              System.out.println("ingrese el valor de la temperatura:");
           double tem= lui.nextDouble();
           
           double masa= (pre*vol)/(0.37*(tem+460));
           System.out.println("el reslutado de la masa es"+masa);
           
}}
