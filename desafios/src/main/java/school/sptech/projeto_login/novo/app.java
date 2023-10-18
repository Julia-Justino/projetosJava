package school.sptech.projeto_login.novo;

import java.util.Scanner;


public class app {
    public static void main(String[] args) {
        CadLogin cadastro = new CadLogin();
        Scanner leitor = new Scanner(System.in);
        System.out.println("***********************Cadastro***********************");
        System.out.println("Digite seu nome de usuário: ");
        String nome = leitor.nextLine();
        System.out.println("Digite sua senha: ");
        String senha = leitor.nextLine();
        cadastro.cadastrar(new dadosUsuarios(nome ,senha));
        //******************************Sistema para logar***********************
        System.out.println("***********************Login***********************");
        String resposta = null;
        do {

            System.out.println("Digite seu nome de usuário: ");
            String nomeLogin = leitor.nextLine();
            System.out.println("Digite sua senha: ");
            String senhaLogin = leitor.nextLine();
            cadastro.logar(new dadosUsuarios(nomeLogin, senhaLogin));
            Scanner visu = new Scanner(System.in);
            System.out.println("Quer tentar novamente? [S/N]");
            resposta = visu.nextLine();
        }while (resposta.equalsIgnoreCase("S"));




        //cadastro.informacoes();
    }
}
