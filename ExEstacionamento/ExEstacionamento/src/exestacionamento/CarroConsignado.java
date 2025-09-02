/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exestacionamento;

import java.time.LocalDate;

/**
 *
 * @author 0040482411005
 */
public class CarroConsignado extends CarroProprio {
    private String proprietario;
    private double valorDesejado;

    public CarroConsignado(int codigo, int ano, String placa, String modelo, double valorCompra, String proprietario, double valorDesejado) {
        super(codigo, ano, placa, modelo, valorCompra);
        this.proprietario = proprietario;
        this.valorDesejado = valorDesejado;
    }
    
    @Override
    public boolean oferta(double valor) {
        double valorCompra = getValorCompra();
        return valor > (valorCompra) + (valorCompra * 0.05);
    }
    
    @Override
    public boolean venderCarro(String vendedor, double valorVenda) {
        if (oferta(valorVenda) && valorVenda >= valorDesejado && isDisponivel()) {
            setValorCompra(valorVenda);
            setDataCompra(LocalDate.now());
            setVendedor(vendedor);
            setDisponivel(false);
            return true;
        } else {
            return false;
        }
    }
    
    @Override
    public void imprimeDados() {
        System.out.println("CODIGO: " + getCodigo() + "\nANO: " + getAno() + "\nPLACA: " + getPlaca() + "\nMODELO: " + getModelo() + "\nDISPONÍVEL?: " + isDisponivel() + "\nVENDEDOR: " + getVendedor() + "\nVALOR DE COMPRA: " + getValorCompra() + "\nDATA DA COMPRA: " + getDataCompra() + "\nPROPRIETÁRIO: " + proprietario + "\nVALOR DESEJADO: " + valorDesejado);
    }
}
