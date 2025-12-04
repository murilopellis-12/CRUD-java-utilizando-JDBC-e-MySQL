package Model;

public class Modelo {
    private String nome;
    private String fabricante;
    private int quantidade;
    private double preco;

    public Modelo() {
    }
    public Modelo(String nome, String fabricante, int quantidade, double preco) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
