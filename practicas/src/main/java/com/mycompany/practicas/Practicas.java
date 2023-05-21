/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicas;

import java.util.Scanner;







/**
 *
 * @author Murillo
 */
public class Practicas {
    public static void main(String[] args) {
   Scanner lui=new Scanner(System.in);
        System.out.println("ingrese el radio:");
        int vol= lui.nextInt();
        double volumen= 4*Math.PI*Math.pow(vol, 2)/3;
        double area= 4*Math.PI*Math.pow(vol, 2);
        System.out.println("el volumen:"+volumen);
        System.out.println("el area es:"+area);
    }}
 
    

