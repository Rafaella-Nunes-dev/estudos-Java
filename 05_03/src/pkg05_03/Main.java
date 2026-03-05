/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg05_03;

import java.util.Scanner;

/**
 *
 * @author Aluno
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Pessoa p1 = new Pessoa();
        
        
        System.out.println("Qual o nome da pessoa? ");
        p1.nome = s.nextLine();
        
        System.out.println("Qual idade da pessoa? ");
        p1.idade = Integer.parseInt(s.nextLine());
        
        System.out.println("Qual o salario");
        p1.salario = Double.parseDouble(s.nextLine());
        
        p1.imprimir();
    }
    
}
