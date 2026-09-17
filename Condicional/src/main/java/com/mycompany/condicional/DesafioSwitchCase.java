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
public class DesafioSwitchCase {
    public static void main(String[] args) {
        
        //variaveis
        int numeroProduto, quantidade;
        double valorTotal;
        
        //scanner
        Scanner entradaNumero = new Scanner(System.in);
        
        //SOLICITAR OS DADOS
        System.out.println("Escolha uma das opcoes do menu:");
        System.out.println("========= LANCHONETE =========");
        System.out.println("1 - Hamburguer ........ R$ 15,00\n"+
                "2 - Pizza .............. R$ 25,00\n"+
                "3 - Cachorro-quente .... R$ 12,00\n"+
                "4 - Refrigerante ....... R$ 6,00\n"+
                "5 - Suco ............... R$ 8,00\n");
        numeroProduto = entradaNumero.nextInt();
        System.out.println("Quantas unidades voce deseja?");
        quantidade = entradaNumero.nextInt();
        
        // SWITCH CASE
        
        switch(numeroProduto){
            case 1:
                valorTotal= 15*quantidade;
                System.out.println("======Pedido=========");
                System.out.println("Produto: Hamburguer\nQuantidade:"+quantidade+"\nPreco unitario:R$15,00\n"+"Valor total:"+valorTotal);
                break;
                
                case 2:
                valorTotal= 25*quantidade;
                System.out.println("======Pedido=========");
                System.out.println("Produto: Pizza\nQuantidade:"+quantidade+"\nPreco unitario:R$25,00\n"+"Valor total:"+valorTotal);
                break;
                
                case 3:
                valorTotal= 12*quantidade;
                System.out.println("======Pedido=========");
                System.out.println("Produto: Cachorro-quente\nQuantidade:"+quantidade+"\nPreco unitario:R$12,00\n"+"Valor total:"+valorTotal);
                break;
                
                case 4:
                valorTotal= 6*quantidade;
                System.out.println("======Pedido=========");
                System.out.println("Produto: Refrigerante\nQuantidade:"+ quantidade+"\nPreco unitario:R$6,00\n"+"Valor total:"+valorTotal);
                break;
                
                case 5:
                valorTotal= 8*quantidade;
                System.out.println("======Pedido=========");
                System.out.println("Produto: suco\nQuantidade:"+quantidade+"\nPreco unitario:R$8,00\n"+"Valor total:"+valorTotal);
                break;
                
                default:
                    System.out.println("Opcao de produto invalido!");
                    break;
            
        }//fim do switch
        
        
    }
    
}
