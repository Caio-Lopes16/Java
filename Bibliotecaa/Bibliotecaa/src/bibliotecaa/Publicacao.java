/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaa;

/**
 *
 * @author Caiol
 */
public abstract class Publicacao {
    protected String titulo;
    protected int copiasTotais;
    protected int copiasDisponiveis;

    public Publicacao(String titulo, int copiasTotais) {
        this.titulo = titulo;
        this.copiasTotais = copiasTotais;
        this.copiasDisponiveis = copiasTotais;
    }

    public void imprimir() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Copias totais: " + copiasTotais);
        System.out.println("Copias disponiveis: " + copiasDisponiveis);
    }

    public boolean disponivel() {
        return copiasDisponiveis > 0;
    }

    public boolean consultar() {
        if (copiasDisponiveis > 0) {
            copiasDisponiveis--;
            return true;
        }
        return false;
    }

    public boolean retornar() {
        if (copiasDisponiveis < copiasTotais) {
            copiasDisponiveis++;
            return true;
        }
        return false;
    }
}