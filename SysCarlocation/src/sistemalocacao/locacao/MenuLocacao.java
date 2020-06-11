
package sistemalocacao.locacao;

import javax.swing.JOptionPane;
import sistemalocacao.revisao.MenuRevisao;


public class MenuLocacao {
     public void rodarmenulocacao(){
     
         MenuLocacao menuloc = new MenuLocacao();
         MenuRevisao menurev = new MenuRevisao();
        JOptionPane.showMessageDialog(null, "BEM VINDO AO SISTEMA DE LOCAÇÃO ");
        
        CarroLocacao carroalugado = new CarroLocacao();   
        Unidade unid1 = new Unidade();
        unid1.setNome(JOptionPane.showInputDialog("DIGITE O NOME DA UNIDADE DA LOCADORA: "));
        unid1.setLocalizacao(JOptionPane.showInputDialog("DIGITE A LOCALIZAÇÃO: "));


        Locatario loc1 = new Locatario();

        loc1.setNome(JOptionPane.showInputDialog("DIGITE O NOME DO LOCATÁRIO: "));
        loc1.setIdade(Integer.parseInt(JOptionPane.showInputDialog("DIGITE A IDADE: ")));
        String habilitacao = JOptionPane.showInputDialog("TEM HABILITACAO B?  1 -SIM   OU   2 - NAO");

        if(habilitacao.equals("1")){
            loc1.setHabilitacaob(true);
        }
        else if(habilitacao.equals("2")){
            loc1.setHabilitacaob(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "DIGITE APENAS 1 OU 2");
        }

        loc1.validarlocatario();

        if(loc1.isAutorizado()== true){
        loc1.setDiascontrato(Integer.parseInt(JOptionPane.showInputDialog("QUANTOS DIAS DE ALUGUEL CONTRATADO? ")));
        loc1.setDiasmao(Integer.parseInt(JOptionPane.showInputDialog("QUANTOS DIAS O LOCATARIO FICOU COM O CARRO? ")));
        carroalugado.setModelo(JOptionPane.showInputDialog("QUAL O MODELO DO CARRO ALUGADO? "));
        carroalugado.setMarca(JOptionPane.showInputDialog("QUAL  A MARCA? "));
        carroalugado.setMultadia(Double.parseDouble(JOptionPane.showInputDialog("QUAL O VALOR DA MULTA POR DIA? ")));
        carroalugado.setPrecodia(Double.parseDouble(JOptionPane.showInputDialog("QUAL O VALOR DO ALUGUEL POR DIA? ")));
        loc1.alugar(carroalugado);
        unid1.addLocatario(loc1);
         JOptionPane.showMessageDialog(null,"FICHA DE DADOS E VALORES \n\n\n NOME LOCADORA:  "+unid1.getNome()+"\n\n LOCALIZAÇÃO DA UNIDADE:  "+unid1.getLocalizacao()+"\n\nNOME LOCATÁRIO:  "+loc1.getNome()+"\n\nCARRO ALUGADO:  "+carroalugado.getMarca()+" - "+carroalugado.getModelo()+"\n\nDIAS CONTRATADOS:  "+loc1.getDiascontrato()+"\n\n DIAS COM CARRO NA MÃO:  "+loc1.getDiasmao()+"\n\n"+loc1.getTevemulta()+"\n\nVALOR A PAGAR:  "+loc1.getValorpagar()+"\n\n");

        }
        else{
              JOptionPane.showMessageDialog(null, "LOCATÁRIO NAO CUMPRE REQUISITOS");

        }

     int escolha = Integer.parseInt(JOptionPane.showInputDialog("DIGITE 1 PARA IR PARA O MENU DE REVISÃO \n DIGITE 2 PARA RECADASTRAR \n DIGITE 3 PARA SAIR"));
        if(escolha == 1){
            menurev.rodarmenurevisao();
    }else if (escolha == 2){
            menuloc.rodarmenulocacao();
        }else{
        JOptionPane.showMessageDialog(null, "LOGOFF FEITO COM SUCESSO");
    }
    }
     
     
    
}
