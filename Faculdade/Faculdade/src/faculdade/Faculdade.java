/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package faculdade;

/**
 *
 * @author Caiol
 */
public class Faculdade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Professor p1 = new Professor("ADS", 50, "Caio", "09909", 2);
        p1.registrarAulas(5);
        p1.calcularSalario();
        p1.hollerith();
        p1.zerarMes();
    
        Funcionario f1 = new Funcionario("TI", 1250, "Alex", "11111", 3);
        f1.registraFalta();
        f1.registraFalta();
        f1.hollerith();
        f1.zerarMes();
    }
    
    
}
