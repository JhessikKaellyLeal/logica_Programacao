/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;



/**
 *
 * @author JhéssikLeal
 */

import java.util.Scanner;

public class Questao1 {
   
    public static void main(String[] args) {
        // criar váriavel
        String nome;
        
        // chamar o Scanner
        Scanner entradaTexto = new Scanner (System.in);
        
        // solicitar os dados para o usuário
        System.out.println("Digite o seu nome:");
        nome = entradaTexto.nextLine();
        
        System.out.println("Olá,"+nome+"! Seja bem-vindo(a) ao Java.");
        
        
    }
    
}
