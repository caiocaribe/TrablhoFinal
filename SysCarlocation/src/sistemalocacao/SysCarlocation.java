package sistemalocacao;

import javax.swing.JOptionPane;
import sistemalocacao.locacao.Menulocacao;
import sistemalocacao.revisao.Menurevisao;

public class SysCarlocation {

    public static void main(String[] args) {
       
        Menulocacao menuloc = new Menulocacao();
        Menurevisao menurev = new Menurevisao();
       
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
