/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg05_03;

import javax.swing.JOptionPane;


/**
 *
 * @author Aluno
 */
public class AJOptionPane {
    public static void main(String[] args) {
        Pessoa p2 = new Pessoa();
        
        p2.nome = JOptionPane.showInputDialog("Qual seu nome? ");
        
        p2.idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade? "));
        
        p2.salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu Salário? "));
        
        p2.imprimir();
    }
    
}
