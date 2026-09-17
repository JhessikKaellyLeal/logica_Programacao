/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.condicional;

import java.util.Scanner;

/**
 *
 * @author JhéssikLeal
 */
public class Condicional {

    public static void main(String[] args) {
        
       /*Condicional é o codigo utilizado para avaliar dados,
        e se for verdadeiro realiza uma ação, 
        e se for falso realiza outra ação.
        SE - IF
        SENÃO -ELSE
        
        TABELA LOGICA:
        > MAIOR QUE
        < MENOR QUE
        >= MAIOR OU IGUAL
        <= MENOR OU IGUAL
        == IGUAL
        =! DIFERENTE
        */ 
       
       // váriavel 
       int idade;
       
       // váriavel de entrada de dados
       Scanner entradaNumero = new Scanner(System.in);
       
       //solicitação para o usuário
        System.out.println("Digite a sua idade:");
        idade = entradaNumero.nextInt();
        
        //análise da idade (processamento)
        
        if(idade>=18){
            System.out.println("voce e maior de idade");
        }else{
            System.out.println("voce e menor de idade");
        }// fim do else
        
    }
}
