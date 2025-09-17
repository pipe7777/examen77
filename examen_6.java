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
public class examen_6 {
    public static void main(String[] args) {
 
        Scanner entrada = new Scanner(System.in);
        int N;
        int bloquesTotales = 0;

        System.out.print("Ingrese la cantidad de escalones: ");
        N = entrada.nextInt();

        // Recorremos cada escalón desde 1 hasta N
        for (int i = 1; i <= N; i++) {
            int bloquesEscalon = i * i; // cuadrado del número de escalón
            bloquesTotales = bloquesTotales + bloquesEscalon;
        }

        System.out.println("Pepito necesita " + bloquesTotales + " bloques para construir la escalera.");
        
}
             
 
}
