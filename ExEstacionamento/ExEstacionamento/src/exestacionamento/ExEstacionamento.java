/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exestacionamento;

/**
 *
 * @author 0040482411005
 */
public class ExEstacionamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CarroProprio cp1 = new CarroProprio(1, 2010, "VNCP-231", "Ford", 38000.0);
        CarroConsignado cg1 = new CarroConsignado(4, 2015, "PCNV-231", "Fiat", 35500.0, "Vinicius Carmello", 40000.0);
        
        cp1.imprimeDados();
        System.out.println("\n\n" + cp1.venderCarro("Vitor Rocha", 40000.0) + "\n\n");
        cp1.imprimeDados();
        System.out.println("\n");
        cg1.imprimeDados();
        System.out.println("\n\n" + cg1.venderCarro("Vitor Rocha", 40000.0) + "\n\n");
        cg1.imprimeDados();
    }
}
