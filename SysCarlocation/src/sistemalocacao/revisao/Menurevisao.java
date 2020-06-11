package sistemalocacao.revisao;

import javax.swing.JOptionPane;

public class Menurevisao {
    public void rodarmenurevisao(){
    
        JOptionPane.showMessageDialog(null, "BEM VINDO AO SISTEMA DE REVISÃO");
    
        Carro c1 = new Carro();
        
        c1.setQuilometragem(Double.parseDouble(JOptionPane.showInputDialog("Informe a quilometragem")));
        if (c1.revisao()){
             System.out.println("Preco "+ c1.getPrecoTotal());
        }else{
            System.out.println("Valor invalido");
        }
       
    }
}
