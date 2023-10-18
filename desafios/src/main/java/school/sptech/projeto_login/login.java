package school.sptech.projeto_login;

import java.util.ArrayList;
import java.util.List;

public class login {
    List<String> NomeCadastrada = new ArrayList<String>();
    List<String> EmailCadastrada = new ArrayList<String>();
    List<String> SenhaCadastrada = new ArrayList<String>();
    List<String> total = new ArrayList<String>();
    String cadastrar (String nomePessoa, String emailPessoa, String senhaPessoa){
        NomeCadastrada.add(nomePessoa);
        EmailCadastrada.add(emailPessoa);
        SenhaCadastrada.add(senhaPessoa);
        String mensagem = "Sucesso";
       total.addAll(NomeCadastrada) ;
        total.addAll(EmailCadastrada) ;
        total.addAll(SenhaCadastrada) ;
        return mensagem;
    }
    void  login (String nomePessoa, String emailPessoa, String senhaPessoa){
        boolean encontrada = false;
        for(String emailConfirmado : total){
            if (emailConfirmado.equalsIgnoreCase(emailPessoa)){
                encontrada = true;
                System.out.println("Entrando");
                entrou();
                break;
            }else {
                System.out.println("Conta não encontrada");
            }
        }


        }
    void entrou(){
        System.out.println("VocÊ entrou");

    }
    void resultado(){
        System.out.println(total);
    }

}
