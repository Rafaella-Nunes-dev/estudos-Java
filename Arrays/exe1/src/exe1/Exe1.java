/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe1;

/**
 * *
Crie um vetor de pessoas. Este vetor deve suportar até 3 pessoas.
Popule as 3 pessoas dentro de um lado.
Depois que vetor tiver cheio, imprima as 3 pessoas do vetor.
 * @author Aluno
 */
public class Exe1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[3];
        
        pessoas[0] = new Pessoa();
        
        pessoas[0].nome = "Rafaella";
        pessoas[0].idade = 19;
        pessoas[0].peso = 58.3;
        
        pessoas[1] = new Pessoa();
        
        pessoas[1].nome = "Eduardo";
        pessoas[1].idade = 22;
        pessoas[1].peso = 59.5;
        
        pessoas[2] = new Pessoa();
        
        pessoas[2].nome = "Marcella";
        pessoas[2].idade = 19;
        pessoas[2].peso = 48.3;
        
        System.out.println( pessoas[0].toString());
       System.out.println( pessoas[1].toString());
        System.out.println(pessoas[2].toString());
        
        
    }
    
}
