package school.sptech;


import school.sptech.produtos.DVD;
import school.sptech.produtos.Livro;

import java.util.Scanner;

public class TestaCarrinho {
    public static void main(String[] args) {
        Scanner leitor = new Scanner( System.in );
        Scanner leitorTexto = new Scanner( System.in );
        Carrinho car = new Carrinho();
        int escolha;
        String resposta;


       do {
           do {
               System.out.println( """
                    1) Adicionar livro,
                    
                    2) Adicionar DVD,
                    
                    3) Adicionar Serviço,
                    
                    4) Exibir itens do carrinho,
                    
                    5) Exibir total de venda
                    
                    6) Fim        \s
                    
                    Digite a opção: \s
                    """ );
               escolha = leitor.nextInt();
           }while (escolha < 0 || escolha >= 6);
           switch (escolha){
               case 1:
                   System.out.println("Digite o código: ");
                   int codigo = leitor.nextInt();

                   System.out.println("Digite o preço de custo: ");
                   double precoCusto = leitor.nextDouble();

                   System.out.println("Digite o nome do livro: ");
                   String nomeLivro = leitorTexto.nextLine();

                   System.out.println("Digite o autor do livro: ");
                   String autorLivro = leitorTexto.nextLine();

                   System.out.println("Digite o isbn");
                   String isbn = leitorTexto.nextLine();

                   Livro livro = new Livro( codigo, precoCusto, nomeLivro, autorLivro, isbn );
                   car.adicionaVendavel( livro );
                   break;
               case 2:
                   System.out.println("Digite o código: ");
                   int codigoDVD = leitor.nextInt();

                   System.out.println("Digite o preço de custo: ");
                   double precoCustoDVD = leitor.nextDouble();

                   System.out.println("Digite o nome do DVD: ");
                   String nomeDVD = leitorTexto.nextLine();

                   System.out.println("Digite o nome da gravadora: ");
                   String nomeGravadora = leitorTexto.nextLine();

                   DVD dvd = new DVD (codigoDVD, precoCustoDVD, nomeDVD, nomeGravadora);
                   car.adicionaVendavel( dvd );
                   break;

               case 3:
                   System.out.println("Digite a descrição do serviço: ");
                   String descricao = leitorTexto.nextLine();

                   System.out.println("Digite o código: ");
                   int codigoServico = leitor.nextInt();

                   System.out.println("Digite a quantidade de horas: ");
                   int horas = leitor.nextInt();

                   System.out.println("Digite o valor por hora: ");
                   double valor = leitor.nextDouble();

                   Servico ser = new Servico( descricao, codigoServico, horas, valor) ;
                   car.adicionaVendavel( ser );
                   break;
               case 4:
                   car.exibeItensCarrinho();
                   break;
               case 5:
                   System.out.println("Valor total da compra R$: "+car.calculaTotalVenda());
                   break;
               default:
           }
           System.out.println("Deseja adicionar mais itens ao Menu? (Sim/Não)");
           resposta = leitorTexto.nextLine();
       }while (resposta.equalsIgnoreCase( "Sim" ));
    }
}