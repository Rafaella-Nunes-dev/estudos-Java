/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package menuinfinito;

import java.util.Scanner;

/**
 * um programa infinito em java que contenha um menu de opções.
SEJA BEM VINDO AO PROGRAMA.
ESCOLHA SUA OPÇÃO:
1 - Criar uma Pessoa (nome, salario e nascimento)
2 - Exibir a Pessoa
3 - Destruir a Pessoa
4 - Criar um Paciente (nome, peso, altura)
5 - Exibir o Paciente
6 - Exibe o IMC do Paciente (peso /altura^2)
7 - Destruir o Paciente
8 - Exibe a idade que a Pessoa fará em 202X
	(c/ sua data de nascimento)(10/01/1990)
9 - Sair

Pessoa = nome, salario e nascimento
Paciente = nome, altura e peso

OBS1: faça 1 versão c/ Scanner e 1 versão c/ JOPtionPane
OBS2: não deixe erros nas opções 2, 5, 6 e 8
 * @author Aluno
 */
public class MenuInfinito {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int Menu =0;
        
        while(Menu !=9)
        {
            System.out.println("SEJA BEM VINDO AO PROGRAMA");
            System.out.println("ESCOLHA SUA OPCAO:");
            System.out.println("1 - Criar uma Pessoa (nome, salario e nascimento)\n" +
                "2 - Exibir a Pessoa\n" +
                "3 - Destruir a Pessoa\n" +
                "4 - Criar um Paciente (nome, peso, altura)\n" +
                "5 - Exibir o Paciente\n" +
                "6 - Exibe o IMC do Paciente (peso /altura^2)\n" +
                "7 - Destruir o Paciente\n" +
                "8 - Exibe a idade que a Pessoa fará em 2026\n" +
                "	(c/ sua data de nascimento)(10/01/1990)\n" +
                "9 - Sair");
            
            System.out.println("ESCOLHA SUA OPCAO: ");
            Menu = Integer.parseInt(s.nextLine());
            
            if(Menu == 9)
                System.out.println("OBRIGADA POR ESCOLHER PROGRAMA...");
            else if(Menu ==1){
                System.out.println("1 - Criar uma Pessoa (nome, salario e nascimento)\n");
            }
            else if(Menu ==2){
                System.out.println("2 - Exibir a Pessoa\n");
            }
            else if(Menu ==3){
                System.out.println("3 - Destruir a Pessoa\n");
            }
            else if(Menu ==4){
                System.out.println("4 - Criar um Paciente (nome, peso, altura)");
            }
            else if(Menu ==5){
                System.out.println("5 - Exibir o Paciente\n\n");
            }
            else if(Menu ==6){
                System.out.println("6 - Exibe o IMC do Paciente (peso /altura^2)\n");
            }
            else if(Menu ==7){
                System.out.println("7 - Destruir o Paciente\n");
            }
            else if(Menu ==8){
                System.out.println("8 - Exibe a idade que a Pessoa fará em 2026\n");
            }
        }
    }
    
}
