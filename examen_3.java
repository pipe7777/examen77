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
public class examen_3 {
       public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        
   int N;
   int contadorManzana = 0;
   int contadorNaranja = 0;
   
           System.out.println("Ingrese el numero total de niños: ");
           N = entrada.nextInt();
           
           for(int i = 1; i <= N; i++){
               if (i % 2 == 0 ){
                 contadorManzana = contadorManzana + 1;
                   
               }else {
                  contadorNaranja = contadorNaranja + 1;
                  
               }
               
           }
           System.out.println("Niños que reciben manzana: "+ contadorManzana);
           System.out.println("Niños que recibrn narajan: "+ contadorNaranja);
        
   }

}
