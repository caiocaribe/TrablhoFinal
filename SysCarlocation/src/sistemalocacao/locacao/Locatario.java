
package sistemalocacao.locacao;

public class Locatario {
    private String nome;
    private int idade;
    private boolean habilitacaob;
    private int diascontrato;
    private double valorpagar;
    private CarroLocacao carroalugado;
    private int diasmao;
    private boolean autorizado;
    private double multa;
    private String tevemulta;

    public String getTevemulta() {
        return tevemulta;
    }

    public void setTevemulta(String tevemulta) {
        this.tevemulta = tevemulta;
    }

    
    
    public double getMulta() {
        return multa;
    }

   
    public void setMulta(double multa) {
        this.multa = multa;
    }

    
    public Locatario (){
        this.carroalugado = new CarroLocacao();
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public boolean isHabilitacaob() {
        return habilitacaob;
    }

    public void setHabilitacaob(boolean habilitacaob) {
        this.habilitacaob = habilitacaob;
    }

    public int getDiascontrato() {
        return diascontrato;
    }

    public void setDiascontrato(int diascontrato) {
        this.diascontrato = diascontrato;
    }

    public double getValorpagar() {
        return valorpagar;
    }

    public void setValorpagar(double valorpagar) {
        this.valorpagar = valorpagar;
    }

    public CarroLocacao getCarroalugado() {
        return carroalugado;
    }

    public void setCarroalugado(CarroLocacao carroalugado) {
        this.carroalugado = carroalugado;
    }

    public int getDiasmao() {
        return diasmao;
    }

    public void setDiasmao(int diasmao) {
        this.diasmao = diasmao;
    }

    public boolean isAutorizado() {
        return autorizado;
    }

    public void setAutorizado(boolean autorizado) {
        this.autorizado = autorizado;
    }    
    
  public void validarlocatario(){
      if(this.idade >=18 && this.habilitacaob == true){
          this.autorizado = true;
      }
      else if(this.idade <18 && this.habilitacaob == true){
          this.autorizado = false;
      }
      else if(this.idade<18 && this.habilitacaob !=true){
          this.autorizado = false;
        }
      else if(this.idade >=18 && this.habilitacaob!=true){
          this.autorizado = false;
      }
  }
    
    public void alugar(CarroLocacao carro){
       
                if(this.getDiascontrato() - this.getDiasmao() == 0){
                    this.setValorpagar(carro.getPrecodia()*this.getDiascontrato());
                    this.setTevemulta("NÃO HOUVE MULTA");
                }
                else{
                    this.setTevemulta("PAGAMENTO COM MULTA,ULTRAPASSOU DIAS CONTRATADOS");
                    int diasmulta = this.getDiasmao()-this.getDiascontrato();
                    this.setMulta(carro.getMultadia()*diasmulta);
                    this.setValorpagar(carro.getMultadia()*diasmulta + carro.getPrecodia()*this.getDiascontrato());    
                }
                           
    }


       
     
}
