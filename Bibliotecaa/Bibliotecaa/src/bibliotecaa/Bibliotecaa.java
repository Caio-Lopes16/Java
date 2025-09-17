/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bibliotecaa;

/**
 *
 * @author Caiol
 */
public class Bibliotecaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LivroNaoTecnico lnt = new LivroNaoTecnico("Dom Casmurro", "Machado de Assis", 3);
        LivroTecnico lt = new LivroTecnico("Engenharia de Software", "Pressman", 2);
        Periodico p = new Periodico("Revista Ciencia Hoje", 45, 5);

        lnt.imprimir();
        lnt.emprestar();
        lnt.imprimir();
        System.out.println("\n");
        
        lt.imprimir();
        lt.reservar();
        System.out.println("\nTentando emprestar livro tecnico reservado: " + lt.emprestar());
        lt.liberar();
        System.out.println("\nAgora pode emprestar: " + lt.emprestar());

        System.out.println("\n");
        p.imprimir();
        System.out.println("Tentando emprestar periodico: (não permitido) ");
        //p.emprestar(); // não existe, só consulta
        System.out.println("Consultando periodico: " + p.consultar());
        p.imprimir();
        p.retornar();
        p.imprimir();
    }
}


