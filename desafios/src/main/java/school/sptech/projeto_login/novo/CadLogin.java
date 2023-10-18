package school.sptech.projeto_login.novo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CadLogin {
    private List<dadosUsuarios> cad;
    private List<dadosUsuarios> login;
    public CadLogin(){
        cad = new ArrayList<>();
        login = new ArrayList<>();
    }

    public void cadastrar(dadosUsuarios dados){
        cad.add(new dadosUsuarios("JuliaAdmin" ,"urubu10000"));
        cad.add(new dadosUsuarios("Juliadmin" ,"urubu100"));
        cad.add(new dadosUsuarios("JuAdmin" ,"urubu"));
        cad.add(dados);
    }

    public void logar(dadosUsuarios dadosLogin){
        Boolean dadoEncontrado = false;
        login.add(dadosLogin);

        for(dadosUsuarios dados : cad){
            if (dadosLogin.getNomeUsu().equals(dados.getNomeUsu()) && dadosLogin.getSenhaUsu().equals(dados.getSenhaUsu())){
                dadoEncontrado = true;
                break;
            }
        }
        if (dadoEncontrado){
            System.out.println("\n".repeat(30));
            System.out.println("Seja bem - vindo (a)! " + dadosLogin.getNomeUsu());
            Scanner leitor = new Scanner(System.in);
            System.out.println("""
                ----------------------------------------------------------------
                |Escolha funcionalidade adequada para sua análise!      |                              
                |1 - Visualizar dados do sistema operacional                  |
                |2 - Visualizar dados da máquina                                     |
                |3- Escrever User Story                                                     |
                |4 - Sair                                                                                |
                ----------------------------------------------------------------
                """);
            Integer escolhaUsu = leitor.nextInt();
            teste(escolhaUsu);
        }else {
            System.out.println("Acesso negado");
        }
    }
    public void teste(Integer opcao){
       objetivo testar = new objetivo();
       testar.menu(opcao);
    }

    public void informacoes(){
        for(dadosUsuarios dados : cad){
            System.out.println(dados.exibirInformacoes());
        }
        for(dadosUsuarios dados : login){
            System.out.println("Dados login "+ dados.exibirInformacoes());
        }
    }
}
