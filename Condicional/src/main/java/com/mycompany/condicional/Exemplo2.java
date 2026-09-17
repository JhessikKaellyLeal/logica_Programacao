/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author JhéssikLeal
 */
public class Exemplo2 {
    public static void main(String[] args) {
        
        // variaveis
        int quantidadeMiojo, quantidadeSalada;
        
        // Scanner
        Scanner entradaNumero= new Scanner(System.in);
        
        //Solicitar os dados para o usuário
        System.out.println("A quantos dias você não come miojo?");
        quantidadeMiojo = entradaNumero.nextInt();
        
        System.out.println("A quantos dias você não come salada?");
        quantidadeSalada = entradaNumero.nextInt();
        
           
        
        if(quantidadeMiojo<2 || quantidadeSalada>7){
            System.out.println("Pouco saudavel");
        }
         if(quantidadeMiojo>=2 || quantidadeSalada<7){
            System.out.println("Saudavel");
        }
        
        
    }
    
}
