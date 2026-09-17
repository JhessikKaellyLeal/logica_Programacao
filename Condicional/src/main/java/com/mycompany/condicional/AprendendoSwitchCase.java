
package com.mycompany.condicional;

import java.util.Scanner;

public class AprendendoSwitchCase {
    public static void main(String[] args) {
        
        // Sistema de Agendamento de Serviços Pet
        
        String nomePet, racaPet;
        int idadePet, opcaoServico;
        
        Scanner entradaTexto = new Scanner(System.in);
        Scanner entradaNumero = new Scanner(System.in);
        
        // solicitar os dados
        
        System.out.println("Ola, para iniciarmos digite o nome do pet");
        nomePet = entradaTexto.nextLine();
        System.out.println("Bem vindo(a) "+nomePet+", qual a sua raca?");
        racaPet = entradaTexto.nextLine();
        System.out.println("Agora que sabemos sua raca, "
                + "nos diga a sua idade");
        idadePet = entradaNumero.nextInt();
        System.out.println("Escolha um de nossos servicos:");
        System.out.println("1-Tosa\n2-Banho\n3-Banho e Tosa\n4-Veterinario");
        opcaoServico = entradaNumero.nextInt();
        
        // analisando o serviço com Switch Case
        
        switch (opcaoServico){
            case 1:
                System.out.println(nomePet+" voce possui "+idadePet+
                        " anos de idade, e da raca "+racaPet+
                        " e escolheu o servico Tosa.");
               break;
            case 2:
                System.out.println(nomePet+" voce possui "+idadePet+
                        " anos de idade, e da raca "+racaPet+
                        " e escolheu o servico Banho.");
                break;
            case 3:
                System.out.println(nomePet+" voce possui "+idadePet+
                        " anos de idade, e da raca "+racaPet+
                        " e escolheu o servico Banho e Tosa.");
                break;
            case 4:
                System.out.println(nomePet+" voce possui "+idadePet+
                        " anos de idade, e da raca "+racaPet+
                        " e escolheu o servico Veterinario.");
                break;
            default:
                System.out.println("A opcao escolhida é invalida!");
                break;
            
        }// fim do switch case
    }
}
