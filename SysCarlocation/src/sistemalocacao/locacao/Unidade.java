
package sistemalocacao.locacao;

import java.util.ArrayList;

public class Unidade {
    
    private String nome;
    private String localizacao;
    private ArrayList<Locatario> locatarios = new ArrayList<>();

    public Unidade (){
        this.locatarios = new ArrayList<>();
    }
    
    void addLocatario(Locatario locatario){
        this.locatarios.add(locatario);
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public ArrayList<Locatario> getLocatarios() {
        return locatarios;
    }

    public void setLocatarios(ArrayList<Locatario> locatarios) {
        this.locatarios = locatarios;
    }
    
    
    
}
