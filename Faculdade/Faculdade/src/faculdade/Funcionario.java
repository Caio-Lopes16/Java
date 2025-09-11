/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Caiol
 */
public class Funcionario extends Pessoa {
    public String departamento;
    public double salarioFixo;
    public int faltas;

    public Funcionario(String departamento, double salarioFixo, String nome, String rg, int qtdFilhos) {
        super(nome, rg, qtdFilhos);
        this.departamento = departamento;
        this.salarioFixo = salarioFixo;
        this.faltas = 0;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public void setSalarioFixo(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    
    public void registraFalta(){
        faltas += 1;
    }
    
    @Override 
    public double calcularSalario(){
        double desconto = (salarioFixo / 20) * faltas;
        return (salarioFixo - desconto + 42) + calcularFilho(); 
    }
    
    public void hollerith(){
        System.out.println("\nNome: " + getNome() +
                            "\nRG: " + getRg() +
                            "\nDepartamento: " + getDepartamento() +
                            "\nFilhos: " + getQtdFilhos() +
                            "\nFaltas: " + getFaltas() +
                            "\nSalario Fixo: " + getSalarioFixo()+
                            "\nAuxilio Filho: " + calcularFilho()+
                            "\nSalario Final: " + calcularSalario()
                );
    }
    
    public void zerarMes(){
        faltas = 0;
    }
}
