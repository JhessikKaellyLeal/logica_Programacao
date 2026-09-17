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
public class Exemplo3 {
    public static void main(String[] args) {
        
      //variaveis
      int idadeP1 , idadeP2, idadeP3;
      
      //Scanner
      Scanner entradaNumero = new Scanner(System.in);
      
      // solicitar os dados ao usuário
        System.out.println("Digite a idade da Pessoa 1:");
        idadeP1 = entradaNumero.nextInt();
        
        System.out.println("Digite a idade da Pessoa 2");
        idadeP2 = entradaNumero.nextInt();
        
        System.out.println("Digite a idade da Pessoa 3");
        idadeP3 = entradaNumero.nextInt();
        
        // avaliando as idade
        if(idadeP1>idadeP2 || idadeP1<idadeP3){
            System.out.println("Pessoa 1 ganha um brinde");
        }if(idadeP2>idadeP3 && idadeP2>idadeP1){
            System.out.println("Pessoa 2 ganha um brinde");
        }if((idadeP3<idadeP1 || idadeP3<idadeP2) && idadeP2>idadeP1){
            System.out.println("Pessoa 3 ganha um brinde");
        }
        
    }
}
