package school.sptech.lista_introducao_poo.Empregado;

public class Empregado {
    String nome;
    String cargo;
    Double salario =  0.0;
Double reajusteSalario (Double porcentagemReajuste){
        Double taxa = salario * (porcentagemReajuste/100);
        salario = salario + taxa;
        return  salario;
    }
    void imprimirDados(){
        System.out.printf("""
                ______________________________________________
                Nome: %s
                Cargo: %s
                Salário reajustado: %.5f
                """,nome,cargo,salario);
    }
}
