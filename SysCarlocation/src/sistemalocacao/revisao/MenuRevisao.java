package sistemalocacao.revisao;

import javax.swing.JOptionPane;
import sistemalocacao.SysCarLocation;
import sistemalocacao.locacao.MenuLocacao;

public class MenuRevisao {
    public void rodarmenurevisao(){
        
        MenuLocacao menuloc = new MenuLocacao();
        MenuRevisao menurev = new MenuRevisao();
        
        JOptionPane.showMessageDialog(null, "BEM VINDO AO SISTEMA DE REVISÃO");
    
        Carro c1 = new Carro();
        Dono d1 = new Dono();
        d1.setNome(JOptionPane.showInputDialog("Digite o nome do dono"));
        d1.setCpf(JOptionPane.showInputDialog("Digite o CPF do dono"));
        c1.setDono(d1);
        c1.setQuilometragem(Double.parseDouble(JOptionPane.showInputDialog("Digite a quilometragem do carro")));
        if (c1.revisao()){
             JOptionPane.showMessageDialog(null, "FICHA DE DADOS E VALORES \n\n NOME: "+c1.getDono().getNome() + "\n\n CPF: " +c1.getDono().getCpf() + "\n\n VALOR DO SERVIÇO: " +c1.getPrecoTotal());
        }else{
            JOptionPane.showMessageDialog(null, "QUILOMETRAGEM INVÁLIDA");
        }
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("DIGITE 1 PARA IR PARA O MENU DE LOCAÇÃO \n DIGITE 2 PARA RECADASTRAR \n DIGITE 3 PARA SAIR"));
        if(escolha == 1){
            menuloc.rodarmenulocacao();
    }else if (escolha == 2){
            menurev.rodarmenurevisao();
        }else{
        JOptionPane.showMessageDialog(null, "LOGOFF FEITO COM SUCESSO");
    }
    }
}
