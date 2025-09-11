/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package faculdade;

/**
 *
 * @author Caiol
 */
public abstract class Pessoa {
    public String nome, rg;
    public int qtdFilhos;

    public Pessoa(String nome, String rg, int qtdFilhos) {
        this.nome = nome;
        this.rg = rg;
        this.qtdFilhos = qtdFilhos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public int getQtdFilhos() {
        return qtdFilhos;
    }

    public void setQtdFilhos(int qtdFilhos) {
        this.qtdFilhos = qtdFilhos;
    }
    
    public double calcularFilho(){
        return qtdFilhos * 100;
    }

    public abstract double calcularSalario();
    public abstract void hollerith();
    public abstract void zerarMes();
}

