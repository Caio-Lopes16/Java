/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaa;

/**
 *
 * @author Caiol
 */
public class LivroTecnico extends Livro {
    private boolean reservado;

    public LivroTecnico(String titulo, String autor, int copiasTotais) {
        super(titulo, autor, copiasTotais);
        this.reservado = false;
    }

    public void reservar() {
        reservado = true;
    }

    public void liberar() {
        reservado = false;
    }

    @Override
    public boolean emprestar() {
        if (!reservado && copiasDisponiveis > 0) {
            copiasDisponiveis--;
            return true;
        }
        return false;
    }
}
