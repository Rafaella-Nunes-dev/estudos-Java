/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menuinfinito;

/**
 * Exibir, imc e destruir
*  Paciente = nome, altura e peso
 */
public class Paciente {
    String nome;
    double altura;
    double peso;
    
    
    void Mostrar()
    {
        System.out.println(nome);
        System.out.println(altura);
        System.out.println(peso);
    }
    
    double CalcularIMC()
    {
         double IMC = peso / (Math.pow(altura, 2));
        
        return IMC;
    }
    
    String QualIMC(double IMC)
    {
        if(IMC<20){
            return "Magro";
        } else if(IMC >20 && IMC <24){
            return "Normal";
        }else if(IMC>24 && IMC <29)
        {
            return "Acima do peso";
        } else if(IMC>=29 && IMC <34){
            return "Obeso";
        } else{
            return "Muito Obeso";
        }
    }
    
    Paciente Deletar(){
        return null;
    }
}
