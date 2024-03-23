public class SocioMembro extends Socio {

    private double mensalidade;

    public SocioMembro(String nome, int idade, String CPF, double mensalidade) {
        super(nome, idade, CPF);
    }

    @Override
    public double calculaArrecadacao() {
        return 0;
    }
}
