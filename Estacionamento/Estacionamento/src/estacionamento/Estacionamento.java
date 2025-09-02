/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package estacionamento;

/**
 *
 * @author Caiol
 */
public class Estacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Criando um carro próprio
        CarroProprio cp = new CarroProprio(50000, "10/01/2024", 1, 2020, "Civic", "ABC-1234");

        // Criando um carro consignado
        CarroConsignado cc = new CarroConsignado("João", 40000, 2, 2019, "Corolla", "XYZ-5678");

        // Imprimindo os dados iniciais
        System.out.println("=== Dados iniciais ===");
        cp.imprimeDados();
        System.out.println("--------------------");
        cc.imprimeDados();
        System.out.println("--------------------");

        // Tentando vender os carros
        cp.venderCarro("Maria", 55000);  // oferta acima de 10%
        cc.venderCarro("Pedro", 41000);  // oferta acima de 5%

        // Imprimindo os dados após tentativa de venda
        System.out.println("=== Dados após venda ===");
        cp.imprimeDados();
        System.out.println("--------------------");
        cc.imprimeDados();
        System.out.println("--------------------");
    }
}


