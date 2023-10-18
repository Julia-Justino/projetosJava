package school.sptech.listaDois;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Cofre cofrinho = new Cofre();
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);


        System.out.println("Qual o seu objetivo? ");
        String objetivo = leitor.nextLine();
        System.out.println("Qual o valor do depósito?");
        Double depo = leitorNum.nextDouble();


        System.out.println("-".repeat(50));
        cofrinho.meta = objetivo;
        System.out.println(objetivo);
        cofrinho.depositar(depo);
        cofrinho.agitar();
        cofrinho.quebrar();
        cofrinho.depositar(500.00);
        System.out.println("-".repeat(50));
    }
}

