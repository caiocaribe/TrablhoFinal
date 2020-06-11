/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemalocacao.revisao;

import sistemalocacao.locacao.Veiculos;

public class Carro extends Veiculos implements Carrointerface {
    
   private double quilometragem;
   private Dono dono;
   private String cor;
   private String placa;
   private double precoTotal;

    @Override
    public boolean revisao() {
        if(quilometragem > 0 && quilometragem <= 5000){
           this.setPrecoTotal(100.00);
           return true;
        }else if(quilometragem >5000 && quilometragem <= 10000){
            this.setPrecoTotal(chaparia()+trocaPneu()+100.00);
            return true;
        }else{
           return false;
        }
     
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

    public double getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(double quilometragem) {
        this.quilometragem = quilometragem;
    }

    public Dono getDono() {
        return dono;
    }

    public void setDono(Dono dono) {
        this.dono = dono;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public double chaparia() {
        return 100.00;
    }

    @Override
    public double trocaPneu() {
        return 100.00;
    }
   
    
    
}
