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
public class examen_4 {
       public static void main(String[] args) {
           Scanner entrada = new Scanner (System.in);
           System.out.println("Ingrese el numero de la piedra magica ");
           
           int numero = entrada.nextInt();
           
           int sumaDivisores = 0;
           
           for (int i = 1; i< numero; i++){
               if (numero % i== 0){
                   sumaDivisores = sumaDivisores + i;
               }
           }
           
           if (sumaDivisores == numero){
               System.out.println("es un numero perfecto" + numero );
           }else {
               System.out.println("es un numero no perfecto"+ numero);
           }
           
           
       }

    
}
