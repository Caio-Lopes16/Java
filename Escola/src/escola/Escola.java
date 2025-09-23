/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package escola;

/**
 *
 * @author Caiol
 */
public class Escola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Regulares r1 = new Regulares("Caio", "123131", 4, 5, 10);
        
        r1.print();
        System.out.println("\n\n");
        Assistentes a1 = new Assistentes("Alex", "19299199", 18);
        
        a1.print();
                
    }
    
}
