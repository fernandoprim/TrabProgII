public abstract class Socio {

    protected String nome;
    protected int idade;
    protected int matricula;
    protected String CPF;

    protected double valorPago;

    public Socio(String nome, int idade, String CPF) {

    }

    @Override
    public String toString() {
        return "Socio{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", matricula=" + matricula +
                ", CPF='" + CPF + '\'' +
                '}';
    }

    public abstract double calculaArrecadacao();

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

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }
}
