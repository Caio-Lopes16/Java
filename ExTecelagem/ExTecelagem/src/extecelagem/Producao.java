/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extecelagem;

/**
 *
 * @author Caiol
 */
public class Producao extends Pessoa {
    public int horasDiurnas, horasNoturnas;

    public Producao(String nome, String rg, double salarioBase) {
        super(nome, rg, salarioBase);
        this.horasDiurnas = 0;
        this.horasNoturnas = 0;
    }
    
    public void registrarHorasDiurnas(int horas){
        horasDiurnas += horas;
    }
    
    public void registrarHorasNoturnas(int horas){
        horasNoturnas += horas;
    }
    
    @Override
    public double salarioLiquido(){
        double diurna = salarioBase * horasDiurnas;
        double noturna = (salarioBase * 1.3) * horasNoturnas;
        return diurna + noturna;
    }
    
    public void hollerith(){
        super.hollerith();
        System.out.println("Horas Noturnas: " + horasNoturnas);
        System.out.println("Horas Diurnas: " + horasDiurnas);
        System.out.println("Salario Liquido: " + salarioLiquido());
    }
    
    @Override
    public void novoMes(){
        horasDiurnas = 0;
        horasNoturnas = 0;
    }
    
}
