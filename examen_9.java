/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.examen_1;

import java.util.Scanner;

/**
 *
 * @author Pipe
 */
public class examen_9 {
  public static void main(String[] args) {
             
      Scanner entrada = new Scanner(System.in);
      
        System.out.print("Ingrese la base (a): ");
        int base = entrada.nextInt();

        System.out.print("Ingrese el exponente (b): ");
        int exponente = entrada.nextInt();

        int resultado = 1;

        for (int i = 1; i <= exponente; i++) {
            resultado = resultado * base;
        }

        System.out.println("El resultado de " + base + "^" + exponente + " es: " + resultado);
      
  }

    
}
