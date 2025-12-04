package View;

import Model.Modelo;

import java.util.Scanner;

public class Visualizar {
    Scanner sc;

    public Visualizar(){
        sc = new Scanner(System.in);
    }

    public Modelo juncaoDeDadosDeCadastros(){
        String nomeProduto = nomeProduto();
        String fabricanteDoProduto = fabricanteProduto();
        int quantidadeEmEstoque = quantidadeEmEstoqueDoProduto();
        double precoDoProduto = precoProduto();

        Modelo modelo = new Modelo(nomeProduto,fabricanteDoProduto,quantidadeEmEstoque,precoDoProduto);

        return modelo;
    }
    public String nomeProduto(){
        System.out.println("Qual o nome do produto que você deseja cadastrar?");
        return sc.nextLine();
    }
    public String fabricanteProduto(){
        System.out.println("Qual a fabricante deste Produto?");
        return sc.nextLine();
    }
    public int quantidadeEmEstoqueDoProduto(){
        System.out.println("Qual a quantidade em estoque deste determinado produto?");
        return sc.nextInt();
    }
    public double precoProduto(){
        System.out.println("Qual o preço do produto?");
        return sc.nextDouble();
    }

}
