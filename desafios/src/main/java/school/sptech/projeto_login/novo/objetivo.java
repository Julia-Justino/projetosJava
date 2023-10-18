package school.sptech.projeto_login.novo;

import java.io.File;
import java.lang.management.ManagementFactory;
import com.sun.management.OperatingSystemMXBean;

import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.Scanner;

public class objetivo {
    File file = new File("E:\\");
    private List <String> userStorys = new ArrayList<>();
    public void menu(Integer opcao){
        switch (opcao){
            case 1:
                pegarDadosSo();
                break;
            case 2:
                pegarDadosMaquina();
                break;
            case 3:
                Scanner leitor = new Scanner(System.in);
                System.out.println("Nome de quem está solicitando: ");
                String nome = leitor.nextLine();
                System.out.println("Cargo quem está solicitando: ");
                String cargo = leitor.nextLine();
                System.out.println("Desejo quem está solicitando: ");
                String desejo = leitor.nextLine();
                escreverUserStory(nome,cargo,desejo);
                break;
            case 4:
                System.out.println("Então tá! Tchau");
                System.exit(0);
                break;
            default:
                System.out.println("opção inválida");
        }

    }
    public void pegarDadosSo(){
       // System.out.println(System.getProperties());
        String osName = System.getProperty("os.name");
        String osVersion = System.getProperties().getProperty("os.version");
        String computerName = System.getProperties().getProperty("computer.name");
        String userName = System.getProperties().getProperty("user.name");
        String timezone = System.getProperties().getProperty("user.timezone");
        String pais = System.getProperties().getProperty("user.country");
        String userhome = System.getProperties().getProperty("user.home");
        String userlanguage = System.getProperties().getProperty("user.language");
      Properties properties = System.getProperties();
        System.out.println("\n".repeat(2));
        System.out.printf("""
                **************************************************
                                            Principais dados: 
                1) Nome do sistema operacional: %s
                2) Versão do sistema operacional: %s
                3) Localização:  %s , %s
                4) Nome do usuário: %s
                5) Idioma configurado: %s
                6) Diretório do usuário: %s
                ***************************************************
                                            Dados completos
                """, osName,osVersion,timezone,pais,userName,userlanguage, userhome);
                for (Object property : properties.keySet()) {
                    System.out.println(property + ": " + properties.getProperty(String.valueOf(property)));
                }
            Scanner leitor = new Scanner(System.in);
             System.out.println("""
              -----------------------------------------------------------                                       
               |                                      Menu                                      |
               | 2 - Visualizar dados da máquina                             |
               |3- Escrever User Story                                               |
               | 4 - Sair                                                                        |
                ----------------------------------------------------------
                """);
        Integer escolhaUsu = leitor.nextInt();
        menu(escolhaUsu);
    }
    public  void  pegarDadosMaquina(){
        // Obtém os dados da CPU
        OperatingSystemMXBean osBean = (com.sun.management.OperatingSystemMXBean) ManagementFactory.getOperatingSystemMXBean();
        String arch = osBean.getArch();
        double a = osBean.getProcessCpuTime() / Math.pow(10,9);
        Double loadAverage = osBean.getSystemLoadAverage();
        Integer availableProcessors = osBean.getAvailableProcessors();
        Double memoriaLivre = (double) (osBean.getFreeMemorySize() * Math.pow(10,6));
        Double memoriaTotal = (osBean.getTotalMemorySize()* Math.pow(10,6));
        // Obtém os dados da memória RAM usada pelo JVM
        Runtime runtime = Runtime.getRuntime();
        Double totalMemory = (double) runtime.totalMemory();
        Double freeMemory = (double) runtime.freeMemory();
        Double maxMemory = (double) runtime.maxMemory();

        // Obtém os dados do disco
        FileSystem fileSystem = FileSystems.getDefault();
        Double sizeFull =
                new File("C:\\").getUsableSpace() / (1024.0 * 1024 * 1024);

        System.out.printf("""
            **************************************************
                                    Principais dados:
            1) Arquitetura do dispositivo: %s:
            2) Tempo da CPU em segundos:  %.2f
            3) Processadores: %d
            4) Quantidade de memória RAM livre: %.2f
            5) Memória RAM: %.2f
            6) Quantidade de memória disco livre: %.2f
            **************************************************
            """,arch,a, availableProcessors, memoriaLivre,memoriaTotal,sizeFull);

        Scanner leitor = new Scanner(System.in);
        System.out.println("""
                                                     
               -----------------------------------------------------------                                       
               |                                      Menu                                      |
               |1 - Visualizar dados do sistema operacional          |
               |3- Escrever User Story                                                 |
               | 4 - Sair                                                                        |
                ----------------------------------------------------------
                                                     
                """);
        Integer escolhaUsu = leitor.nextInt();
        menu(escolhaUsu);
    }

    public void escreverUserStory(String nome, String cargo, String desejo){
        String userStory = String.format("""
                Eu %s, enquanto %s, quero %s
                """, nome, cargo,desejo);
        userStorys.add(userStory);
        for (String userVez : userStorys){
            System.out.println(userVez);
        }
        Scanner leitor2 = new Scanner(System.in);
        System.out.println("""
                                                     
               ----------------------------------------------------------                                      
                |1 - Visualizar dados do sistema operacional          |
                |2 - Visualizar dados da máquina                              |
                |3- Escrever User Story                                               |
                |4 - Sair                                                                         |
                ----------------------------------------------------------
                                                     
                """);
        Integer escolhaUsu = leitor2.nextInt();
        menu(escolhaUsu);
    }

    public void nomeSo(){
        String osName = System.getProperty("os.name");
        System.out.println(osName);
    }
}
