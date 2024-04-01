import java.util.ArrayList;
import java.util.Scanner;

public class Clube {

    private String nome;
    private ArrayList<Socio> socios;
    Scanner s = new Scanner(System.in);

    public Clube(String nome){
        this.nome = nome;
        this.socios = new ArrayList<Socio>();
    }

    public boolean validarInfo(String cpf) {
        for(Socio s : socios){
            if(s.getCPF().equalsIgnoreCase(cpf)){
                System.out.println("Insira outro número de CPF, este já foi usado!");
                return false;
            }
        }
        return true;
    }
    public boolean validarInfo(int matricula){
        for(Socio s : socios) {
            if (s.getMatricula() == matricula) {
                System.out.println("Insira outro número de mátricula, este já foi usado!");
                return false;
            }
        }
        return true;
    }

    public String informaSociosPorCategoria(){
        String membro="";
        String premium="";
        String temporario="";
        int qntMembro = 0;
        int qntPremium = 0;
        int qntTemporario = 0;

        for(Socio s : socios){
            if(s instanceof SocioMembro){
                membro += s.toString();
                qntMembro++;
            }else if(s instanceof SocioPremium){
                premium += s.toString();
                qntPremium++;
            }else if(s instanceof SocioTemporario){
                temporario += s.toString();
                qntTemporario++;
            }else{
                System.out.println("O membro não é de nenhuma classe");
            }
        }
        return "\n----- " + qntMembro + " SOCIO(S) MEMBRO(S) -----" +
                membro +
                "\n\n----- " + qntPremium + " SOCIO(S) PREMIUM -----" +
                premium +
                "\n\n----- " + qntTemporario + " SOCIO(S) TEMPORARIOS -----" +
                temporario + "\n";
    }


    public String  informaArrecadacao(){
        double membro=0;
        double premium=0;
        double temporario=0;
        double total=0;

        for(Socio s : socios){
            if(s instanceof SocioMembro){
                membro += 225;
                total += 225;
            }else if(s instanceof SocioPremium){
                premium += 980;
                total += 980;
            }else if(s instanceof SocioTemporario){
                temporario += 25;
                total += 25;
            }else{
                System.out.println("O membro não é de nenhuma classe");
            }
        }
        String s = "\n----- ARRECADAÇÃO MEMBROS -----\n" +
                "A arrecadação com sócios membros foi de: R$" + membro +
                "\n\n----- ARRECADAÇÃO PREMIUM -----\n" +
                "A arrecadação com sócios premium foi de: R$" + premium +
                "\n\n----- ARRECADAÇÃO TEMPORARIOS -----\n" +
                "A arrecadação com sócios temporários foi de: R$" + temporario +
                "\n\n----- ARRECADAÇÃO TOTAL DO CLUBE -----\n" +
                "A arrecadação total do clube foi de: R$" + total + "\n";
        return s;
    }
    public int informaQntSocios() {return socios.size();}

    public boolean removerSocio(int matricula){

        for (int i = 0; i < socios.size(); i++) {
            if(matricula == socios.get(i).getMatricula()){
                System.out.println("Sócio " + socios.get(i).getNome() + " removido com sucesso!");
                socios.remove(i);
                return true;
            }
        }
        System.out.println("Socio nao encontrado. Verifique se informou a matricula correta.");
        return false;
    }

    @Override
    public String toString() {
        String texto = "Clube " + nome;

        for(Socio soc : this.socios){
            texto += soc.toString();
        }

        return texto;
    }
    public void addSocio(Socio socio){
        this.socios.add(socio);
    }
}
