package ConnectionFactory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    private static final String URL = "jdbc:mysql://localhost:3306/techparts_db";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    private static Connection conn = null;

    public static Connection conexao(){

        try{
            if(conn == null) {
                conn = DriverManager.getConnection(URL, USUARIO, SENHA);
                System.out.println("Conexão bem sucedida");
                return conn;
            }
            else {
                return conn;
            }
        }
        catch (SQLException e){
            System.out.println(e);
            return null;
        }
    }
    public static void encerrarConexao(){
        try {
            if (conn != null) {
                conn.close();
                System.out.println("Conexão fechada com sucesso!");
            }
            else{
                System.out.println("Conexão já fechada!");
            }
        }catch(SQLException e){
            System.out.println(e);
        }
    }
}
