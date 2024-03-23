public class SocioTemporario extends Socio {

    private int diasPagos;

    public SocioTemporario(String nome, int idade, String CPF, int diasPagos) {
        super(nome, idade, CPF);

    }


    @Override
    public double calculaArrecadacao() {
        return 0;
    }
}
