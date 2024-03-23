public class SocioPremium extends Socio {

    private double anuidade;

    public SocioPremium(String nome, int idade, String CPF, double anuidade) {
        super(nome, idade, CPF);
    }

    @Override
    public double calculaArrecadacao() {
        return 0;
    }
}
