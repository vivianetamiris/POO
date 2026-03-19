public class Produto {

    private String nome;
    private String categoria;
    private double preco;
    public Produto() {
    }

    // Construtor com 2 parâmetros
    public Produto(String nome, String categoria) {
        this.nome = nome;
        this.categoria = categoria;
    }

    // Construtor com 1 parâmetro 
    public Produto(double preco) {
        this.preco = preco;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public String getCategoria() {
        return categoria;
    }

    public double getPreco() {
        return preco;
    }
}