/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lacorepeticao;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JhéssikLeal
 */
public class While {
    public static void main(String[] args) {
        // tipos de variaveis simples
        int numero = 2;
        double valor = 34.9;
        float dinheiro = 12;
        String nomes = "rodrigo";
        boolean status = true;// ou false
        
        // tipos de variaveis complexas
        int[] idades = new int[20];// vetores- Array
        int[][] contribuicao = new int[3][4];//matriz
        
        idades[0]=20;
        idades[1]=23;
        
        contribuicao[0][0]= 40;
        contribuicao[1][0]=30;
        // ARRAY LIST
        /* O ArrayList é uma lista dinâmica. 
        Diferentemente do array comum, ele pode aumentar 
        ou diminuir de tamanho durante a execução 
        do programa.
        */
        ArrayList<String> alunos = new ArrayList<>();
        String nome;
        // permitir que o professor cadastre os nomes 
        Scanner entrada = new Scanner(System.in);
        
        boolean continuar= true;
        // enquanto a pessoa não digitar a palavra sair
        // o while continuan a executar, quando ele digitar
        // sair, o true vira false e o while para.
        while(continuar){
            System.out.println("Digite um nome, caso deseje sair"
                    + "digite sair");
            nome = entrada.nextLine();
            
            // verificar se ele digitou a palavra sair
            // se nome for diferente de sair
            if(!nome.equalsIgnoreCase("sair")){
                alunos.add(nome);//adicionando o aluno na lista
            }else{
                continuar=false;
            }
        }   
        
    }  
}
