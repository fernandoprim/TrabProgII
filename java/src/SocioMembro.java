public class SocioMembro extends Socio {

    private double mensalidade;

    public SocioMembro(String nome, int matricula, int idade, String CPF, double mensalidade) {
        super(nome, matricula, idade, CPF);
        this.mensalidade = mensalidade;
    }

    public boolean setMensalidade(double mensalidade){
        if(mensalidade == 225){
            this.mensalidade = mensalidade;
            return true;
        } else {
            return false;
        }
    }

    public double getMensalidade(){
        return this.mensalidade;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Mensalidade: " + getMensalidade();
    }

}
