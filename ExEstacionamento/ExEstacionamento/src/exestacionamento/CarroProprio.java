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
public class CarroProprio {
    private int codigo, ano;
    private String placa, modelo, vendedor;
    private boolean disponivel;
    private double valorCompra;
    private LocalDate dataCompra;

    // Constructor
    /**
     * 
     * @param codigo codigo do carro
     * @param ano ano do carro
     * @param placa placa do carro
     * @param modelo modelo do carro
     * @param valorCompra valor de compra do carro
     */
    public CarroProprio(int codigo, int ano, String placa, String modelo, double valorCompra) {
        this.codigo = codigo;
        this.ano = ano;
        this.placa = placa;
        this.modelo = modelo;
        this.valorCompra = valorCompra;
        dataCompra = LocalDate.now();
        
        vendedor = "";
        disponivel = true;
    }

    public double getValorCompra() {
        return valorCompra;
    }

    public void setValorCompra(double valorCompra) {
        this.valorCompra = valorCompra;
    }

    public LocalDate getDataCompra() {
        return dataCompra;
    }

    public void setDataCompra(LocalDate dataCompra) {
        this.dataCompra = dataCompra;
    }

    // Getters Setters
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getVendedor() {
        if ("".equals(vendedor)) {
            return "N/A";
        } else {
            return vendedor;   
        }
    }
    
    // Etc.
    /**
     * 
     * @param valor a oferta a fazer
     * @return se é aceitável ou não
     */
    public boolean oferta(double valor) {
        return valor > (valorCompra) + (valorCompra * 0.1);
    }
    
    public boolean venderCarro(String vendedor, double valorVenda) {
        if (oferta(valorVenda) && isDisponivel()) {
            valorCompra = valorVenda;
            dataCompra = LocalDate.now();
            setVendedor(vendedor);
            setDisponivel(false);
            return true;
        } else {
            return false;
        }
    }
        
    public void imprimeDados() {
        System.out.println("CODIGO: " + codigo + "\nANO: " + ano + "\nPLACA: " + placa + "\nMODELO: " + modelo + "\nDISPONÍVEL?: " + isDisponivel() + "\nVENDEDOR: " + getVendedor() + "\nVALOR DE COMPRA: " + valorCompra + "\nDATA DA COMPRA: " + dataCompra);
    }
}
