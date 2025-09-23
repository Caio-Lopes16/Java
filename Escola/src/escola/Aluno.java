/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author Caiol
 */
public abstract class Aluno {
    private String nome, ra;
    private int faltas;

    public Aluno(String nome, String ra, int faltas) {
        this.nome = nome;
        this.ra = ra;
        this.faltas = faltas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public int getFaltas() {
        return faltas;
    }

    public void setFaltas(int faltas) {
        this.faltas = faltas;
    }
    
    //Outros
    public double frequencia(){
        return ((72 - faltas)/72.0)*100;
    }
    
    public abstract boolean aprovado();
    
    public void print(){
        System.out.format("Nome: %s \nRA: %s \nFaltas: %d", nome, ra, faltas);
    }
    
            
}
