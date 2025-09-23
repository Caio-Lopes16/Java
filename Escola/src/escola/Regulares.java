/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package escola;

/**
 *
 * @author Caiol
 */
public class Regulares extends Aluno {
    public int nota1, nota2;

    public Regulares(String nome, String ra, int faltas, int nota1, int nota2) {
        super(nome, ra, faltas);
        this.nota1 = nota1;
        this.nota2 = nota2;
    }
    
    public double media(){
        return (nota1+nota2)/2;
    }
    
    public boolean aprovado(){
        if(frequencia() < 0 || media() < 0){
            System.out.println("ERRO");
            return false;
        } 
        
        if(frequencia() >= 75 && media() >= 6){ 
            return true; 
        } else {
            return false;
        } 
    }
    
    public void print(){
        super.print();
        System.out.format("\nMedia Nota: %.2f", media());
        System.out.println("\nAprovado: " + (aprovado() ? "sim" : "nao"));
    }
        
    
}
