/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package extecelagem;

/**
 *
 * @author Caiol
 */
public class ExTecelagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Administracao a1 = new Administracao("Vittoria", "12340922", 1500);
        a1.registrarFalta();
        a1.registrarFalta();
        a1.hollerith();
        a1.novoMes();
        System.out.println("\n");
        
        Producao p1 = new Producao("Vittoria", "12340922", 15);
        p1.registrarHorasDiurnas(400);
        p1.registrarHorasNoturnas(50);
        p1.hollerith();
        p1.novoMes();
        System.out.println("\n");
        
        Vendedores v1 = new Vendedores("Vivi", "123131", 1000);
        v1.registrarVenda(5000);
        v1.hollerith();
        v1.novoMes();
        
                
                
                
        
    }
    
}
