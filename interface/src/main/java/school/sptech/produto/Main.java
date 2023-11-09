package school.sptech.produto;


import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        JdbcTemplate con = new Conexao().getConnection();



        con.execute("""
                CREATE TABLE IF NOT EXISTS produto(
                    id INT PRIMARY KEY AUTO_INCREMENT,
                    tipo VARCHAR(50) NOT NULL, 
                    nome VARCHAR(50) NOT NULL,
                    preco_base DECIMAL NOT NULL,
                    tensao INT, 
                    peso DECIMAL,
                    fabricante VARCHAR(50),
                    tamanho VARCHAR(5),
                    cor VARCHAR(50),
                    white_label BOOLEAN
                );
                """);



        Eletronico e1 = new Eletronico(null, "Gameboy", 57.000,
                110, 0.1, "Nointendo");

        Vestuario v1 = new Vestuario(null, "Camiseta",
                350.5, "M", "Preta", false);

        con.update("""
                INSERT INTO produto (nome,tipo, preco_base, peso, fabricante)
                    VALUES(?,'ELETRONICO',?,?,?);
                ;
                """,e1.getNome(), e1.getPrecoBase(), e1.getPeso(), e1.getFabricante());

        con.update("""
                INSERT INTO produto (nome,tipo, preco_base, tamanho,cor, white_label)
                    VALUES(?,'VESTUARIO',?,?,?,?);
                ;
                """,v1.getNome(), v1.getPrecoBase(), v1.getTamanho(), v1.getCor(), v1.getWhiteLabel());

        List<Produtos> geral = con.query("SELECT * FROM produto", new ProdutoRowMapper());
        System.out.println(geral);


    }
}