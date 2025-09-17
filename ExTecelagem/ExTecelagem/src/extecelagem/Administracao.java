/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author Caiol
 */
public class Administracao extends Pessoa {
    public int faltas;

    public Administracao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        this.faltas = 0;
    }
    
    public void registrarFalta(){
        faltas++;
    }
    
    @Override
    public double salarioLiquido(){
        double desconto = (salarioBase / 30) * faltas;
        return salarioBase - desconto;
    }
    
    public void hollerith(){
        super.hollerith();
        System.out.println("Faltas: " + faltas);
        System.out.println("Salario Liquido: " + salarioLiquido());
    }
    
    @Override
    public void novoMes(){
        faltas = 0;
    }
    
    
}
