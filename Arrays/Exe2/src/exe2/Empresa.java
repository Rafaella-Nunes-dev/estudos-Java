package exe2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Aluno
 */
public class Empresa {
    String nome;
    String cnpj;
    Funcionario [] empregados;
     
    boolean adiciona(Funcionario f) {
        for (int i = 0; i < empregados.length; i++) {
            if (empregados[i] == null) {
                empregados[i] = f;
                return true;
            }
        }
        
        return false;
    }
}

