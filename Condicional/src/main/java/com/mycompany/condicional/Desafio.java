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
public class Desafio {
    public static void main(String[] args) {
        
        // Variaveis
        String nome, tipoIngresso;
        int idade;
        boolean autorizacao = false;
        
        // Scanners
        Scanner entradaNumero = new Scanner(System.in);
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaLogica = new Scanner(System.in);
        
        
        // SOLICITAÇÕES
        
        System.out.println("Digite seu nome:");
        nome = entradaTexto.nextLine();
        
        System.out.println("Digite sua idade:");
        idade = entradaNumero.nextInt();
        
        System.out.println("Qual o tipo do seu ingresso?");
        tipoIngresso = entradaTexto.nextLine();
        
        System.out.println("Voce possui autorizacao?"
                + " True para sim ou False para nao");
        autorizacao = entradaLogica.nextBoolean();
        
        
        // VALIDAÇÕES COM IF ELSE
        System.out.println("Ola "+nome+", você possui "+idade+
                " anos e");
        
        if(idade>=18 && tipoIngresso.equals("Vip")){
            System.out.println("Acesso VIP Liberado!");
        }else if(idade>=18 && tipoIngresso.equals("Comum")){
            System.out.println("Acesso Comum Liberado!");
        }else if((idade==16 || idade==17) && autorizacao==true){
            System.out.println("Acesso Liberado com Autorizacao!");
        }else if(tipoIngresso.equals("Professor") || 
                tipoIngresso.equals("Funcionario")){
            System.out.println("Acesso Especial Liberado!");
        }else{
            System.out.println("Acesso Negado!");
        }
        
        
    }
}
