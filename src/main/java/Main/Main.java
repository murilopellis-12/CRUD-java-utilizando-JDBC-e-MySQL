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

        Modelo modelo = visualizar.juncaoDeDadosDeCadastros();
        controlador.recebimentoDeDadosDeProduto(modelo);

    }
}
