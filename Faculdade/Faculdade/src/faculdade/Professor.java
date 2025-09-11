/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Caiol
 */
public class Professor extends Pessoa {
    public String curso;
    public int aulasDadas;
    public double valorAula;

    public Professor(String curso, double valorAula, String nome, String rg, int qtdFilhos) {
        super(nome, rg, qtdFilhos);
        this.curso = curso;
        //this.aulasDadas = aulasDadas;
        this.valorAula = valorAula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public int getAulasDadas() {
        return aulasDadas;
    }

    public void setAulasDadas(int aulasDadas) {
        this.aulasDadas = aulasDadas;
    }

    public double getValorAula() {
        return valorAula;
    }

    public void setValorAula(double valorAula) {
        this.valorAula = valorAula;
    }
    
    public void registrarAulas(int Qtd){
        this.aulasDadas = Qtd;
    }
    
    @Override
    public double calcularSalario(){
        return (aulasDadas * valorAula) + calcularFilho();
    }
    
    public void hollerith(){
        System.out.println("Nome: " + getNome() +
                            "\nRG: " + getRg() +
                            "\nCurso: " + getCurso() +
                            "\nFilhos: " + getQtdFilhos() +
                            "\nAulas: " + getAulasDadas() +
                            "\nValor Aula: " + getValorAula()+
                            "\nAuxilio Filho: " + calcularFilho()+
                            "\nSalario: " + calcularSalario()
                );
    }
    
    @Override
    public void zerarMes(){
        aulasDadas = 0;
    }
            
}
