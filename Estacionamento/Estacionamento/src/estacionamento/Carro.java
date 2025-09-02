/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estacionamento;

/**
 *
 * @author Caiol
 */
public class Carro {
    private int codigo, anoFabricacao;
    private String modelo, placa; 
    private boolean disponivel;
    private String vendedor;

    public Carro(int codigo, int anoFabricacao, String modelo, String placa) {
        this.codigo = codigo;
        this.anoFabricacao = anoFabricacao;
        this.modelo = modelo;
        this.placa = placa;
        this.disponivel = true;
        this.vendedor = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public boolean disponivel() {
        return disponivel;
    }

    public void imprimeDados() {
        System.out.println("Codigo: " + codigo);
        System.out.println("Ano de Fabricacao: " + anoFabricacao);
        System.out.println("Modelo: " + modelo);
        System.out.println("Placa: " + placa);
        System.out.println("Disponivel: " + disponivel);
        if (!disponivel) {
            System.out.println("Vendido por: " + vendedor);
        }
    }

}
