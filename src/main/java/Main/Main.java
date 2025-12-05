package Main;

import Controller.Controlador;
import Model.Modelo;
import ProdutoDAO.ProdutoDAO;
import Services.Servico;
import View.Visualizar;

public class Main {
    public static void main(String[] args) {

        Visualizar visualizar = new Visualizar();
        Controlador controlador = new Controlador();
        Servico servico = new Servico();

        String opcaoEscolhida = visualizar.menuDeCadastro();


            if(opcaoEscolhida.equalsIgnoreCase("CADASTRAR")){
                Modelo modelo = visualizar.juncaoDeDadosDeCadastros();
                controlador.recebimentoDeDadosDeProduto(modelo);
            }
            else if(opcaoEscolhida.equalsIgnoreCase("LISTAR")){
                controlador.listarProdutos();
            }


    }
}









