package school.sptech.lista_introducao_poo.Empregado;

public class TesteEmpregado {
    public static void main(String[] args) {
        Empregado empregado01 = new Empregado();
        empregado01.nome = "João";
        empregado01.cargo = "Analista de sistemas";
        empregado01.salario = 5.400;
        empregado01.reajusteSalario(15.0);
        empregado01.imprimirDados();
        // Segundo
        Empregado empregado02 = new Empregado();
        empregado02.nome = "Julia";
        empregado02.cargo = "Desenvolvedor(a)";
        empregado02.salario = 5.845;
        empregado02.reajusteSalario(50.0);
        empregado02.imprimirDados();
    }
}
