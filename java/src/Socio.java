public abstract class Socio {
    protected String nome;
    protected int idade;
    protected int matricula;
    protected String CPF;

    public Socio(String nome, int matricula, int idade, String CPF) {
        this.nome = nome;
        this.matricula = matricula;
        this.idade = idade;
        this.CPF = CPF;
    }

    @Override
    public String toString() {
        return "\n Socio: " + "\n" +
                "Nome: " + nome +
                ", Idade: " + idade +
                ", Matricula: " + matricula +
                ", CPF:" + CPF + ", ";
    }

    public String getNome() {
        return nome;
    }

    public boolean setNome(String nome) {
        if(!nome.isEmpty()){
            this.nome = nome;
            return true;
        } else {
            return false;
        }
    }

    public int getIdade() {
        return idade;
    }

    public boolean setIdade(int idade) {
        if(idade > 0){
            this.idade = idade;
            return true;
        } else {
            return false;
        }
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

    public boolean setCPF(String CPF) {
        if(!CPF.isEmpty()){
            this.CPF = CPF;
            return true;
        } else {
            return false;
        }
    }
}
