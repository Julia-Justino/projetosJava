package school.sptech.projeto_login.novo;

public class dadosUsuarios {
    private String nomeUsu;

    private String senhaUsu;

    public dadosUsuarios(String nomeUsu,  String senhaUsu) {
        this.nomeUsu = nomeUsu;
        this.senhaUsu = senhaUsu;
    }

    public String getNomeUsu() {
        return nomeUsu;
    }

    public void setNomeUsu(String nomeUsu) {
        this.nomeUsu = nomeUsu;
    }

    public String getSenhaUsu() {
        return senhaUsu;
    }

    public void setSenhaUsu(String senhaUsu) {
        this.senhaUsu = senhaUsu;
    }
    public String exibirInformacoes() {
        return String.format("""
                        Nome: %s ,
                        Senha: %s
                         _____________________________________________________________________""",
               nomeUsu,senhaUsu);
    }
}
