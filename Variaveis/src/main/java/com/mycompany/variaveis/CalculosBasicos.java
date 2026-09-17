/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

import java.util.Scanner;

/**
 *
 * @author JhéssikLeal
 */
public class CalculosBasicos {
    
    public static void main(String[] args) {
        // TRABALHAR COM CALCULO DE SOMA
        int numero1 , numero2, resultadoResto;
        
        double resultadoSoma, resultadoSubtracao , 
                resultadoMultiplicacao, resultadoDivisao;
        
        Scanner entradaNumero = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro:");
        numero1 = entradaNumero.nextInt();
        
        System.out.println("Digite outro valor inteiro:");
        numero2 =entradaNumero.nextInt();
        
        // SOMA
        resultadoSoma = numero1 + numero2 ;
        
        System.out.println("A soma dos numeros e:"+resultadoSoma);
        
       // SUBTRAÇÃO   
       resultadoSubtracao = numero1 - numero2;
       
       System.out.println("A subtracao dos numero e:"+resultadoSubtracao);
       
       // MULTIPLICAÇÃO
       resultadoMultiplicacao = numero1 * numero2;
       
     System.out.println("A multiplicacao dos numero e:"+resultadoMultiplicacao);

       //DIVISÃO
       resultadoDivisao = numero1 / numero2;
       
        System.out.println("A divisao dos numero e:"+resultadoDivisao);
        
        // CALCULO DE RESTO
        
        resultadoResto = numero1 % numero2;
        
    System.out.println("O resto da divisao dos numero e:"+resultadoResto);

             
    }
    
}
