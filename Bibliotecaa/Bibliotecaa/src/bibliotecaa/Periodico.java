/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bibliotecaa;

/**
 *
 * @author Caiol
 */
public class Periodico extends Publicacao {
    //Aqui só pode consultar e retornar
    private int volume;

    public Periodico(String titulo, int volume, int copiasTotais) {
        super(titulo, copiasTotais);
        this.volume = volume;
    }

    @Override
    public void imprimir() {
        super.imprimir();
        System.out.println("Volume: " + volume);
    }
}