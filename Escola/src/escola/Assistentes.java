/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author Caiol
 */
public class Assistentes extends Aluno {
    
    public Assistentes(String nome, String ra, int faltas) {
        super(nome, ra, faltas);
    }
    
    public boolean aprovado(){
        if(frequencia() < 0){
            System.out.println("ERRO");
            return false;
        } 
        
        if(frequencia() >= 75){ 
            return true; 
        } else {
            return false;
        } 
    }
    
    public void print(){
        super.print();
        System.out.println("\nAprovado: " + (aprovado() ? "sim" : "nao"));
    }
    
}
