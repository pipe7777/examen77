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
public class examen_2 {
   public static void main(String[] args) {
       Scanner entrada = new Scanner (System.in);
       
       int N;
       int harina = 1; 
       
       System.out.println("Ingrese el numero N: ");
       N = entrada.nextInt();
       
       boolean recetaposible = true;
       
       for (int i = 1; i<= N; i++){
           harina *=i;
           
           if(harina > 10000){
               recetaposible = false; 
               break ;
               
               
           }
       }
       
       if (recetaposible ){
           System.out.println("la cantidad de cucharadas de harina de harina es: "+ harina);
       }else {
           System.out.println("la receta es imposible ");
       }
       
    }

}
