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
public class DesafioWhile {
    public static void main(String[] args) {
        // variaveis necessárias
       ArrayList<String> funcionarios = new ArrayList<>();
       ArrayList<String> horarios = new ArrayList<>();
       boolean continuar= true;
       Scanner entradaTexto = new Scanner(System.in);
       // essas guardam os dados antes de ir para a lista
       String funcionario;
       String horario;
       
       while(continuar){
           System.out.println("Digite o nome do funcionario, ou sair");
           funcionario = entradaTexto.nextLine();
           
           if(funcionario.equalsIgnoreCase("sair")){
               continuar=false;
               break;
           }
           System.out.println("Digite o horario de trabalho:");
           horario = entradaTexto.nextLine();
           
           funcionarios.add(funcionario);
           horarios.add(horario);
        }
       
        
        
    }
}
