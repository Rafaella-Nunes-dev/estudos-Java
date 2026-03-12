/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exe2;

/**
 *
 * @author Aluno
 */
public class Exe2 {

    /**Copiar a classe FUncionario e Empresa a seguir.
Fazer a classe de testes.
Popular a empresa.
Encher a empresa de funcionarios.
Imprimir todos os funcionários com toString.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        empresa.nome = "Grupo ODEIO";
        empresa.cnpj = "0010001-00/0001";
        empresa.empregados = new Funcionario[4];
        
        Funcionario f1 = new Funcionario();
        f1.nome = "Rafaella";
        f1.salario = 2355;
        
        if(empresa.adiciona(f1))
        {
            System.out.println("Funcionario adicionado");
        } else {
            System.out.println("Funcionario nao adicionado");
        }
        
        Funcionario f2 = new Funcionario();
        f2.nome = "Maria eduarda";
        f2.salario = 100000;
         if(empresa.adiciona(f2))
        {
            System.out.println("Funcionario adicionado");
        } else {
            System.out.println("Funcionario nao adicionado");
        }
        
        
        Funcionario f3 = new Funcionario();
        f3.nome = "Kimberly";
        f3.salario = 20000;
         if(empresa.adiciona(f3))
        {
            System.out.println("Funcionario adicionado");
        } else {
            System.out.println("Funcionario nao adicionado");
        }
        
        
        Funcionario f4 = new Funcionario();
        f4.nome = "Arthur";
        f4.salario = 22000;
        
         if(empresa.adiciona(f4))
        {
            System.out.println("Funcionario adicionado");
        } else {
            System.out.println("Funcionario nao adicionado");
        }
        
        
        empresa.adiciona(f1);
        empresa.adiciona(f2);
        empresa.adiciona(f3);
        empresa.adiciona(f4);
        
        for (int i = 0; i < empresa.empregados.length; i++) {
            if()
            String arg = args[i];
            
        }
        
        for (Funcionario e : empresa.empregados) {
            if(empresa.empregados)
            System.out.println(e.toString());
        }
        
    }
    
}
