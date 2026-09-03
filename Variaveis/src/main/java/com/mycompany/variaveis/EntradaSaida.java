/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.variaveis;

/**
 *
 * @author JhéssikLeal
 */

// importanto as bibliotecas do Scanner
import java.util.Scanner;


public class EntradaSaida {
    
    public static void main(String[] args) {
        
        // codigo para cadastrar o pet
        // variaveis declaradas sem dados
        String nome;
        String raca;
        int idade;
        double peso;
        boolean foiVacinado;
        
        // criando as váriaveis de captura de dados
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero= new Scanner(System.in);
        Scanner entradaLogica= new Scanner(System.in);
        
        System.out.println("Digite o nome do seu pet:");
        nome= entradaTexto.nextLine();
        
        System.out.println("Digite a raça do seu pet:");
        raca = entradaTexto.nextLine();
        
        System.out.println("Digite a idade do seu pet:");
        idade= entradaNumero.nextInt();
        
        System.out.println("Digite o peso do seu pet:");
        peso= entradaNumero.nextDouble();
        
        System.out.println("Seu pet foi vacinado?");
        System.out.println("digite True para sim,ou false para nao");
        foiVacinado= entradaLogica.hasNext();
        
        System.out.println("Bem-vindo(a) "+nome);
        System.out.println("Voce e da raca "+raca+" e tem "+idade+" anos");
        System.out.println("Seu dono informou que seu peso e "+peso+"kg");
        System.out.println("E que seu status de vacina e "+foiVacinado);
        
        
        
        
        
    }//fim da main
   
}// fim da classe EntradaSaida
