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
public class pregunta05 {
       public static void main(String[] args) {
   Scanner lui=new Scanner(System.in);
           System.out.println("ingrese valor:");
           int pre= lui.nextInt();
        double ganancia= 15*pre/100;
        double total= ganancia-pre;
           System.out.println("precio a pagar"+total);
}}
