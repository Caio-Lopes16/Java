/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author Caiol
 */
public class CarroConsignado extends Carro{
    private String proprietario;
    private double valorReceber;

    public CarroConsignado(String proprietario, double valorReceber, int codigo, int anoFabricacao, String modelo, String placa) {
        super(codigo, anoFabricacao, modelo, placa);
        this.proprietario = proprietario;
        this.valorReceber = valorReceber;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public double getValorReceber() {
        return valorReceber;
    }

    public void setValorReceber(double valorReceber) {
        this.valorReceber = valorReceber;
    }
    
    @Override
    public void imprimeDados() {
        super.imprimeDados(); // imprime os dados básicos do Carro
        System.out.println("Proprietario: " + proprietario);
        System.out.println("Valor a Receber: " + valorReceber);
    }
    
    public boolean oferta(double valor) {
        if (valor >= valorReceber * 1.05) { // 5% acima do valor desejado
            System.out.println("Oferta aceita para o carro consignado!");
            return true;
        } else {
            System.out.println("Oferta recusada para o carro consignado!");
            return false;
        }
    }

    public boolean venderCarro(String vendedor, double valorVenda) {
        if (!disponivel()) { // já vendido
            System.out.println("Carro consignado ja vendido!");
            return false;
        }
        if (!oferta(valorVenda)) { // oferta não aceitável
            System.out.println("Oferta insuficiente para carro consignado!");
            return false;
        }
        // Venda aceita
        setDisponivel(false);
        setVendedor(vendedor);
        System.out.println("Carro consignado vendido para " + vendedor + " por " + valorVenda);
        return true;
    }
   
}
