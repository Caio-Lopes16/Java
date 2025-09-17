/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaa;

/**
 *
 * @author Caiol
 */
public abstract class Livro extends Publicacao {
    protected String autor;

    public Livro(String titulo, String autor, int copiasTotais) {
        super(titulo, copiasTotais);
        this.autor = autor;
    }

    public boolean emprestar() {
        if (copiasDisponiveis > 0) {
            copiasDisponiveis--;
            return true;
        }
        return false;
    }

    public boolean devolver() {
        if (copiasDisponiveis < copiasTotais) {
            copiasDisponiveis++;
            return true;
        }
        return false;
    }

    @Override
    public void imprimir() {
        System.out.println("Autor: " + autor);
        super.imprimir();
        
    }
}