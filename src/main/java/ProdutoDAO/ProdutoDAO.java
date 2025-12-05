package ProdutoDAO;

import ConnectionFactory.Conexao;
import Model.Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//Mandar a view exibir os erros e o resto
public class ProdutoDAO {

    public void cadastrarProduto(Modelo modelo){
        try{
            /*Verificação se a conexão esta aberta ou não*/

            Connection conn = Conexao.conexao();

            String sql = "insert into produtos (nome,fabricante,quantidade,preco) values (?,?,?,?)";
            PreparedStatement stmt = conn.prepareStatement(sql);

            String nomeProduto = modelo.getNome();
            String nomeFabricante = modelo.getFabricante();
            int quantidadeDoProdutoEmEstoque = modelo.getQuantidade();
            double precoDoProduto = modelo.getPreco();

            stmt.setString(1,nomeProduto);
            stmt.setString(2,nomeFabricante);
            stmt.setInt(3,quantidadeDoProdutoEmEstoque);
            stmt.setDouble(4,precoDoProduto);

            stmt.execute();

            System.out.println("Produto cadastrado");
            Conexao.encerrarConexao();

        }catch(SQLException e){
            System.out.println(e);
        }
    }
    public void listarTodosOsProdutos(){
        try {
            Connection conn = Conexao.conexao();

            String sql = "select * from produtos";
            PreparedStatement stmt = conn.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("---------");
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Fabricante: " + rs.getString("fabricante"));
                System.out.println("Quantidade: " + rs.getInt("quantidade"));
                System.out.println("Preço: " + rs.getDouble("preco"));
                System.out.println("---------");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}
