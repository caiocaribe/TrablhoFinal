package sistemalocacao;

import javax.swing.JOptionPane;
import sistemalocacao.locacao.MenuLocacao;
import sistemalocacao.revisao.MenuRevisao;

public class SysCarLocation {

    public static void main(String[] args) {
        
            
        
        MenuLocacao menuloc = new MenuLocacao();
        MenuRevisao menurev = new MenuRevisao();
       
        int escolha = Integer.parseInt(JOptionPane.showInputDialog("------ BEM VINDO ------\n\nSELECIONE QUAL SISTEMA ENTRAR:\n\nSISTEMA DE LOCAÇÃO DIGITE 1\n\nSISTEMA DE REVISÃO DIGITE 2\n"));
        
        if (escolha == 1){
            menuloc.rodarmenulocacao();
        }
        else if (escolha == 2){
             menurev.rodarmenurevisao();
        }
        else{
             JOptionPane.showMessageDialog(null, "DGITE APENAS 1 OU 2");
        }
        
       } 
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    

