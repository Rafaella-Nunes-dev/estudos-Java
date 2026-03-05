/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05_03;

import java.util.Scanner;

/**
 *Crie uma classe pessoa, coloque os seguintes atributos: nome, idade, salario.
Leia os dados da pessoa, popule o objeto com estes dados.
Imprima a pessoa a partir de um método.
Faça duas versões: leitura com Scanner e JOptionPane.
 * @author Aluno
 */
public class Pessoa {
    String nome;
    int idade;
    double salario;
    
    
    
    void imprimir()
    {
        System.out.println(nome);
        System.out.println(idade);
        System.out.println(salario);
    }
}
