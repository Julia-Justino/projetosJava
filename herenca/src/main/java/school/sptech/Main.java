package school.sptech;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Funcionario vendedor = new Vendedor("123456789", "TesteFuncionario", 45.0,10.0);
        Funcionario horista = new Horista("45678912", "teste/horista", 45, 10.0);
        Empresa empresa = new Empresa();

        empresa.adicionaFunc(vendedor);
        empresa.adicionaFunc(horista);
        empresa.exibeTodos();
        empresa.exibeTotalSalario();
    }
}