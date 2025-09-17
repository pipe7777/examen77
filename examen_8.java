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
public class examen_8 {
        public static void main(String[] args) {
           Scanner entrada = new Scanner(System.in);
           System.out.print("Ingrese un número: ");
        int numero = entrada.nextInt();

        int pares = 0;
        int impares = 0;

        // Solo usamos un número auxiliar para no modificar el original
        for (int n = numero; n > 0; n = n / 10) {
            int digito = n % 10;

            if (digito % 2 == 0) {
                pares = pares + 1;
            } else {
                impares = impares + 1;
            }
        }

        System.out.println("Cantidad de dígitos pares: " + pares);

        if (pares > impares) {
            System.out.println("Contraseña Aceptada");
        } else {
            System.out.println("Contraseña Rechazada");
        }
       }

    
}
