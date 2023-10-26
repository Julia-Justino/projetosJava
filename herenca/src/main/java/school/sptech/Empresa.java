package school.sptech;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Empresa {
    List<Funcionario>funcionarios;

    public Empresa() {
        this.funcionarios = new ArrayList<>();
    }

    public void adicionaFunc(Funcionario fun){
        Boolean achou = false;
        if (Objects.nonNull(fun)){
            for (Funcionario funVez : funcionarios){
                if (fun.equals(funVez)){
                    achou = true;
                }
            }
        }
        if (!achou){
            funcionarios.add(fun);
        }
        System.out.println("Funcionario cadastrado");
    }

    public void exibeTodos(){
        for (Funcionario fun : funcionarios){
            System.out.println(fun);
        }
    }

    public void exibeTotalSalario(){
        Double total = 0.0;
        for (Funcionario fun : funcionarios){
            total += fun.calcSalario();
        }
        System.out.println(total);
    }


}
