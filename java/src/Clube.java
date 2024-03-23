public class Clube {

private String nome;

public Clube(String nome){

}

    public String informaSociosPorCategoria(){
        return "";
    }

    public String informaArrecadacao(){
        return "";
    }

    public boolean removerSocio(int matricula){
        return false;
    }


    @Override
    public String toString() {
        return "Clube{" +
                "nome='" + nome + '\'' +
                '}';
    }
}
