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
public class examen_10 {
      public static void main(String[] args) {
          Scanner entrada = new Scanner (System.in);
          System.out.print("Ingrese el número de tramos: ");
        int N = entrada.nextInt();

        int altura = 0;

        for (int i = 1; i <= N; i++) {
            if (i % 2 == 0) {
                altura = altura - i; 
            } else {
                altura = altura + i; 
            }
        }

        System.out.println("La altura final de la montaña rusa es: " + altura);

          
      }

    
}
