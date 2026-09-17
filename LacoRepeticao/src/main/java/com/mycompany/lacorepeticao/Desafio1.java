/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacorepeticao;

import java.util.Scanner;

/**
 *
 * @author JhéssikLeal
 */
public class Desafio1 {
    public static void main(String[] args) {
        
        double [][] contribuicao = new double[5][3];
        
        Scanner entradaNumero = new Scanner(System.in);
        
        //PREENCHER A MATRIZ
        for(int coluna=0;coluna<=2;coluna++){
            for(int linha=0;linha<=4;linha++){
                System.out.println("Digite um valor:");
                contribuicao[linha][coluna]= 
                        entradaNumero.nextDouble();
            }//fecha o 2° for
        }// fecha o 1° for
        
        // IMPRESSÃO DA MATRIZ
        for(int coluna=0;coluna<=2;coluna++){
            for(int linha=0;linha<=4;linha++){
                System.out.println("Coluna "+coluna+
                        " Linha "+linha+"="
                        +contribuicao[linha][coluna]);
                
            }//fecha o 2° for
        }// fecha o 1° for
        
        
    }
}
