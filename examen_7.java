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
public class examen_7 {
   public static void main(String[] args) {
  
  Scanner entrada = new Scanner (System.in);
  
        System.out.print("Ingrese un número entero positivo: ");
        int numero = entrada.nextInt();
        int invertido = 0;

        // Verificamos que sea positivo
        if (numero <= 0) {
            System.out.println("Por favor, ingrese un número positivo mayor que cero.");
        } else {
            // Usamos un for como si fuera un while
            for (; numero > 0; numero = numero / 10) {
                int ultimoDigito = numero % 10;
                invertido = invertido * 10 + ultimoDigito;
            }

            System.out.println("Número invertido: " + invertido);
        }
   }

    
}
