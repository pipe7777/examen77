/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.examen_1;

import java.util.Scanner;

/**
 *
 * @author Pipe
 */
public class Examen_1 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int N;
        int suma =0;
        
        System.out.println("Ingrese el numero N: ");
        N = entrada.nextInt();
        
        for(int i = 1; i<=N; i++){
            if (i % 3 ==0){
                suma +=i;
            }
            
        }
        System.out.println("Pepito ahorro un total de: "+ suma + "monedas");
        
    }
}
