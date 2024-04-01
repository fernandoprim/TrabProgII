public class SocioPremium extends Socio {

    private double anuidade;

    public SocioPremium(String nome, int matricula, int idade, String CPF, double anuidade) {
        super(nome, matricula, idade, CPF);
        this.anuidade = anuidade;
    }

    public boolean setAnuidade(double anuidade){
        if(anuidade == 980){
            this.anuidade = anuidade;
            return true;
        } else {
            return false;
        }
    }

    public double getAnuidade(){
        return this.anuidade;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Anuidade: " + getAnuidade();
    }
}
