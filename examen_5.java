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
public class examen_5 {
     public static void main(String[] args) {
           
      Scanner entrada = new Scanner(System.in);
      
        System.out.print("Ingrese un número para multiplicar: ");
        int N = entrada.nextInt();

        System.out.println("Tabla de multiplicar de " + N + " (solo múltiplos de 4):");

        for (int i = 1; i <= 10; i++) {
            int resultado = N * i;

            if (resultado % 4 == 0) {
                System.out.println(N + " x " + i + " = " + resultado);
            }
        }
      
 }
    
}
