package school.sptech.projeto_login;

public class main {
    public static void main(String[] args) {
        login login1 = new login();
        login login2 = new login();
        login1.cadastrar("Julia", "justinostephany490@gmail.com", "123456");
        login1.login("Julia", "justinostephany490@gmail.com", "123456");
        login1.cadastrar("Amanda", "jsjdsjdjsdjs@dfdfjdfjdjf", "123");
        login1.login("Amanda", "jsjdsjdjsdjs@dfdfjdfjdjf", "123");
        login1.resultado();
    }
}
