/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author Caiol
 */
public class CarroProprio extends Carro {
    private double valorCompra;
    private String dataCompra;

    public CarroProprio(double valorCompra, String dataCompra, int codigo, int anoFabricacao, String modelo, String placa) {
        super(codigo, anoFabricacao, modelo, placa);
        this.valorCompra = valorCompra;
        this.dataCompra = dataCompra;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public String getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(String dataCompra) {
        this.dataCompra = dataCompra;
    }
    
    @Override
    public void imprimeDados() {
        super.imprimeDados(); // chama o imprimeDados da classe mãe
        System.out.println("Valor da Compra: " + valorCompra);
        System.out.println("Data da Compra: " + dataCompra);
    }
    
    public boolean oferta(double valor) {
        if (valor >= valorCompra * 1.10) { // 10% acima do valor de compra
            System.out.println("Oferta aceita para o carro proprio!");
            return true;
        } else {
            System.out.println("Oferta recusada para o carro proprio!");
            return false;
        }
    }
    
    public boolean venderCarro(String vendedor, double valorVenda) {
        if (!disponivel()) { // já vendido
            System.out.println("Carro proprio ja vendido!");
            return false;
        }
        if (!oferta(valorVenda)) { // oferta não aceitável
            System.out.println("Oferta insuficiente para carro proprio!");
            return false;
        }
        // Venda aceita
        setDisponivel(false);
        setVendedor(vendedor);
        System.out.println("Carro proprio vendido para " + vendedor + " por " + valorVenda);
        return true;
    }


}
