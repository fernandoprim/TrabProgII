import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Teste!");
        Scanner s = new Scanner(System.in);

        //Criando os socios iniciais
        Clube c1 = new Clube("Caça e tiro");
        Socio s1 = new SocioMembro("Cleber", 123, 19, "999888", 225);
        Socio s2 = new SocioPremium("Roberta", 456, 24, "444333", 980);
        Socio s3 = new SocioTemporario("Carlos", 789, 43, "111222", 25);
        Socio s4 = new SocioTemporario("John", 468, 39, "184214520", 25);

        //Adicionando os socios iniciais
        c1.addSocio(s1);
        c1.addSocio(s2);
        c1.addSocio(s3);
        c1.addSocio(s4);

        //Inicializando
        System.out.println("Bem-vindo! Deseja inicializar o sistema? (S/N)");
        String continua = s.next();

        while(!continua.equalsIgnoreCase("S") && !continua.equalsIgnoreCase("N")){
            System.out.println("Resposta invalida, por favor informe S ou N!");
            continua = s.next();
        }

        while(continua.equalsIgnoreCase("S")){
            int opcao = 0;
            System.out.println("Informe a operação que voce deseja realizar: \n" +
                    "1 - Informar a quantidade de sócios no clube. \n" +
                    "2 - Informar a quantidade de sócios por categoria. \n" +
                    "3 - Informar a arrecadação do clube. \n" +
                    "4 - Adicionar um socio ao clube. \n" +
                    "5 - Remover um socio do clube.");

            opcao = s.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("O clube possui atualmente " + c1.informaQntSocios() + " Socios!");
                    break;
                case 2:
                    System.out.println(c1.informaSociosPorCategoria());
                    break;
                case 3:
                    System.out.println(c1.informaArrecadacao());
                    break;
                case 4:
                    System.out.println("Que tipo de socio voce deseja adicionar? (M, P, T)");
                    String tipo = s.next();

                    while(!tipo.equalsIgnoreCase("M") && !tipo.equalsIgnoreCase("P") &&
                            !tipo.equalsIgnoreCase("T")){
                        System.out.println("Tipo de socio nao existe, informe M, P ou T.");
                        tipo = s.next();
                    }

                    System.out.println("Por favor informe o nome do socio (STRING)");
                    String nome = s.next();

                    System.out.println("Por favor informe a matricula do socio (INT)");
                    int matricula;
                    do {
                        matricula = s.nextInt();
                    }while(!c1.validarInfo(matricula));

                    System.out.println("Por favor informe a idade do socio (INT)");
                    int idade = s.nextInt();
                    while(idade <= 0){
                        System.out.println("A idade não pode ser negativa, realize a correção devida.");
                        idade = s.nextInt();
                    }

                    System.out.println("Por favor informe o cpf do socio (STRING)");
                    String cpf="";
                    do {
                        cpf = s.next();
                    }while(!c1.validarInfo(cpf));

                    if(tipo.equalsIgnoreCase("P") ){
                        double anuidade = 980;
                        Socio socio = new SocioPremium(nome, matricula, idade, cpf, anuidade);
                        c1.addSocio(socio);
                        System.out.println("Socio adicionado com sucesso!");
                    } else if (tipo.equalsIgnoreCase("M")) {
                        double mensalidade = 225;
                        Socio socio = new SocioMembro(nome, matricula, idade, cpf, mensalidade);
                        c1.addSocio(socio);
                        System.out.println("Socio adicionado com sucesso!");
                    } else {
                        double diaria = 25;
                        Socio socio = new SocioTemporario(nome, matricula, idade, cpf, diaria);
                        c1.addSocio(socio);
                        System.out.println("Socio adicionado com sucesso!");
                    }
                    break;
                case 5:
                    System.out.println("Por favor informe a matricula do socio a ser removido.");
                    c1.removerSocio(s.nextInt());
                    break;
                default:
                    System.out.println("Operacao invalida");
                    break;
            }

            System.out.println("Deseja realizar outra operacao? (S/N)");
            continua = s.next();
            while(!continua.equalsIgnoreCase("S") && !continua.equalsIgnoreCase("N")){
                System.out.println("Resposta invalida, por favor informe S ou N!");
                continua = s.next();
            }
        }

        System.out.println("Sistema encerrado.");
    }

}
