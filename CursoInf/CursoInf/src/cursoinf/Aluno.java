/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cursoinf;

/**
 *
 * @author Caiol
 */
public class Aluno {
    private int codAluno;
    private String nomeAluno;
    private double media;
    private int qtdFaltas;

    public Aluno(int codAluno, String nomeAluno) {
        this.codAluno = codAluno;
        this.nomeAluno = nomeAluno;
        media = 0;
        qtdFaltas = 0;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public String getNomeAluno() {
        return nomeAluno;
    }

    public void setNomeAluno(String nomeAluno) {
        this.nomeAluno = nomeAluno;
    }

    public double getMedia() {
        return media;
    }

    public void setMedia(double media) {
        this.media = media;
    }

    public int getQtdFaltas() {
        return qtdFaltas;
    }

    public void setQtdFaltas(int qtdFaltas) {
        this.qtdFaltas = qtdFaltas;
    }
    
    public void registrarFaltaAluno(){
        qtdFaltas++;
    }
    
    
    
}
