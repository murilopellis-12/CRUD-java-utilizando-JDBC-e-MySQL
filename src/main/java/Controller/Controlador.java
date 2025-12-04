package Controller;

import Model.Modelo;
import Services.Servico;

public class Controlador {
    private Servico servico = new Servico();

    public void recebimentoDeDadosDeProduto(Modelo modelo){
        /*Poderia ser lançado uma exceção caso algum destes casos
        fossem verdadeiros, lançando a mesma para a view ou main*/

        if(modelo.getPreco() < 0){
            System.out.println("Preço colocado é inválido, tente colocar um valor positivo!");
            return;
        }
        if(modelo.getNome().isEmpty()){
            System.out.println("O nome colocado é ilegal, corrija-o!");
            return;
        }
        if(modelo.getFabricante().isEmpty()){
            System.out.println("O nome da fabricante colocado é ilegal, corrija-o!");
            return;
        }
        if(modelo.getQuantidade() < 0){
            System.out.println("A quantidade alocada é inválida, corrija!");
            return;
        }
        servico.salvarModeloDoControlador(modelo);
    }
}
