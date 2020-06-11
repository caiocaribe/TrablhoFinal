/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalocacao.locacao;

/**
 *
 * @author Darth
 */
public abstract class Veiculos {
    protected String modelo;
    protected String marca;
    protected double precodia;
    protected double multadia;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecodia() {
        return precodia;
    }

    public void setPrecodia(double precodia) {
        this.precodia = precodia;
    }

    public double getMultadia() {
        return multadia;
    }

    public void setMultadia(double multadia) {
        this.multadia = multadia;
    }
    
    
    
}

