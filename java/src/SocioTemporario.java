public class SocioTemporario extends Socio {

    private double diaria;

    public SocioTemporario(String nome, int matricula, int idade, String CPF, double diaria) {
        super(nome, matricula, idade, CPF);
        this.diaria = diaria;
    }

    public boolean setDiaria(int diaria){
        if(diaria > 0){
            this.diaria = diaria;
            return true;
        } else {
            return false;
        }
    }

    public double getDiaria(){
        return this.diaria;
    }

    @Override
    public String toString(){
        return super.toString() +
                "Diaria: " + getDiaria();
    }

}
