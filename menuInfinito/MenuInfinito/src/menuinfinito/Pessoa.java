/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuinfinito;

/**
 *Pessoa = nome, salario e nascimento
 * @author Aluno
 */
public class Pessoa {
    String nome;
    double salario;
    int dia;
    int mes;
    int ano;
    
    void Mostrar(){
        System.out.println(nome);
        System.out.println(salario);
        System.out.println(dia+"/" + mes +"/"+ ano);
    }
    
    Pessoa Deletar(){
        return null;
    }
}
