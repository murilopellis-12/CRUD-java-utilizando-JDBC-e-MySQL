package Services;

import Model.Modelo;
import ProdutoDAO.ProdutoDAO;

public class Servico {

    private ProdutoDAO produto = new ProdutoDAO();

    public void salvarModeloDoControlador(Modelo modelo){
        /*Pode ser feito a verificação do dado antes de enviar para o Dao,
        criando um método no próprio Produto, que verifique se determinado item já foi
        cadastrado ou não.
         */
        produto.cadastrarProduto(modelo);
    }
    public void salvarPedidoDeListarTudo(){
        produto.listarTodosOsProdutos();
    }

}
