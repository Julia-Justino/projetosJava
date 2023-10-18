package school.sptech.listaDois;

        import java.util.Scanner;
        import java.util.concurrent.ThreadLocalRandom;

public class Cofre {
    String meta = "";
    Boolean quebrado = false;
    Double total=null;

    void depositar(Double quantia){
        if (quebrado){
            System.out.println("O cofre está quebrado,não é possível realizar essa operação");
        }else {
            total = +quantia;
            System.out.println("O valor foi depositado com sucesso sua conta tem o valor de R$: " +total);
        }
    }
    void agitar(){
        if (quebrado) {
            System.out.println("O cofre está quebrado, não é possível agitar ele");
        }else if (total <= 0) {
            System.out.println("Nenhuma moeda caiu, o cofre está vazio");
        }else {
            Double aleatorio = ThreadLocalRandom.current().nextDouble(0,total);
            total = total - aleatorio;
            System.out.printf("Ao agitar o cofre caiu R$: %.2f, agora o total é R$: %.2f \n", aleatorio, total);
        }
    }
    void quebrar(){
        quebrado = true;
        System.out.printf("Após quebrar o cofre você pegou cerca de R$: %.2f \n", total);
    }
}

