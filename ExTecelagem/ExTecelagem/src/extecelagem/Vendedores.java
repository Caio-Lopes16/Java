/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author Caiol
 */
public class Vendedores extends Pessoa {
    public double vendas;

    public Vendedores(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        this.vendas = 0;
    }
    
    public void registrarVenda(double valor){
        vendas += valor;
    }
     
    @Override
    public double salarioLiquido(){
        double totalVendas = vendas * 1.03;
        return salarioBase + totalVendas;
    }
    
    public void hollerith(){
        super.hollerith();
        System.out.println("Vendas: " + vendas);
        System.out.println("Salario Liquido: " + salarioLiquido());
    }
    
    @Override
    public void novoMes(){
        vendas = 0;
    }
    
}
